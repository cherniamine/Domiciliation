package tn.smi.gen.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PositionCompteMultDeviseEntityPK implements Serializable {

    @Column(name = "ID_POSITION")
    private Integer idPosition;

    @Column(name = "CODE_OPERATION")
    private Integer codeOperation;



    public PositionCompteMultDeviseEntityPK() {}

    public PositionCompteMultDeviseEntityPK(Integer idPosition, Integer codeOperation) {
        this.idPosition = idPosition;
        this.codeOperation = codeOperation;
    }

    public Integer getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(Integer idPosition) {
        this.idPosition = idPosition;
    }

    public Integer getCodeOperation() {
        return codeOperation;
    }

    public void setCodeOperation(Integer codeOperation) {
        this.codeOperation = codeOperation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PositionCompteMultDeviseEntityPK that = (PositionCompteMultDeviseEntityPK) o;
        return Objects.equals(idPosition, that.idPosition) &&
                Objects.equals(codeOperation, that.codeOperation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPosition, codeOperation);
    }
}
