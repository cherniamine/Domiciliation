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
@Table(name = "PIECE", schema = "REF", catalog = "")
public class PieceEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CODE_PIECE")
    private byte codePiece;
    @Basic
    @Column(name = "LIB_PIECE")
    private String libPiece;
    @Basic
    @Column(name = "PHRASE_FRANCAISE")
    private String phraseFrancaise;
    @Basic
    @Column(name = "PHRASE_ANGLAIS")
    private String phraseAnglais;
    @Basic
    @Column(name = "FACTURE_O_N")
    private String factureON;


}
