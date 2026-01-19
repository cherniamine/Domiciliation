package tn.smi.gen.entities;

import jakarta.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Arrays;

@Entity
@Table(name = "TRACE_MAIL", schema = "GEN")
public class TraceMailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DOC_ID")
    private BigInteger docId;

    @Lob
    @Column(name = "ATTACHEMENT")
    private byte[] attachement;

    @Column(name = "RECEIPIENTS", length = 255)
    private String recipients;

    @Column(name = "BCC", length = 255)
    private String bcc;

    @Column(name = "SUBJECT", length = 255)
    private String subject;

    @Column(name = "MESSAGE", length = 255)
    private String message;

    @Column(name = "ATT_FILENAME", length = 255)
    private String attFilename;

    @Column(name = "ENVOYE_O_N", length = 255)
    private String envoyeON;

    @Column(name = "DATE_ENVOI")
    private Timestamp dateEnvoi;

    @Column(name = "SENDER", length = 255)
    private String sender;

    // Getters and Setters
    public BigInteger getDocId() {
        return docId;
    }

    public void setDocId(BigInteger docId) {
        this.docId = docId;
    }

    public byte[] getAttachement() {
        return attachement;
    }

    public void setAttachement(byte[] attachement) {
        this.attachement = attachement;
    }

    public String getRecipients() {
        return recipients;
    }

    public void setRecipients(String recipients) {
        this.recipients = recipients;
    }

    public String getBcc() {
        return bcc;
    }

    public void setBcc(String bcc) {
        this.bcc = bcc;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAttFilename() {
        return attFilename;
    }

    public void setAttFilename(String attFilename) {
        this.attFilename = attFilename;
    }

    public String getEnvoyeON() {
        return envoyeON;
    }

    public void setEnvoyeON(String envoyeON) {
        this.envoyeON = envoyeON;
    }

    public Timestamp getDateEnvoi() {
        return dateEnvoi;
    }

    public void setDateEnvoi(Timestamp dateEnvoi) {
        this.dateEnvoi = dateEnvoi;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TraceMailEntity that = (TraceMailEntity) o;

        if (docId != null ? !docId.equals(that.docId) : that.docId != null) return false;
        if (!Arrays.equals(attachement, that.attachement)) return false;
        if (recipients != null ? !recipients.equals(that.recipients) : that.recipients != null) return false;
        if (bcc != null ? !bcc.equals(that.bcc) : that.bcc != null) return false;
        if (subject != null ? !subject.equals(that.subject) : that.subject != null) return false;
        if (message != null ? !message.equals(that.message) : that.message != null) return false;
        if (attFilename != null ? !attFilename.equals(that.attFilename) : that.attFilename != null) return false;
        if (envoyeON != null ? !envoyeON.equals(that.envoyeON) : that.envoyeON != null) return false;
        if (dateEnvoi != null ? !dateEnvoi.equals(that.dateEnvoi) : that.dateEnvoi != null) return false;
        return sender != null ? sender.equals(that.sender) : that.sender == null;
    }

    @Override
    public int hashCode() {
        int result = docId != null ? docId.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(attachement);
        result = 31 * result + (recipients != null ? recipients.hashCode() : 0);
        result = 31 * result + (bcc != null ? bcc.hashCode() : 0);
        result = 31 * result + (subject != null ? subject.hashCode() : 0);
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (attFilename != null ? attFilename.hashCode() : 0);
        result = 31 * result + (envoyeON != null ? envoyeON.hashCode() : 0);
        result = 31 * result + (dateEnvoi != null ? dateEnvoi.hashCode() : 0);
        result = 31 * result + (sender != null ? sender.hashCode() : 0);
        return result;
    }
}
