package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "COM_CLIENT", schema = "REF", catalog = "")
public class ComClientEntity {
    @EmbeddedId
    private ComClientEntityPK clientEntityPK;
    @Basic
    @Column(name = "CODE_TYPE_COM")
    private Byte codeTypeCom;
    @Basic
    @Column(name = "PERIODE_COMMISSION")
    private String periodeCommission;
    @Basic
    @Column(name = "INDIVISIBLE")
    private String indivisible;
    @Basic
    @Column(name = "CODE_TVA")
    private Byte codeTva;
    @Basic
    @Column(name = "SOUS_COMPTE_T")
    private Integer sousCompteT;
    @Basic
    @Column(name = "SOUS_COMPTE_NT")
    private Integer sousCompteNt;
    @Basic
    @Column(name = "COMPTE_NT")
    private Short compteNt;
    @Basic
    @Column(name = "COMPTE_T")
    private Short compteT;
    @Basic
    @Column(name = "TAUX_1")
    private Integer taux1;
    @Basic
    @Column(name = "POUR_C_M_T1")
    private String pourCMT1;
    @Basic
    @Column(name = "TAUX_2")
    private Integer taux2;
    @Basic
    @Column(name = "POUR_C_M_T2")
    private String pourCMT2;
    @Basic
    @Column(name = "VALEUR_MIN")
    private Long valeurMin;
    @Basic
    @Column(name = "VALEUR_MAX")
    private Long valeurMax;
    @Basic
    @Column(name = "MNT_SEUIL")
    private Long mntSeuil;
    @Basic
    @Column(name = "MNT_SEUIL1")
    private Long mntSeuil1;
    @Basic
    @Column(name = "MNT_SEUIL2")
    private Long mntSeuil2;
    @Basic
    @Column(name = "COM_SEUIL")
    private Long comSeuil;
    @Basic
    @Column(name = "COM_SEUIL1")
    private Long comSeuil1;
    @Basic
    @Column(name = "COM_SEUIL2")
    private Long comSeuil2;
    @Basic
    @Column(name = "AUTRES")
    private Long autres;
    @Basic
    @Column(name = "MILL_DT")
    private String millDt;
    @Basic
    @Column(name = "MARGE")
    private String marge;
    @Basic
    @Column(name = "CODE_SERVICE")
    private Byte codeService;
    @Basic
    @Column(name = "MAT_EMP")
    private Short matEmp;
    @Basic
    @Column(name = "DATE_CREATION")
    private LocalDate dateCreation;
    @Basic
    @Column(name = "JOURS_NON_CALCUL")
    private Byte joursNonCalcul;
    @Basic
    @Column(name = "OPE_COMMERCE_FINANCE")
    private String opeCommerceFinance;
    @Basic
    @Column(name = "COM_ECHEANCE")
    private LocalDate comEcheance;


}
