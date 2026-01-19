package tn.smi.gen.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;
import tn.smi.gen.entities.DocumentsEntity;
import tn.smi.gen.services.DocumentsService;
import tn.smi.refproject.DTO.AccordBctRequest;
import tn.smi.refproject.entities.AccordBctEntity;
import tn.smi.refproject.entities.AccordBctEntityPK;

import java.util.List;

@RestController
@RequestMapping("/documents")
public class DocumentController {

    private final RestTemplate restTemplate;
    private final DocumentsService documentService;
    private final ObjectMapper objectMapper;
    private static final Logger log = LoggerFactory.getLogger(DocumentController.class);

    @Autowired
    public DocumentController(RestTemplate restTemplate, DocumentsService documentService) {
        this.restTemplate = restTemplate;
        this.documentService = documentService;
        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new JavaTimeModule());
    }

    @PostMapping(value = "/uploadAndSave", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<String> uploadAndSaveDocuments(
            @RequestParam("files") MultipartFile[] files,
            @RequestParam("accordData") String accordDataJson) {

        if (files == null || files.length == 0) {
            return ResponseEntity.badRequest().body("Aucun fichier à télécharger.");
        }

        try {
            // Call the API to create the Accord BCT with POST method
            String createAccordUrl = "http://localhost:8092/api/v1/ref/AccordBct/create";
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            HttpEntity<String> entity = new HttpEntity<>(accordDataJson, headers);

            // Use POST request to create the Accord
            ResponseEntity<AccordBctEntity> response = restTemplate.exchange(createAccordUrl, HttpMethod.POST, entity, AccordBctEntity.class);

            if (response.getBody() == null) {
                return ResponseEntity.badRequest().body("Erreur lors de la création de l'accord");
            }

            AccordBctEntity accord = response.getBody();
            AccordBctRequest accordBctRequest = objectMapper.readValue(accordDataJson, AccordBctRequest.class);
            log.info("Received Accord Data: {}", accordBctRequest);

            // Validate `typeAccordBct`
            if (accordBctRequest.getTypeAccordBct() == null) {
                return ResponseEntity.badRequest().body("Le champ 'typeAccordBct' est obligatoire.");
            }

            // Create AccordBctEntityPK
            AccordBctEntityPK pk = new AccordBctEntityPK(
                    accordBctRequest.getTypeAccordBct(),
                    accordBctRequest.getNumAccordBct(),
                    accordBctRequest.getDateAccordBct()
            );

            // Create the AccordBctEntity
            AccordBctEntity accordBctEntity = new AccordBctEntity(pk,
                    accordBctRequest.getTypePieceClient(),
                    accordBctRequest.getNoPieceClient(),
                    accordBctRequest.getDateDebApplication(),
                    accordBctRequest.getDateFinApplication(),
                    accordBctRequest.getObservation(),
                    accordBctRequest.getNumContratCom(),
                    accordBctRequest.getDateContratCom(),
                    accordBctRequest.getSens(),
                    accordBctRequest.getEtat()
            );

            // Log the AccordBctEntity before calling the API
            log.info("Creating Accord BCT with entity: {}", accordBctEntity);

            // Process each file and save using the service
            for (MultipartFile file : files) {
                if (!file.isEmpty()) {
                    documentService.saveDocument(file, accord);
                }
            }

            return ResponseEntity.ok("Fichiers uploadés et sauvegardés en base avec succès.");
        } catch (Exception e) {
            log.error("Erreur lors du traitement: ", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erreur lors du traitement: " + e.getMessage());
        }
    }
    // In DocumentController.java
    @GetMapping("/getDocumentsByNumDossier")
    public ResponseEntity<List<DocumentsEntity>> getDocumentsByNumDossier(
            @RequestParam("numDossier") Integer numDossier) {
        try {
            // Fetch the documents from the service
            List<DocumentsEntity> documents = documentService.getDocumentsByNumDossier(numDossier);

            if (documents.isEmpty()) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null); // No documents found
            }

            return ResponseEntity.ok(documents);
        } catch (Exception e) {
            log.error("Error retrieving documents by numDossier: {}", numDossier, e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

}

