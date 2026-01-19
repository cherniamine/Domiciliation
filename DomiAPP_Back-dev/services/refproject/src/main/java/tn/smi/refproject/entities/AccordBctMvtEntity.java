package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.smi.refproject.entities.enumeration.Etat;
import tn.smi.refproject.entities.enumeration.Sens;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ACCORD_BCT_MVT", schema = "REF", catalog = "")
public class AccordBctMvtEntity {
    @EmbeddedId
    private AccordBctMvtEntityPK accordBctMvtEntityPK;
    @Basic
    @Column(name = "TYPE_ACCORD_BCT")
    private String typeAccordBct;
    @Basic
    @Column(name = "NUM_ACCORD_BCT")
    private Integer numAccordBct;
    @Basic
    @Column(name = "DATE_ACCORD_BCT")
    private LocalDate dateAccordBct;
    @Basic
    @Column(name = "TYPE_PIECE_CLIENT")
    private Boolean typePieceClient;
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
    @Column(name = "MAT_EMP")
    private Short matEmp;
    @Basic
    @Column(name = "DATE_VALIDATION")
    private Timestamp dateValidation;
    @Basic
    @Column(name = "STATUS")
    private String status;
    @Basic
    @Column(name = "AVIS_AGENCE")
    private String avisAgence;
    @Basic
    @Column(name = "AVIS_SIEGE")
    private String avisSiege;
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


}
