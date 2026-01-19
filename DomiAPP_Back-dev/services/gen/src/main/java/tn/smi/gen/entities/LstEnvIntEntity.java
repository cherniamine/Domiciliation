package tn.smi.gen.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "LST_ENV_INT", schema = "GEN", catalog = "")
@IdClass(LstEnvIntEntityPK.class)
public class LstEnvIntEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CODE_PRODUIT_SERVICE")
    private byte codeProduitService;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CODE_OPERATION")
    private short codeOperation;
    @Basic
    @Column(name = "CODE_NOTIFICATION")
    private Integer codeNotification;
    @Basic
    @Column(name = "ADD_MAIL")
    private String addMail;
    @Basic
    @Column(name = "OBJET")
    private String objet;
    @Basic
    @Column(name = "CORPS")
    private String corps;

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

    public Integer getCodeNotification() {
        return codeNotification;
    }

    public void setCodeNotification(Integer codeNotification) {
        this.codeNotification = codeNotification;
    }

    public String getAddMail() {
        return addMail;
    }

    public void setAddMail(String addMail) {
        this.addMail = addMail;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getCorps() {
        return corps;
    }

    public void setCorps(String corps) {
        this.corps = corps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LstEnvIntEntity that = (LstEnvIntEntity) o;

        if (codeProduitService != that.codeProduitService) return false;
        if (codeOperation != that.codeOperation) return false;
        if (codeNotification != null ? !codeNotification.equals(that.codeNotification) : that.codeNotification != null)
            return false;
        if (addMail != null ? !addMail.equals(that.addMail) : that.addMail != null) return false;
        if (objet != null ? !objet.equals(that.objet) : that.objet != null) return false;
        if (corps != null ? !corps.equals(that.corps) : that.corps != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) codeProduitService;
        result = 31 * result + (int) codeOperation;
        result = 31 * result + (codeNotification != null ? codeNotification.hashCode() : 0);
        result = 31 * result + (addMail != null ? addMail.hashCode() : 0);
        result = 31 * result + (objet != null ? objet.hashCode() : 0);
        result = 31 * result + (corps != null ? corps.hashCode() : 0);
        return result;
    }
}
