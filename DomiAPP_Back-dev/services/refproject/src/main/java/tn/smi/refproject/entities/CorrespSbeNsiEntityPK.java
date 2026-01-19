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
public class CorrespSbeNsiEntityPK implements Serializable {

    @Column(name = "CODE_PRODUIT_SERVICE_ORIG")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short codeProduitServiceOrig;

    @Column(name = "CODE_OPERATION_ORIG")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codeOperationOrig;

    @Column(name = "CODE_PRODUIT_SERVICE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short codeProduitService;

    @Column(name = "CODE_OPERATION")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short codeOperation;


}
