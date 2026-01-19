package tn.smi.gen.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Objects;

public class TraceSmsEntityPK implements Serializable {
    private BigInteger idSms;
    private BigInteger codeService;

    public TraceSmsEntityPK() {}

    public TraceSmsEntityPK(BigInteger idSms, BigInteger codeService) {
        this.idSms = idSms;
        this.codeService = codeService;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TraceSmsEntityPK that = (TraceSmsEntityPK) o;
        return Objects.equals(idSms, that.idSms) &&
                Objects.equals(codeService, that.codeService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSms, codeService);
    }
}
