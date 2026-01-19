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
public class CodePostalEntityPK implements Serializable {

    @Column(name = "CODE_GOUV")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private byte codeGouv;

    @Column(name = "CODE_DIRECTION")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private byte codeDirection;

    @Column(name = "CODE_POSTAL")
    private String codePostal;


}
