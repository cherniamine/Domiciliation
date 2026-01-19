package tn.smi.gen.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "REQUETE_EXCEL_PARAM", schema = "GEN", catalog = "")
@IdClass(RequeteExcelParamEntityPK.class)
public class RequeteExcelParamEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CODE_PRODUIT_SERVICE")
    private short codeProduitService;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_REQUETE")
    private byte idRequete;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_PARAM")
    private String idParam;
    @Basic
    @Column(name = "LIB_PARAM")
    private String libParam;
    @Basic
    @Column(name = "TYPE")
    private String type;
    @Basic
    @Column(name = "OBLIGATOIRE_O_N")
    private String obligatoireON;
    @Basic
    @Column(name = "VALEURS_POSSIBLES")
    private String valeursPossibles;
    @Basic
    @Column(name = "VALEUR_DEFAUT")
    private String valeurDefaut;

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

    public String getLibParam() {
        return libParam;
    }

    public void setLibParam(String libParam) {
        this.libParam = libParam;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getObligatoireON() {
        return obligatoireON;
    }

    public void setObligatoireON(String obligatoireON) {
        this.obligatoireON = obligatoireON;
    }

    public String getValeursPossibles() {
        return valeursPossibles;
    }

    public void setValeursPossibles(String valeursPossibles) {
        this.valeursPossibles = valeursPossibles;
    }

    public String getValeurDefaut() {
        return valeurDefaut;
    }

    public void setValeurDefaut(String valeurDefaut) {
        this.valeurDefaut = valeurDefaut;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RequeteExcelParamEntity that = (RequeteExcelParamEntity) o;

        if (codeProduitService != that.codeProduitService) return false;
        if (idRequete != that.idRequete) return false;
        if (idParam != null ? !idParam.equals(that.idParam) : that.idParam != null) return false;
        if (libParam != null ? !libParam.equals(that.libParam) : that.libParam != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (obligatoireON != null ? !obligatoireON.equals(that.obligatoireON) : that.obligatoireON != null)
            return false;
        if (valeursPossibles != null ? !valeursPossibles.equals(that.valeursPossibles) : that.valeursPossibles != null)
            return false;
        if (valeurDefaut != null ? !valeurDefaut.equals(that.valeurDefaut) : that.valeurDefaut != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) codeProduitService;
        result = 31 * result + (int) idRequete;
        result = 31 * result + (idParam != null ? idParam.hashCode() : 0);
        result = 31 * result + (libParam != null ? libParam.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (obligatoireON != null ? obligatoireON.hashCode() : 0);
        result = 31 * result + (valeursPossibles != null ? valeursPossibles.hashCode() : 0);
        result = 31 * result + (valeurDefaut != null ? valeurDefaut.hashCode() : 0);
        return result;
    }
}
