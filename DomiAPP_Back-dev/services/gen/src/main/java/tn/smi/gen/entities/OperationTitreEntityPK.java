package tn.smi.gen.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OperationTitreEntityPK implements Serializable {
    @Column(name = "CODE_PRODUIT_SERVICE")
    private Short codeProduitService;

    @Column(name = "REF_OPERATION")
    private Integer refOperation;

    public OperationTitreEntityPK() {}

    public OperationTitreEntityPK(Short codeProduitService, Integer refOperation) {
        this.codeProduitService = codeProduitService;
        this.refOperation = refOperation;
    }

    public Short getCodeProduitService() {
        return codeProduitService;
    }

    public void setCodeProduitService(Short codeProduitService) {
        this.codeProduitService = codeProduitService;
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
        OperationTitreEntityPK that = (OperationTitreEntityPK) o;
        return Objects.equals(codeProduitService, that.codeProduitService) &&
                Objects.equals(refOperation, that.refOperation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeProduitService, refOperation);
    }
}
