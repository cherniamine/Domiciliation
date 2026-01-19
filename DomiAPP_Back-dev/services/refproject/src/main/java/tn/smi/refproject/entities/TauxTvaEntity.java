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
@Table(name = "TAUX_TVA", schema = "REF", catalog = "")
public class TauxTvaEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CODE_TVA")
    private byte codeTva;
    @Basic
    @Column(name = "TAUX_TVA")
    private Short tauxTva;
    @Basic
    @Column(name = "COMPTE_GENERAL")
    private String compteGeneral;


}
