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
public class CptNostroEntityPK implements Serializable {

    @Column(name = "CODE_BNQ_ETR")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short codeBnqEtr;

    @Column(name = "CODE_AGENCE_ETR")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short codeAgenceEtr;

    @Column(name = "CODE_DEVISE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private byte codeDevise;


}
