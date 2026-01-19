package tn.smi.gen.entities;

import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "OPERATION_TITRE", schema = "GEN")
public class OperationTitreEntity {
    @EmbeddedId
    private OperationTitreEntityPK id;

    @Basic
    @Column(name = "CODE_OPERATION")
    private Short codeOperation;

    @Basic
    @Column(name = "DATE_OPERATION")
    private Date dateOperation;

    @Basic
    @Column(name = "UNITE_OPERATION")
    private Byte uniteOperation;

    // Other fields...

    public OperationTitreEntityPK getId() {
        return id;
    }

    public void setId(OperationTitreEntityPK id) {
        this.id = id;
    }

    public Short getCodeOperation() {
        return codeOperation;
    }

    public void setCodeOperation(Short codeOperation) {
        this.codeOperation = codeOperation;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public Byte getUniteOperation() {
        return uniteOperation;
    }

    public void setUniteOperation(Byte uniteOperation) {
        this.uniteOperation = uniteOperation;
    }

    // Additional getters and setters for other fields...
}
