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
@Table(name = "T_PIECE", schema = "REF", catalog = "")
public class TPieceEntity implements Serializable {
    @Id
    @Column(name = "CODE_TYPE_PIECE")
    private int codeTypePiece;
    @Basic
    @Column(name = "LIBELLE_TYPE_PIECE")
    private String libelleTypePiece;


}
