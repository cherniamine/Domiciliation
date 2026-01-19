package tn.smi.gen.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ReservationTitreEntityPK implements Serializable {
    @Column(name = "CODE_PRODUIT_SERVICE")
    private Short codeProduitService;

    @Column(name = "NUM_DOSSIER")
    private Integer numDossier;

    public ReservationTitreEntityPK() {}

    public ReservationTitreEntityPK(Short codeProduitService, Integer numDossier) {
        this.codeProduitService = codeProduitService;
        this.numDossier = numDossier;
    }

    public Short getCodeProduitService() {
        return codeProduitService;
    }

    public void setCodeProduitService(Short codeProduitService) {
        this.codeProduitService = codeProduitService;
    }

    public Integer getNumDossier() {
        return numDossier;
    }

    public void setNumDossier(Integer numDossier) {
        this.numDossier = numDossier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReservationTitreEntityPK that = (ReservationTitreEntityPK) o;
        return Objects.equals(codeProduitService, that.codeProduitService) && Objects.equals(numDossier, that.numDossier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeProduitService, numDossier);
    }
}
