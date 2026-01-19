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
public class NatureCommissionEntityPK implements Serializable {

    @Column(name = "CODE_TYPE_COM")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private byte codeTypeCom;

    @Column(name = "CODE_NATURE_COM")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private byte codeNatureCom;



}
