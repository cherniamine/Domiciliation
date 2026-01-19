package tn.smi.gen.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

@Embeddable
public class CommissionCroEntityPK implements Serializable {
    @Column(name = "CODE_PRODUIT_SERVICE")
    private Short codeProduitService;

    @Column(name = "CODE_OPERATION")
    private Short codeOperation;

    @Column(name = "REF_OPERATION")
    private Integer refOperation;

    @Column(name = "DATE_OPERATION")
    private Date dateOperation;

    // Getters and Setters

    public Short getCodeProduitService() {
        return codeProduitService;
    }

    public void setCodeProduitService(Short codeProduitService) {
        this.codeProduitService = codeProduitService;
    }

    public Short getCodeOperation() {
        return codeOperation;
    }

    public void setCodeOperation(Short codeOperation) {
        this.codeOperation = codeOperation;
    }

    public Integer getRefOperation() {
        return refOperation;
    }

    public void setRefOperation(Integer refOperation) {
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
        if (!(o instanceof CommissionCroEntityPK)) return false;
        CommissionCroEntityPK that = (CommissionCroEntityPK) o;
        return Objects.equals(codeProduitService, that.codeProduitService) &&
                Objects.equals(codeOperation, that.codeOperation) &&
                Objects.equals(refOperation, that.refOperation) &&
                Objects.equals(dateOperation, that.dateOperation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeProduitService, codeOperation, refOperation, dateOperation);
    }
}
