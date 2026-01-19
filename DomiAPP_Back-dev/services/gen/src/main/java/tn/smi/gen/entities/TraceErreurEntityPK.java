package tn.smi.gen.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

public class TraceErreurEntityPK implements Serializable {
    private Timestamp dateLog;
    private String module;
    private String operation;

    public TraceErreurEntityPK() {}

    public TraceErreurEntityPK(Timestamp dateLog, String module, String operation) {
        this.dateLog = dateLog;
        this.module = module;
        this.operation = operation;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TraceErreurEntityPK that = (TraceErreurEntityPK) o;
        return Objects.equals(dateLog, that.dateLog) &&
                Objects.equals(module, that.module) &&
                Objects.equals(operation, that.operation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateLog, module, operation);
    }
}
