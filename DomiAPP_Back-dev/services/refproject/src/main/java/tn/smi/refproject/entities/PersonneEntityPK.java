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
public class PersonneEntityPK implements Serializable {

    @Column(name = "NO_PIECE_PERSONNE")
    private String noPiecePersonne;

    @Column(name = "TYPE_PIECE_PERSONNE")
    private int typePiecePersonne;


}
