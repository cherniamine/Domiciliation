package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CPT_NOSTRO", schema = "REF", catalog = "")
public class CptNostroEntity {
    @EmbeddedId
    private CptNostroEntityPK cptNostroEntityPK;

    @Basic
    @Column(name = "CPT_NOSTRO")
    private String cptNostro;
    @Basic
    @Column(name = "CPT_IBAN")
    private String cptIban;
    @Basic
    @Column(name = "CLEARING_O_N")
    private String clearingON;
    @Basic
    @Column(name = "CODE_PAYS_CRP")
    private Byte codePaysCrp;
    @Basic
    @Column(name = "CODE_CRP")
    private Byte codeCrp;
    @Basic
    @Column(name = "CLE_COMPTE")
    private String cleCompte;
    @Basic
    @Column(name = "SOUS_COMPTE")
    private Integer sousCompte;
    @Basic
    @Column(name = "COMPTE_GENERAL")
    private Short compteGeneral;
    @Basic
    @Column(name = "CODE_AGENCE_BNA")
    private Byte codeAgenceBna;
    @Basic
    @Column(name = "CODE_BNQ_ETR_BCT")
    private Byte codeBnqEtrBct;
    @Basic
    @Column(name = "IBAN_CORRES_BCT")
    private String ibanCorresBct;
    @Basic
    @Column(name = "COMPTE_REEL")
    private String compteReel;


}
