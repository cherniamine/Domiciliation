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
@Table(name = "COND_FAV_COM_SUR_CRP", schema = "REF", catalog = "")
public class CondFavComSurCrpEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    @Column(name = "CODE_CORRESPONDANT")
    private Short codeCorrespondant;
    @Basic
    @Column(name = "CODE_COMMISSION")
    private Short codeCommission;
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
    @Column(name = "COMPTE_T")
    private Short compteT;
    @Basic
    @Column(name = "SOUS_COMPTE_T")
    private Integer sousCompteT;


}
