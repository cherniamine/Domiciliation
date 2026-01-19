package tn.smi.gen.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class EtatOutEntityPK implements Serializable {
    @Column(name = "CODE_PRODUIT_SERVICE")
    private Short codeProduitService;

    @Column(name = "CODE_OPERATION")
    private Short codeOperation;

    public EtatOutEntityPK() {
    }

    public EtatOutEntityPK(Short codeProduitService, Short codeOperation) {
        this.codeProduitService = codeProduitService;
        this.codeOperation = codeOperation;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EtatOutEntityPK that = (EtatOutEntityPK) o;
        return Objects.equals(codeProduitService, that.codeProduitService) &&
                Objects.equals(codeOperation, that.codeOperation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeProduitService, codeOperation);
    }
}
