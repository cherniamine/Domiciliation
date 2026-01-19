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
@Table(name = "MODE_DE_LIVRAISON", schema = "REF", catalog = "")
public class ModeDeLivraisonEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CODE_MOD_LIV")
    private long codeModLiv;
    @Basic
    @Column(name = "LIB_MOD_LIV")
    private String libModLiv;
    @Basic
    @Column(name = "LIB_MOD_LIV_FR")
    private String libModLivFr;
    @Basic
    @Column(name = "SIGLE")
    private String sigle;
    @Basic
    @Column(name = "CODE_NATURE_OPERATION")
    private Short codeNatureOperation;


}
