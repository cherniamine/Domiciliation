package tn.smi.gen.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "REQUETE_EXCEL", schema = "GEN")
@IdClass(RequeteExcelEntityPK.class)
public class RequeteExcelEntity {

    @Id
    @Column(name = "CODE_PRODUIT_SERVICE")
    private short codeProduitService;

    @Id
    @Column(name = "ID_REQUETE")
    private short idRequete;

    @Lob
    @Column(name = "CORPS_REQUETE", columnDefinition = "CLOB")
    private String corpsRequete;

    @Basic
    @Column(name = "LIBELLE_REQUETE")
    private String libelleRequete;

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

    public String getCorpsRequete() {
        return corpsRequete;
    }

    public void setCorpsRequete(String corpsRequete) {
        this.corpsRequete = corpsRequete;
    }

    public String getLibelleRequete() {
        return libelleRequete;
    }

    public void setLibelleRequete(String libelleRequete) {
        this.libelleRequete = libelleRequete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RequeteExcelEntity that = (RequeteExcelEntity) o;

        if (codeProduitService != that.codeProduitService) return false;
        if (idRequete != that.idRequete) return false;
        if (corpsRequete != null ? !corpsRequete.equals(that.corpsRequete) : that.corpsRequete != null) return false;
        return libelleRequete != null ? libelleRequete.equals(that.libelleRequete) : that.libelleRequete == null;
    }

    @Override
    public int hashCode() {
        int result = (int) codeProduitService;
        result = 31 * result + (int) idRequete;
        result = 31 * result + (corpsRequete != null ? corpsRequete.hashCode() : 0);
        result = 31 * result + (libelleRequete != null ? libelleRequete.hashCode() : 0);
        return result;
    }
}
