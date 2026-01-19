package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class PreleverEntityPK implements Serializable {

    @Column(name = "CODE_OPERATION")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short codeOperation;

    @Column(name = "CODE_PRODUIT_SERVICE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private byte codeProduitService;

    @Column(name = "CODE_COMMISSION")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codeCommission;

    @Column(name = "CODE_TYPE_OPERATION")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codeTypeOperation;


}
