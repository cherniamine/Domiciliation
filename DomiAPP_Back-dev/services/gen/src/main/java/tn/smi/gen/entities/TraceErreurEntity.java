package tn.smi.gen.entities;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "TRACE_ERREUR", schema = "GEN")
@IdClass(TraceErreurEntityPK.class)
public class TraceErreurEntity {
    @Id
    @Column(name = "DATE_LOG")
    private Timestamp dateLog;

    @Id
    @Column(name = "MODULE")
    private String module;

    @Id
    @Column(name = "OPERATION")
    private String operation;

    @Basic
    @Column(name = "NUM_DOSSIER")
    private String numDossier;

    @Basic
    @Column(name = "ERREUR")
    private String erreur;

    @Basic
    @Column(name = "NIVEAU")
    private String niveau;

    public Timestamp getDateLog() {
        return dateLog;
    }

    public void setDateLog(Timestamp dateLog) {
        this.dateLog = dateLog;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getNumDossier() {
        return numDossier;
    }

    public void setNumDossier(String numDossier) {
        this.numDossier = numDossier;
    }

    public String getErreur() {
        return erreur;
    }

    public void setErreur(String erreur) {
        this.erreur = erreur;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TraceErreurEntity that = (TraceErreurEntity) o;

        if (dateLog != null ? !dateLog.equals(that.dateLog) : that.dateLog != null) return false;
        if (module != null ? !module.equals(that.module) : that.module != null) return false;
        if (operation != null ? !operation.equals(that.operation) : that.operation != null) return false;
        if (numDossier != null ? !numDossier.equals(that.numDossier) : that.numDossier != null) return false;
        if (erreur != null ? !erreur.equals(that.erreur) : that.erreur != null) return false;
        if (niveau != null ? !niveau.equals(that.niveau) : that.niveau != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dateLog != null ? dateLog.hashCode() : 0;
        result = 31 * result + (module != null ? module.hashCode() : 0);
        result = 31 * result + (operation != null ? operation.hashCode() : 0);
        result = 31 * result + (numDossier != null ? numDossier.hashCode() : 0);
        result = 31 * result + (erreur != null ? erreur.hashCode() : 0);
        result = 31 * result + (niveau != null ? niveau.hashCode() : 0);
        return result;
    }
}
