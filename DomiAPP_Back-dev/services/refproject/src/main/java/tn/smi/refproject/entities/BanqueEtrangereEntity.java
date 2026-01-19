package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.smi.refproject.entities.enumeration.TypeBanque;

import java.io.Serializable;
import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "BANQUE_ETRANGERE", schema = "REF", catalog = "")
public class BanqueEtrangereEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    @Column(name = "CODE_BNQ_ETR")
    private Short codeBnqEtr;
    @Basic
    @Column(name = "LIB_LONG")
    private String libLong;
    @Basic
    @Column(name = "LIB_COURT")
    private String libCourt;
    @Basic
    @Column(name = "CODE_PAYS")
    private Byte codePays;
    @Basic
    @Column(name = "CORRESP")
    private String corresp;
    @Basic
    @Column(name = "PLAFOND_LC")
    private Long plafondLc;
    @Basic
    @Column(name = "DATE_LC")
    private Date dateLc;
    @Basic
    @Column(name = "DUREE_LC")
    private Byte dureeLc;
    @Basic
    @Column(name = "PLAFOND_LCHC")
    private Long plafondLchc;
    @Basic
    @Column(name = "DATE_LCHC")
    private Date dateLchc;
    @Basic
    @Column(name = "DUREE_LCHC")
    private Byte dureeLchc;
    @Basic
    @Column(name = "PLAFOND_LCHT")
    private Long plafondLcht;
    @Basic
    @Column(name = "DATE_LCHT")
    private Date dateLcht;
    @Basic
    @Column(name = "DUREE_LCHT")
    private Byte dureeLcht;
    @Basic
    @Column(name = "PLAFOND_LTCT")
    private Long plafondLtct;
    @Basic
    @Column(name = "DATE_LTCT")
    private Date dateLtct;
    @Basic
    @Column(name = "DUREE_LTCT")
    private Byte dureeLtct;
    @Basic
    @Column(name = "PLAFOND_LTMT")
    private Long plafondLtmt;
    @Basic
    @Column(name = "DATE_LTMT")
    private Date dateLtmt;
    @Basic
    @Column(name = "DUREE_LTMT")
    private Byte dureeLtmt;
    @Basic
    @Column(name = "UTILISE_LC")
    private Long utiliseLc;
    @Basic
    @Column(name = "UTILISE_LCHC")
    private Long utiliseLchc;
    @Basic
    @Column(name = "UTILISE_LCHT")
    private Long utiliseLcht;
    @Basic
    @Column(name = "UTILISE_LTCT")
    private Long utiliseLtct;
    @Basic
    @Column(name = "UTILISE_LTMT")
    private Long utiliseLtmt;
    @Basic
    @Column(name = "DELAI_REGLEMENT")
    private Byte delaiReglement;
    @Basic
    @Column(name = "LIB")
    private String lib;
    @Basic
    @Column(name = "UMA")
    private String uma;
    @Basic
    @Column(name = "COMPTE_MDCAA")
    private Short compteMdcaa;
    @Basic
    @Column(name = "SOUS_COMPTE_MDCAA")
    private Integer sousCompteMdcaa;
    @Basic
    @Column(name = "COMPTE_RECOUV_ETR")
    private Short compteRecouvEtr;
    @Basic
    @Column(name = "SOUS_COMPTE_RECOUV_ETR")
    private Integer sousCompteRecouvEtr;
    @Basic
    @Column(name = "COMPTE_RECOUV_ETR_ESC")
    private Short compteRecouvEtrEsc;
    @Basic
    @Column(name = "SOUS_COMPTE_RECOUV_ETR_ESC")
    private Integer sousCompteRecouvEtrEsc;
    @Basic
    @Column(name = "DELAI_REG_JOURS_OUV")
    private String delaiRegJoursOuv;
    @Basic
    @Column(name = "DELAI_REGLEMENT_BNQ")
    private Byte delaiReglementBnq;
    @Basic
    @Column(name = "AGC_CPT_MDCAA")
    private Byte agcCptMdcaa;
    @Basic
    @Column(name = "AGC_CPT_RECOUV_ETR")
    private Byte agcCptRecouvEtr;
    @Basic
    @Column(name = "AGC_CPT_RECOUV_ETR_ESC")
    private Byte agcCptRecouvEtrEsc;
    @Basic
    @Column(name = "NUM_SWIFT_AGENCE_MERE")
    private String numSwiftAgenceMere;
    @Basic
    @Column(name = "ACTIF_O_N")
    private String actifON;
    @Basic
    @Column(name = "TYPE_BANQUE")
    @Enumerated(EnumType.STRING)
    private TypeBanque typeBanque;


}
