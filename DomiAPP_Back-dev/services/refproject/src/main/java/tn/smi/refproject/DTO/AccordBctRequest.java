package tn.smi.refproject.DTO;

import tn.smi.refproject.entities.enumeration.Etat;
import tn.smi.refproject.entities.enumeration.Sens;
import tn.smi.refproject.entities.enumeration.TypeAccordBct;

import java.time.LocalDate;

    public class AccordBctRequest {
        private String noPieceClient;
        private Integer typePieceClient;
        private LocalDate dateDebApplication;
        private LocalDate dateFinApplication;
        private String observation;
        private String numContratCom;
        private LocalDate dateContratCom;
        private Sens sens;
        private Etat etat;

        private TypeAccordBct typeAccordBct;
        private Long numAccordBct;
        private LocalDate dateAccordBct;

        // Getters and setters
        public String getNoPieceClient() {
            return noPieceClient;
        }

        public void setNoPieceClient(String noPieceClient) {
            this.noPieceClient = noPieceClient;
        }

        public Integer getTypePieceClient() {
            return typePieceClient;
        }

        public void setTypePieceClient(Integer typePieceClient) {
            this.typePieceClient = typePieceClient;
        }

        public LocalDate getDateDebApplication() {
            return dateDebApplication;
        }

        public void setDateDebApplication(LocalDate dateDebApplication) {
            this.dateDebApplication = dateDebApplication;
        }

        public LocalDate getDateFinApplication() {
            return dateFinApplication;
        }

        public void setDateFinApplication(LocalDate dateFinApplication) {
            this.dateFinApplication = dateFinApplication;
        }

        public String getObservation() {
            return observation;
        }

        public void setObservation(String observation) {
            this.observation = observation;
        }

        public String getNumContratCom() {
            return numContratCom;
        }

        public void setNumContratCom(String numContratCom) {
            this.numContratCom = numContratCom;
        }

        public LocalDate getDateContratCom() {
            return dateContratCom;
        }

        public void setDateContratCom(LocalDate dateContratCom) {
            this.dateContratCom = dateContratCom;
        }

        public Sens getSens() {
            return sens;
        }

        public void setSens(Sens sens) {
            this.sens = sens;
        }

        public Etat getEtat() {
            return etat;
        }

        public void setEtat(Etat etat) {
            this.etat = etat;
        }

        public TypeAccordBct getTypeAccordBct() {
            return typeAccordBct;
        }

        public void setTypeAccordBct(TypeAccordBct typeAccordBct) {
            this.typeAccordBct = typeAccordBct;
        }

        public Long getNumAccordBct() {
            return numAccordBct;
        }

        public void setNumAccordBct(Long numAccordBct) {
            this.numAccordBct = numAccordBct;
        }

        public LocalDate getDateAccordBct() {
            return dateAccordBct;
        }

        public void setDateAccordBct(LocalDate dateAccordBct) {
            this.dateAccordBct = dateAccordBct;
        }
    }

