package tn.smi.gen.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class DicDonEntityPK implements Serializable {
    @Column(name = "CODE_PRODUIT_SERVICE")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private byte codeProduitService;
    @Column(name = "CODE_OPERATION")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short codeOperation;
    @Column(name = "NOM_DONNEE")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nomDonnee;
    @Column(name = "NOM_ELEMENT")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nomElement;

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

    public String getNomDonnee() {
        return nomDonnee;
    }

    public void setNomDonnee(String nomDonnee) {
        this.nomDonnee = nomDonnee;
    }

    public String getNomElement() {
        return nomElement;
    }

    public void setNomElement(String nomElement) {
        this.nomElement = nomElement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DicDonEntityPK that = (DicDonEntityPK) o;

        if (codeProduitService != that.codeProduitService) return false;
        if (codeOperation != that.codeOperation) return false;
        if (nomDonnee != null ? !nomDonnee.equals(that.nomDonnee) : that.nomDonnee != null) return false;
        if (nomElement != null ? !nomElement.equals(that.nomElement) : that.nomElement != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) codeProduitService;
        result = 31 * result + (int) codeOperation;
        result = 31 * result + (nomDonnee != null ? nomDonnee.hashCode() : 0);
        result = 31 * result + (nomElement != null ? nomElement.hashCode() : 0);
        return result;
    }
}
