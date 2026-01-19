package tn.smi.gen.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Embeddable
public class MvtAvaEntityPK implements Serializable {
    @Column(name = "DATE_JOURNEE")
    private Date dateJournee;

    @Column(name = "REF_OPERATION")
    private Integer refOperation;

    public MvtAvaEntityPK() {}

    public MvtAvaEntityPK(Date dateJournee, Integer refOperation) {
        this.dateJournee = dateJournee;
        this.refOperation = refOperation;
    }

    public Date getDateJournee() {
        return dateJournee;
    }

    public void setDateJournee(Date dateJournee) {
        this.dateJournee = dateJournee;
    }

    public Integer getRefOperation() {
        return refOperation;
    }

    public void setRefOperation(Integer refOperation) {
        this.refOperation = refOperation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MvtAvaEntityPK that = (MvtAvaEntityPK) o;
        return Objects.equals(dateJournee, that.dateJournee) &&
                Objects.equals(refOperation, that.refOperation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateJournee, refOperation);
    }
}
