package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigInteger;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "COMPTE_INT2", schema = "REF", catalog = "")
public class CompteInt2Entity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    @Column(name = "TYPE_PIECE_CLIENT")
    private BigInteger typePieceClient;
    @Basic
    @Column(name = "NO_PIECE_CLIENT")
    private String noPieceClient;
    @Basic
    @Column(name = "CODE_AGENCE_BCT")
    private BigInteger codeAgenceBct;
    @Basic
    @Column(name = "RACINE_COMPTE")
    private String racineCompte;
    @Basic
    @Column(name = "CLE_RIB")
    private BigInteger cleRib;
    @Basic
    @Column(name = "COMPTE_INTERNE")
    private String compteInterne;


}
