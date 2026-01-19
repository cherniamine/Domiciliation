package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CONTROLE_REGLEMENT_DELAIS", schema = "REF", catalog = "")
public class ControleReglementDelaisEntity {
    @EmbeddedId
    private ControleReglementDelaisEntityPK controleReglementDelaisEntityPK;
    @Basic
    @Column(name = "BCT")
    private String bct;
    @Basic
    @Column(name = "ASSURANCE")
    private String assurance;
    @Basic
    @Column(name = "GARANTIE")
    private String garantie;
    @Basic
    @Column(name = "DEROGATION")
    private String derogation;
    @Basic
    @Column(name = "BLOCAGE_DEPOT")
    private String blocageDepot;
    @Basic
    @Column(name = "BLOCAGE_DOM")
    private String blocageDom;


}
