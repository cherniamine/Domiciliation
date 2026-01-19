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
public class ConditionParOperationEntityPK implements Serializable {

    @Column(name = "TYPE_PIECE_CLIENT")
    private int typePieceClient;

    @Column(name = "NO_PIECE_CLIENT")
    private String noPieceClient;

    @Column(name = "TYPE_DOSSIER")
    private String typeDossier;

    @Column(name = "NUM_DOSSIER")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numDossier;

    @Column(name = "DATE_DOSSIER")
    private LocalDate dateDossier;

    @Column(name = "CODE_COMMISSION")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codeCommission;


}
