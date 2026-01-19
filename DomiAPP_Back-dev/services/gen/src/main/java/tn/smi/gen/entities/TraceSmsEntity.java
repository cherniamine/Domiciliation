package tn.smi.gen.entities;

import jakarta.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@Table(name = "TRACE_SMS", schema = "GEN")
@IdClass(TraceSmsEntityPK.class)
public class TraceSmsEntity {
    @Id
    @Column(name = "ID_SMS")
    private BigInteger idSms;

    @Id
    @Column(name = "CODE_SERVICE")
    private BigInteger codeService;

    @Basic
    @Column(name = "TYPE_PIECE_CLIENT")
    private BigInteger typePieceClient;

    @Basic
    @Column(name = "NO_PIECE_CLIENT")
    private String noPieceClient;

    @Basic
    @Column(name = "NUM_COMPTE")
    private String numCompte;

    @Basic
    @Column(name = "NUM_TEL")
    private String numTel;

    @Basic
    @Column(name = "TEXT_SMS")
    private String textSms;

    @Basic
    @Column(name = "DATE_ENVOI")
    private Timestamp dateEnvoi;

    public BigInteger getIdSms() {
        return idSms;
    }

    public void setIdSms(BigInteger idSms) {
        this.idSms = idSms;
    }

    public BigInteger getCodeService() {
        return codeService;
    }

    public void setCodeService(BigInteger codeService) {
        this.codeService = codeService;
    }

    public BigInteger getTypePieceClient() {
        return typePieceClient;
    }

    public void setTypePieceClient(BigInteger typePieceClient) {
        this.typePieceClient = typePieceClient;
    }

    public String getNoPieceClient() {
        return noPieceClient;
    }

    public void setNoPieceClient(String noPieceClient) {
        this.noPieceClient = noPieceClient;
    }

    public String getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public String getTextSms() {
        return textSms;
    }

    public void setTextSms(String textSms) {
        this.textSms = textSms;
    }

    public Timestamp getDateEnvoi() {
        return dateEnvoi;
    }

    public void setDateEnvoi(Timestamp dateEnvoi) {
        this.dateEnvoi = dateEnvoi;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TraceSmsEntity that = (TraceSmsEntity) o;

        if (idSms != null ? !idSms.equals(that.idSms) : that.idSms != null) return false;
        if (codeService != null ? !codeService.equals(that.codeService) : that.codeService != null) return false;
        if (typePieceClient != null ? !typePieceClient.equals(that.typePieceClient) : that.typePieceClient != null)
            return false;
        if (noPieceClient != null ? !noPieceClient.equals(that.noPieceClient) : that.noPieceClient != null)
            return false;
        if (numCompte != null ? !numCompte.equals(that.numCompte) : that.numCompte != null) return false;
        if (numTel != null ? !numTel.equals(that.numTel) : that.numTel != null) return false;
        if (textSms != null ? !textSms.equals(that.textSms) : that.textSms != null) return false;
        if (dateEnvoi != null ? !dateEnvoi.equals(that.dateEnvoi) : that.dateEnvoi != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idSms != null ? idSms.hashCode() : 0;
        result = 31 * result + (codeService != null ? codeService.hashCode() : 0);
        result = 31 * result + (typePieceClient != null ? typePieceClient.hashCode() : 0);
        result = 31 * result + (noPieceClient != null ? noPieceClient.hashCode() : 0);
        result = 31 * result + (numCompte != null ? numCompte.hashCode() : 0);
        result = 31 * result + (numTel != null ? numTel.hashCode() : 0);
        result = 31 * result + (textSms != null ? textSms.hashCode() : 0);
        result = 31 * result + (dateEnvoi != null ? dateEnvoi.hashCode() : 0);
        return result;
    }
}
