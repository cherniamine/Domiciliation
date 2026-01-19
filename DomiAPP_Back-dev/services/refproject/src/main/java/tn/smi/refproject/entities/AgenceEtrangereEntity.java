package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "AGENCE_ETRANGERE", schema = "REF", catalog = "")
public class AgenceEtrangereEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    @Column(name = "CODE_BNQ_ETR")
    private Short codeBnqEtr;
    @Basic
    @Column(name = "CODE_AGENCE_ETR")
    private Short codeAgenceEtr;
    @Basic
    @Column(name = "ADR_EMAIL")
    private String adrEmail;
    @Basic
    @Column(name = "CITE")
    private String cite;
    @Basic
    @Column(name = "CITE1")
    private String cite1;
    @Basic
    @Column(name = "CITE2")
    private String cite2;
    @Basic
    @Column(name = "CITE3")
    private String cite3;
    @Basic
    @Column(name = "CLE_SWIFT")
    private String cleSwift;
    @Basic
    @Column(name = "CODE_BNQ_REG")
    private String codeBnqReg;
    @Basic
    @Column(name = "CODE_DEVISE")
    private Byte codeDevise;
    @Basic
    @Column(name = "CODE_PAYS")
    private Byte codePays;
    @Basic
    @Column(name = "CONTACT1")
    private String contact1;
    @Basic
    @Column(name = "CONTACT2")
    private String contact2;
    @Basic
    @Column(name = "CONTACT3")
    private String contact3;
    @Basic
    @Column(name = "EMAIL1")
    private String email1;
    @Basic
    @Column(name = "EMAIL2")
    private String email2;
    @Basic
    @Column(name = "EMAIL3")
    private String email3;
    @Basic
    @Column(name = "FAX1")
    private String fax1;
    @Basic
    @Column(name = "FAX2")
    private String fax2;
    @Basic
    @Column(name = "FAX3")
    private String fax3;
    @Basic
    @Column(name = "FONCTION1")
    private String fonction1;
    @Basic
    @Column(name = "FONCTION2")
    private String fonction2;
    @Basic
    @Column(name = "FONCTION3")
    private String fonction3;
    @Basic
    @Column(name = "IMM")
    private String imm;
    @Basic
    @Column(name = "IMM1")
    private String imm1;
    @Basic
    @Column(name = "IMM2")
    private String imm2;
    @Basic
    @Column(name = "IMM3")
    private String imm3;
    @Basic
    @Column(name = "LIB_AGENCE_ETR")
    private String libAgenceEtr;
    @Basic
    @Column(name = "NUM_FAX")
    private String numFax;
    @Basic
    @Column(name = "NUM_SWIFT")
    private String numSwift;
    @Basic
    @Column(name = "NUM_TEL")
    private String numTel;
    @Basic
    @Column(name = "RUE")
    private String rue;
    @Basic
    @Column(name = "RUE1")
    private String rue1;
    @Basic
    @Column(name = "RUE2")
    private String rue2;
    @Basic
    @Column(name = "RUE3")
    private String rue3;
    @Basic
    @Column(name = "TEL1")
    private String tel1;
    @Basic
    @Column(name = "TEL2")
    private String tel2;
    @Basic
    @Column(name = "TEL3")
    private String tel3;
    @Basic
    @Column(name = "TELEX")
    private String telex;
    @Basic
    @Column(name = "VILLE")
    private String ville;
    @Basic
    @Column(name = "CITE_CENTRE_TRI")
    private String citeCentreTri;
    @Basic
    @Column(name = "RUE_CENTRE_TRI")
    private String rueCentreTri;
    @Basic
    @Column(name = "IMM_CENTRE_TRI")
    private String immCentreTri;


}
