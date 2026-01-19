package tn.smi.gen.entities;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "MVT_AVA", schema = "GEN", catalog = "")
@IdClass(MvtAvaEntityPK.class)
public class MvtAvaEntity {
    @Id
    @Column(name = "DATE_JOURNEE")
    private Date dateJournee;

    @Id
    @Column(name = "REF_OPERATION")
    private Integer refOperation;

    @Basic
    @Column(name = "DATE_OPERATION")
    private Date dateOperation;

    @Basic
    @Column(name = "TYPE_PIECE_CLIENT")
    private Byte typePieceClient;

    // Rest of your fields, getters, and setters...

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

    // Implement equals and hashCode methods in line with the primary key fields
}
