package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;
import java.sql.Date;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "COMPTE", schema = "REF", catalog = "")
public class CompteEntity {
    @EmbeddedId
    private CompteEntityPK compteEntityPK;
    @Basic
    @Column(name = "CODE_AGENCE_BNA")
    private Byte codeAgenceBna;
    @Basic
    @Column(name = "COMPTE_GENERAL")
    private Short compteGeneral;
    @Basic
    @Column(name = "SOUS_COMPTE")
    private Integer sousCompte;
    @Basic
    @Column(name = "CLE_COMPTE")
    private String cleCompte;
    @Basic
    @Column(name = "CODE_DEVISE")
    private BigInteger codeDevise;
    @Basic
    @Column(name = "COMPTE_PROFESS_O_N")
    private String compteProfessON;
    @Basic
    @Column(name = "CPT_DOM")
    private String cptDom;
    @Basic
    @Column(name = "DATE_CREATION")
    private LocalDate dateCreation;
    @Basic
    @Column(name = "DATE_CLOTURE")
    private LocalDate dateCloture;
    @Basic
    @Column(name = "ETAT_COMPTE")
    private String etatCompte;
    @Basic
    @Column(name = "SL")
    private BigInteger sl;
    @Basic
    @Column(name = "SOUS_COMPTE_CPLT")
    private BigInteger sousCompteCplt;


}
