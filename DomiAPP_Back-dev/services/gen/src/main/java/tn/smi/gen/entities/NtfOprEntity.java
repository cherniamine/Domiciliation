package tn.smi.gen.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "NTF_OPR", schema = "GEN", catalog = "")
@IdClass(NtfOprEntityPK.class)
public class NtfOprEntity {
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
    @Column(name = "CODE_NOTIFICATION")
    private int codeNotification;
    @Basic
    @Column(name = "ENV_CLT")
    private String envClt;
    @Basic
    @Column(name = "COP_AGC")
    private String copAgc;
    @Basic
    @Column(name = "OBJET")
    private String objet;
    @Basic
    @Column(name = "CORPS")
    private String corps;
    @Basic
    @Column(name = "ENV_INT")
    private String envInt;

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

    public String getEnvClt() {
        return envClt;
    }

    public void setEnvClt(String envClt) {
        this.envClt = envClt;
    }

    public String getCopAgc() {
        return copAgc;
    }

    public void setCopAgc(String copAgc) {
        this.copAgc = copAgc;
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

    public String getEnvInt() {
        return envInt;
    }

    public void setEnvInt(String envInt) {
        this.envInt = envInt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NtfOprEntity that = (NtfOprEntity) o;

        if (codeProduitService != that.codeProduitService) return false;
        if (codeOperation != that.codeOperation) return false;
        if (codeNotification != that.codeNotification) return false;
        if (envClt != null ? !envClt.equals(that.envClt) : that.envClt != null) return false;
        if (copAgc != null ? !copAgc.equals(that.copAgc) : that.copAgc != null) return false;
        if (objet != null ? !objet.equals(that.objet) : that.objet != null) return false;
        if (corps != null ? !corps.equals(that.corps) : that.corps != null) return false;
        if (envInt != null ? !envInt.equals(that.envInt) : that.envInt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) codeProduitService;
        result = 31 * result + (int) codeOperation;
        result = 31 * result + codeNotification;
        result = 31 * result + (envClt != null ? envClt.hashCode() : 0);
        result = 31 * result + (copAgc != null ? copAgc.hashCode() : 0);
        result = 31 * result + (objet != null ? objet.hashCode() : 0);
        result = 31 * result + (corps != null ? corps.hashCode() : 0);
        result = 31 * result + (envInt != null ? envInt.hashCode() : 0);
        return result;
    }
}
