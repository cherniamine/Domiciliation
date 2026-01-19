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
@Table(name = "PAYS_NGP", schema = "REF", catalog = "")
public class PaysNgpEntity {
    @EmbeddedId
    private PaysNgpEntityPK paysNgpEntityPK;
    @Basic
    @Column(name = "NATURE_NGP")
    private String natureNgp;
    @Basic
    @Column(name = "NATURE_OPE_PAYS")
    private String natureOpePays;


}
