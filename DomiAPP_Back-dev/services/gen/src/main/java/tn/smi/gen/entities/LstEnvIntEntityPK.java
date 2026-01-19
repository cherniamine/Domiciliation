package tn.smi.gen.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class LstEnvIntEntityPK implements Serializable {
    @Column(name = "CODE_PRODUIT_SERVICE")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private byte codeProduitService;
    @Column(name = "CODE_OPERATION")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short codeOperation;

    public byte getCodeProduitService() {
        return codeProduitService;
    }

    public void setCodeProduitService(byte codeProduitService) {
        this.codeProduitService = codeProduitService;
    }

    public short getCodeOperation() {
        return codeOperation;
    }

    public void setCodeOperation(short codeOperation) {
        this.codeOperation = codeOperation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LstEnvIntEntityPK that = (LstEnvIntEntityPK) o;

        if (codeProduitService != that.codeProduitService) return false;
        if (codeOperation != that.codeOperation) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) codeProduitService;
        result = 31 * result + (int) codeOperation;
        return result;
    }
}
