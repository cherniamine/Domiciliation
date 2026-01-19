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
@Table(name = "MOTIF_PAIEMENT", schema = "REF", catalog = "")
public class MotifPaiementEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CODE_MOTIF")
    private byte codeMotif;
    @Basic
    @Column(name = "LIB_MOTIF")
    private String libMotif;
    @Basic
    @Column(name = "CODE_TITRE")
    private Byte codeTitre;
    @Basic
    @Column(name = "NATURE_OPERATION")
    private Short natureOperation;
    @Basic
    @Column(name = "CODE_CORRESPONDANCE_INTERNE")
    private String codeCorrespondanceInterne;


}
