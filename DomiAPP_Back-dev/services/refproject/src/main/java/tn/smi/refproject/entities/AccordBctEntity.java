package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.smi.refproject.entities.enumeration.Etat;
import tn.smi.refproject.entities.enumeration.Sens;
import java.io.Serializable;

import java.sql.Date;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ACCORD_BCT", schema = "REF", catalog = "")
public class AccordBctEntity {
    @EmbeddedId
    private AccordBctEntityPK accordBctEntityPK;

    @Basic
    @Column(name = "TYPE_PIECE_CLIENT")
    private Integer typePieceClient;

    @Basic
    @Column(name = "NO_PIECE_CLIENT")
    private String noPieceClient;

    @Basic
    @Column(name = "DATE_DEB_APPLICATION")
    private LocalDate dateDebApplication;

    @Basic
    @Column(name = "DATE_FIN_APPLICATION")
    private LocalDate dateFinApplication;

    @Basic
    @Column(name = "OBSERVATION")
    private String observation;

    @Basic
    @Column(name = "NUM_CONTRAT_COM")
    private String numContratCom;

    @Basic
    @Column(name = "DATE_CONTRAT_COM")
    private LocalDate dateContratCom;

    @Basic
    @Column(name = "SENS")
    @Enumerated(EnumType.STRING)
    private Sens sens;

    @Basic
    @Column(name = "ETAT")
    @Enumerated(EnumType.STRING)
    private Etat etat;

    // Getters and setters
    public AccordBctEntityPK getAccordBctEntityPK() {
        return accordBctEntityPK;
    }

    public void setAccordBctEntityPK(AccordBctEntityPK accordBctEntityPK) {
        this.accordBctEntityPK = accordBctEntityPK;
    }

    public Integer getTypePieceClient() {
        return typePieceClient;
    }

    public void setTypePieceClient(Integer typePieceClient) {
        this.typePieceClient = typePieceClient;
    }

    public String getNoPieceClient() {
        return noPieceClient;
    }

    public void setNoPieceClient(String noPieceClient) {
        this.noPieceClient = noPieceClient;
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
}
