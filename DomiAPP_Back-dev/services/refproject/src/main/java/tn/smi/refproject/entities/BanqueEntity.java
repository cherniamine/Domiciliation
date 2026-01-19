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
@Table(name = "BANQUE", schema = "REF", catalog = "")
public class BanqueEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CODE_BANQUE")
    private byte codeBanque;

    @Basic
    @Column(name = "LIB_BANQUE")
    private String libBanque;
    @Basic
    @Column(name = "SIGLE_BANQUE")
    private String sigleBanque;
    @Basic
    @Column(name = "RESIDENCE_BANQUE")
    private String residenceBanque;
    @Basic
    @Column(name = "NUMERO_RESIDENCE_BANQUE")
    private String numeroResidenceBanque;
    @Basic
    @Column(name = "CITE_RESIDENCE_BANQUE")
    private String citeResidenceBanque;
    @Basic
    @Column(name = "CODE_POSTAL")
    private Short codePostal;
    @Basic
    @Column(name = "TEL")
    private String tel;
    @Basic
    @Column(name = "FAX")
    private String fax;
    @Basic
    @Column(name = "TELEX")
    private String telex;
    @Basic
    @Column(name = "NUM_SWIFT")
    private String numSwift;
    @Basic
    @Column(name = "PERSONNE_A_CONTACTER")
    private String personneAContacter;
    @Basic
    @Column(name = "PERSONNE_POUR_CORRESPONDANCE")
    private String personnePourCorrespondance;
    @Basic
    @Column(name = "CODE_OPERATEUR")
    private String codeOperateur;

}
