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
public class TypeOperationEntityPK implements Serializable {

    @Column(name = "CODE_PRODUIT_SERVICE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short codeProduitService;

    @Column(name = "CODE_OPERATION")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short codeOperation;

    @Column(name = "CODE_TYPE_OPERATION")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short codeTypeOperation;


}
