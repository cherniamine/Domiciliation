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
@Table(name = "COMMISSION", schema = "REF", catalog = "")
public class CommissionEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CODE_COMMISSION")
    private int codeCommission;
    @Basic
    @Column(name = "LIBELLE_COMMISSION")
    private String libelleCommission;
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
    @Column(name = "COMPTE_NT")
    private String compteNt;
    @Basic
    @Column(name = "COMPTE_T")
    private String compteT;
    @Basic
    @Column(name = "TAUX_1")
    private Integer taux1;
    @Basic
    @Column(name = "POUR_C_M_T1")
    private String pourCMT1;
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
    @Column(name = "AUTRES")
    private Long autres;


}
