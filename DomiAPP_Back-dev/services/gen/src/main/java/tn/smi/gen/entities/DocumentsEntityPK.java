package tn.smi.gen.entities;

import jakarta.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class DocumentsEntityPK implements Serializable {
    private short codeProduitService;
    private short codeOperation;
    private int refOperation;
    private Date dateOperation;

    // Getters et setters
    public short getCodeProduitService() {
        return codeProduitService;
    }

    public void setCodeProduitService(short codeProduitService) {
        this.codeProduitService = codeProduitService;
    }

    public short getCodeOperation() {
        return codeOperation;
    }

    public void setCodeOperation(short codeOperation) {
        this.codeOperation = codeOperation;
    }

    public int getRefOperation() {
        return refOperation;
    }

    public void setRefOperation(int refOperation) {
        this.refOperation = refOperation;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocumentsEntityPK that = (DocumentsEntityPK) o;
        return codeProduitService == that.codeProduitService &&
                codeOperation == that.codeOperation &&
                refOperation == that.refOperation &&
                Objects.equals(dateOperation, that.dateOperation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeProduitService, codeOperation, refOperation, dateOperation);
    }
}
