package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class AccordBctMvtEntityPK implements Serializable {

    @Column(name = "CODE_PRODUIT_SERVICE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short codeProduitService;

    @Column(name = "CODE_OPERATION")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short codeOperation;

    @Column(name = "DATE_OPERATION")
    private LocalDate dateOperation;

    @Column(name = "REF_OPERATION")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int refOperation;






}
