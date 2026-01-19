package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "COM_SUR_CRP", schema = "REF", catalog = "")
public class ComSurCrpEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    @Column(name = "CODE_COMMISSION")
    private Short codeCommission;
    @Basic
    @Column(name = "LIBELLE_COMMISSION")
    private String libelleCommission;
    @Basic
    @Column(name = "CODE_TYPE_COM")
    private Boolean codeTypeCom;
    @Basic
    @Column(name = "CODE_TVA")
    private Byte codeTva;
    @Basic
    @Column(name = "TAUX")
    private Integer taux;
    @Basic
    @Column(name = "TYPE_COMMISSION")
    private String typeCommission;
    @Basic
    @Column(name = "MNT_COMMISSION")
    private Integer mntCommission;
    @Basic
    @Column(name = "FIXE_PALLIER")
    private String fixePallier;
    @Basic
    @Column(name = "SEUIL_MINIMUM")
    private BigDecimal seuilMinimum;
    @Basic
    @Column(name = "SEUIL_MAXIMUM")
    private BigDecimal seuilMaximum;
    @Basic
    @Column(name = "COMPTE_T")
    private Short compteT;
    @Basic
    @Column(name = "SOUS_COMPTE_T")
    private Integer sousCompteT;


}
