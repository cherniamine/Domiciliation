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
public class ReglementDelaisEntityPK implements Serializable {

    @Column(name = "CODE_MOD_REG")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private byte codeModReg;

    @Column(name = "CODE_DEL_REG")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private byte codeDelReg;


}
