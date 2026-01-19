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
@Table(name = "REGLEMENT_DELAIS", schema = "REF", catalog = "")
public class ReglementDelaisEntity {
    @EmbeddedId
    private ReglementDelaisEntityPK reglementDelaisEntityPK;
    @Basic
    @Column(name = "BCT")
    private String bct;
    @Basic
    @Column(name = "COTUNACE")
    private String cotunace;


}
