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
@Table(name = "DECHARGE_TYPE_OPR_DETAIL", schema = "REF", catalog = "")
public class DechargeTypeOprDetailEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    @Column(name = "CODE_PRODUIT_SERVICE")
    private Short codeProduitService;
    @Basic
    @Column(name = "CODE_OPERATION")
    private Short codeOperation;
    @Basic
    @Column(name = "CODE_TYPE_OPERATION")
    private Short codeTypeOperation;
    @Basic
    @Column(name = "CODE_DETAIL_OPERATION")
    private Byte codeDetailOperation;
    @Basic
    @Column(name = "LIB_DETAIL_OPERATION")
    private String libDetailOperation;
    @Basic
    @Column(name = "CODE_INSTANCE")
    private Short codeInstance;
    @Basic
    @Column(name = "REFERENCE_CIRCULAIRE")
    private String referenceCirculaire;


}
