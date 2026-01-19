package tn.smi.domiciliation.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@jakarta.persistence.Table(name = "RESERVE_NGP", schema = "DOMI", catalog = "")
public class ReserveNgpEntity {
    @EmbeddedId
    private ReserveNgpEntityPK reserveNgpEntityPK;

    @Basic
    @Column(name = "DATE_INSERTION")
    private Date dateInsertion;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        ReserveNgpEntity that = (ReserveNgpEntity) o;
//
//        if (codeNgp != that.codeNgp) return false;
//        if (codeReserve != that.codeReserve) return false;
//        if (natureOpe != null ? !natureOpe.equals(that.natureOpe) : that.natureOpe != null) return false;
//        if (dateInsertion != null ? !dateInsertion.equals(that.dateInsertion) : that.dateInsertion != null)
//            return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = (int) (codeNgp ^ (codeNgp >>> 32));
//        result = 31 * result + (int) codeReserve;
//        result = 31 * result + (natureOpe != null ? natureOpe.hashCode() : 0);
//        result = 31 * result + (dateInsertion != null ? dateInsertion.hashCode() : 0);
//        return result;
//    }
}
