package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import tn.smi.refproject.DTO.AccordBctRequest;
import tn.smi.refproject.entities.AccordBctEntity;
import tn.smi.refproject.entities.AccordBctEntityPK;
import tn.smi.refproject.entities.enumeration.TypeAccordBct;
import tn.smi.refproject.repository.AccordBctRepository;
import tn.smi.refproject.services.Interface.IAccordBctService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/AccordBct")
public class AccordBctController {
    private static final Logger log = LoggerFactory.getLogger(AccordBctController.class);
    private IAccordBctService iAccordBctService;
    @Autowired
    private AccordBctRepository accordBctRepository;
    @GetMapping("/get/{typeAccordBct}/{numAccordBct}")
    public AccordBctEntity getAccordBctById(@PathVariable TypeAccordBct typeAccordBct, @PathVariable Long numAccordBct) {
        AccordBctEntityPK id = new AccordBctEntityPK(typeAccordBct, numAccordBct, LocalDate.now());
        return iAccordBctService.getAccordBctById(id);
    }

    @GetMapping("/all")
    public List<AccordBctEntity> getAccords() {
        return iAccordBctService.getAccords();
    }

    @GetMapping("/allnumaccordbct/{typeAccordBct}")
    public List<Long> getNumAccordBct(@PathVariable TypeAccordBct typeAccordBct) {
        return iAccordBctService.getNumAccordBct(typeAccordBct);
    }

    @GetMapping("/alldateaccordbct/{typeAccordBct}")
    public List<LocalDate> getDateAccordBct(@PathVariable TypeAccordBct typeAccordBct) {
        return iAccordBctService.getDateAccordBct(typeAccordBct);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<?> createAccord(@RequestBody AccordBctRequest request) {
        try {
            log.info("Received Accord BCT request: {}", request);
            System.out.println("Received Accord Data: {}" + request);
            AccordBctEntity entity = new AccordBctEntity();

            // Map request fields to entity
            entity.setNoPieceClient(request.getNoPieceClient());
            entity.setTypePieceClient(request.getTypePieceClient());
            entity.setDateDebApplication(request.getDateDebApplication());
            entity.setDateFinApplication(request.getDateFinApplication());
            entity.setObservation(request.getObservation());
            entity.setNumContratCom(request.getNumContratCom());
            entity.setDateContratCom(request.getDateContratCom());
            entity.setSens(request.getSens());
            entity.setEtat(request.getEtat());

            // Map embedded ID fields
            AccordBctEntityPK pk = new AccordBctEntityPK();
            pk.setTypeAccordBct(request.getTypeAccordBct());
            pk.setNumAccordBct(request.getNumAccordBct());
            pk.setDateAccordBct(request.getDateAccordBct());
            entity.setAccordBctEntityPK(pk);

            // Save the entity in the repository
            AccordBctEntity savedEntity = accordBctRepository.save(entity);
            log.info("Saved Accord BCT entity: {}", savedEntity);

            return new ResponseEntity<>(savedEntity, HttpStatus.OK);
        } catch (Exception e) {
            log.error("Error creating Accord BCT: {}", e.getMessage(), e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error creating Accord BCT: " + e.getMessage());
        }
    }



    @GetMapping("/detailaccordbct/{typeAccordBct}/{numAccordBct}/{dateAccordBct}")
    public ResponseEntity<AccordBctEntity> getAccordByDetails(
            @PathVariable TypeAccordBct typeAccordBct,
            @PathVariable Long numAccordBct,
            @PathVariable LocalDate dateAccordBct) {

        // Construct the embedded ID for the AccordBctEntity
        AccordBctEntityPK id = new AccordBctEntityPK(typeAccordBct, numAccordBct, dateAccordBct);

        // Retrieve the AccordBctEntity using the service
        AccordBctEntity accord = iAccordBctService.getAccordBctById(id);

        if (accord != null) {
            return ResponseEntity.ok(accord);
        } else {
            return ResponseEntity.status(404).body(null);
        }
    }

    @GetMapping("/allnumaccordbct/client/{noPieceClient}")
    public List<AccordBctEntity> getAccordsByNoPieceClient(@PathVariable String noPieceClient) {
        return iAccordBctService.getAccordsByNoPieceClient(noPieceClient);
    }

}