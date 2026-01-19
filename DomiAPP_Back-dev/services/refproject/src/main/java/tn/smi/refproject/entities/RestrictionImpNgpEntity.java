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
@Table(name = "RESTRICTION_IMP_NGP", schema = "REF", catalog = "")
public class RestrictionImpNgpEntity {
    @EmbeddedId
    private RestrictionImpNgpEntityPK restrictionImpNgpEntityPK;



}
