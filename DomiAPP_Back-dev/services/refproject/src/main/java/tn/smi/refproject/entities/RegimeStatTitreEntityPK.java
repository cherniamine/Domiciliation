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
public class RegimeStatTitreEntityPK implements Serializable {

    @Column(name = "CODE_TITRE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private byte codeTitre;

    @Column(name = "CODE_REGIME_STAT")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private byte codeRegimeStat;


}
