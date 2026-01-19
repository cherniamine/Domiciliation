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
public class ActiviteClasseEntityPK implements Serializable {

    @Column(name = "CODE_SECTION")
    private String codeSection;

    @Column(name = "CODE_DIVISION")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private byte codeDivision;

    @Column(name = "CODE_GROUPE")
    private int codeGroupe;

    @Column(name = "CODE_CLASSE")
    private int codeClasse;


}
