package tn.smi.gen.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "DIC_DON", schema = "GEN", catalog = "")
@IdClass(DicDonEntityPK.class)
public class DicDonEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CODE_PRODUIT_SERVICE")
    private byte codeProduitService;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CODE_OPERATION")
    private short codeOperation;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "NOM_DONNEE")
    private String nomDonnee;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "NOM_ELEMENT")
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

        DicDonEntity that = (DicDonEntity) o;

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
