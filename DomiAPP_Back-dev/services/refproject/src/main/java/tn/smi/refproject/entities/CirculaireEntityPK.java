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
public class CirculaireEntityPK implements Serializable {

    @Column(name = "CODE_INSTANCE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short codeInstance;

    @Column(name = "REFERENCE_CIRCULAIRE")
    private String referenceCirculaire;

}
