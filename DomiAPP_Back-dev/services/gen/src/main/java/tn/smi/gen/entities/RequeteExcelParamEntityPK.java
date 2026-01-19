package tn.smi.gen.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class RequeteExcelParamEntityPK implements Serializable {
    @Column(name = "CODE_PRODUIT_SERVICE")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short codeProduitService;
    @Column(name = "ID_REQUETE")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private byte idRequete;
    @Column(name = "ID_PARAM")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idParam;

    public short getCodeProduitService() {
        return codeProduitService;
    }

    public void setCodeProduitService(short codeProduitService) {
        this.codeProduitService = codeProduitService;
    }

    public byte getIdRequete() {
        return idRequete;
    }

    public void setIdRequete(byte idRequete) {
        this.idRequete = idRequete;
    }

    public String getIdParam() {
        return idParam;
    }

    public void setIdParam(String idParam) {
        this.idParam = idParam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RequeteExcelParamEntityPK that = (RequeteExcelParamEntityPK) o;

        if (codeProduitService != that.codeProduitService) return false;
        if (idRequete != that.idRequete) return false;
        if (idParam != null ? !idParam.equals(that.idParam) : that.idParam != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) codeProduitService;
        result = 31 * result + (int) idRequete;
        result = 31 * result + (idParam != null ? idParam.hashCode() : 0);
        return result;
    }
}
