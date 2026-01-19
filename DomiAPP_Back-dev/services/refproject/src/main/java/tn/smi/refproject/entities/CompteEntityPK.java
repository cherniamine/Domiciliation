package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigInteger;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class CompteEntityPK implements Serializable {

    @Column(name = "TYPE_PIECE_CLIENT")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger typePieceClient;

    @Column(name = "NO_PIECE_CLIENT")
    private String noPieceClient;

    @Column(name = "CODE_AGENCE_BCT")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger codeAgenceBct;

    @Column(name = "RACINE_COMPTE")
    private String racineCompte;

    @Column(name = "CLE_RIB")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger cleRib;


}
