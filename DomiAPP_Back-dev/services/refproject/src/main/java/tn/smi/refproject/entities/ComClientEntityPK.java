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
public class ComClientEntityPK implements Serializable {

    @Column(name = "TYPE_PIECE_CLIENT")
    private int typePieceClient;

    @Column(name = "NO_PIECE_CLIENT")
    private String noPieceClient;

    @Column(name = "CODE_COMMISSION")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codeCommission;


}
