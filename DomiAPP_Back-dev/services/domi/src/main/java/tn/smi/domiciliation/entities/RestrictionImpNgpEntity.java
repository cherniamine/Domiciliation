package tn.smi.domiciliation.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

@jakarta.persistence.Table(name = "RESTRICTION_IMP_NGP", schema = "DOMI", catalog = "")
public class RestrictionImpNgpEntity {
   @EmbeddedId
   private RestrictionImpNgpEntityPK restrictionImpNgpEntityPK;


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        RestrictionImpNgpEntity that = (RestrictionImpNgpEntity) o;
//
//        if (codeNgp != that.codeNgp) return false;
//        if (codeEnDouane != null ? !codeEnDouane.equals(that.codeEnDouane) : that.codeEnDouane != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = (int) (codeNgp ^ (codeNgp >>> 32));
//        result = 31 * result + (codeEnDouane != null ? codeEnDouane.hashCode() : 0);
//        return result;
//    }
}
