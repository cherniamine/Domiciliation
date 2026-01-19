    package tn.smi.gen.services;
    import jakarta.transaction.Transactional;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;
    import org.springframework.web.multipart.MultipartFile;
    import tn.smi.gen.entities.DocumentsEntity;
    import tn.smi.gen.entities.DocumentsEntityPK;
    import tn.smi.gen.repositories.DocumentsRepository;
    import tn.smi.refproject.entities.AccordBctEntity;
    import tn.smi.refproject.repository.AccordBctRepository;

    import java.sql.Date;
    import java.time.LocalDate;
    import java.util.List;

    @Service
    public class DocumentsService {

        @Autowired
        private DocumentsRepository documentRepository;  // Correct field name

        public List<DocumentsEntity> getDocumentsByNumDossier(Integer numDossier) {
            // Correcting the reference to the repository
            return documentRepository.findByNumDossier(numDossier);
        }
        @Transactional
        public void saveDocument(MultipartFile file, AccordBctEntity accord) {
            // Création des données pour la clé composite
            short codeProduitService = 200;
            short codeOperation = 52;
            int refOperation = generateRefOperation(); // Générer une nouvelle référence unique
            Date dateOperation = Date.valueOf(LocalDate.now());

            // Création de l'entité DocumentsEntity
            DocumentsEntity document = new DocumentsEntity();
            document.setCodeProduitService(codeProduitService);
            document.setCodeOperation(codeOperation);
            document.setRefOperation(refOperation);
            document.setDateOperation(dateOperation);

            document.setNumDossier(accord.getAccordBctEntityPK().getNumAccordBct().intValue());
            document.setTypeDossier("OPJ");
            document.setDateDossier(Date.valueOf(accord.getAccordBctEntityPK().getDateAccordBct()));

            // Récupérer le numéro de ligne maximum pour numDossier
            Byte maxNumLigne = documentRepository.getMaxNumLigne(document.getNumDossier());
            byte newNumLigne = (maxNumLigne == null) ? (byte) 1 : (byte) (maxNumLigne + 1);
            document.setNumLigne(newNumLigne);

            document.setReferenceFichierJoint(file.getOriginalFilename());
            document.setPathAnnee(String.valueOf(LocalDate.now().getYear()));
            document.setPathMois(String.valueOf(LocalDate.now().getMonthValue()));
            document.setExtension(file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf('.') + 1));

            // Enregistrer dans le repository
            documentRepository.save(document);
        }

        private int generateRefOperation() {
            // Implémentez une logique pour générer une nouvelle référence d'opération
            // Exemple : Utilisation d'une séquence ou d'une autre logique
            return (int) (Math.random() * 100000); // Exemple temporaire
        }
    }



        // private int generateRefOperation() {
            // Générer une nouvelle référence d'opération (en fonction de votre logique métier, ici simplement un auto-increment ou séquence)
         //   return accordBctRepository.getNextRefOperation(); // Assurez-vous d'avoir une méthode pour récupérer la séquence dans votre repo
    //    }

    //    private int getNextLineNumber() {
            // Calculer le prochain numéro de ligne pour la pièce jointe
        //     return 1; // Exemple : Retourner simplement 1, ou implémenter une logique pour déterminer le numéro
     //   }

