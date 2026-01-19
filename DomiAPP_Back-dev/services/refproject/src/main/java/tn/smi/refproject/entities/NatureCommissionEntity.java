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
@Table(name = "NATURE_COMMISSION", schema = "REF", catalog = "")
public class NatureCommissionEntity {
   @EmbeddedId
   private NatureCommissionEntityPK natureCommissionEntityPK;
    @Basic
    @Column(name = "LIB_NATURE_COM")
    private String libNatureCom;
    @Basic
    @Column(name = "CODE_COMMISSION")
    private Integer codeCommission;


}
