package tn.smi.gen.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class NtfOprEntityPK implements Serializable {
    @Column(name = "CODE_PRODUIT_SERVICE")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private byte codeProduitService;
    @Column(name = "CODE_OPERATION")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short codeOperation;
    @Column(name = "CODE_NOTIFICATION")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codeNotification;

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

    public int getCodeNotification() {
        return codeNotification;
    }

    public void setCodeNotification(int codeNotification) {
        this.codeNotification = codeNotification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NtfOprEntityPK that = (NtfOprEntityPK) o;

        if (codeProduitService != that.codeProduitService) return false;
        if (codeOperation != that.codeOperation) return false;
        if (codeNotification != that.codeNotification) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) codeProduitService;
        result = 31 * result + (int) codeOperation;
        result = 31 * result + codeNotification;
        return result;
    }
}
