package tn.smi.gen.entities;

import jakarta.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "ETAT_OUT", schema = "GEN", catalog = "")
public class EtatOutEntity {
    @EmbeddedId
    private EtatOutEntityPK id;

    @Basic
    @Column(name = "DATE_OPERATION")
    private Date dateOperation;

    @Basic
    @Column(name = "REF_OPERATION")
    private Integer refOperation;

    @Basic
    @Column(name = "JOB_ID")
    private String jobId;

    @Basic
    @Column(name = "NOM_REPORT")
    private String nomReport;

    public EtatOutEntityPK getId() {
        return id;
    }

    public void setId(EtatOutEntityPK id) {
        this.id = id;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public Integer getRefOperation() {
        return refOperation;
    }

    public void setRefOperation(Integer refOperation) {
        this.refOperation = refOperation;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getNomReport() {
        return nomReport;
    }

    public void setNomReport(String nomReport) {
        this.nomReport = nomReport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EtatOutEntity that = (EtatOutEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(dateOperation, that.dateOperation) &&
                Objects.equals(refOperation, that.refOperation) &&
                Objects.equals(jobId, that.jobId) &&
                Objects.equals(nomReport, that.nomReport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateOperation, refOperation, jobId, nomReport);
    }
}
