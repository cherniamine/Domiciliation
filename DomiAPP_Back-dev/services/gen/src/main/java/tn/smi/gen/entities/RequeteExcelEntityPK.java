package tn.smi.gen.entities;

import java.io.Serializable;

public class RequeteExcelEntityPK implements Serializable {
    private short codeProduitService;
    private short idRequete;

    public RequeteExcelEntityPK() {}

    public RequeteExcelEntityPK(short codeProduitService, short idRequete) {
        this.codeProduitService = codeProduitService;
        this.idRequete = idRequete;
    }

    // Getters and setters
    public short getCodeProduitService() {
        return codeProduitService;
    }

    public void setCodeProduitService(short codeProduitService) {
        this.codeProduitService = codeProduitService;
    }

    public short getIdRequete() {
        return idRequete;
    }

    public void setIdRequete(short idRequete) {
        this.idRequete = idRequete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RequeteExcelEntityPK that = (RequeteExcelEntityPK) o;
        return codeProduitService == that.codeProduitService && idRequete == that.idRequete;
    }

    @Override
    public int hashCode() {
        return 31 * (int) codeProduitService + (int) idRequete;
    }
}
