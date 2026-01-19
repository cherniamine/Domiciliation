package tn.smi.domiciliation.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@jakarta.persistence.Table(name = "RESERVES", schema = "DOMI", catalog = "")
public class ReservesEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "CODE_RESERVE")
    private byte codeReserve;


    @Basic
    @Column(name = "LIB_RESERVE")
    private String libReserve;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReservesEntity that = (ReservesEntity) o;

        if (codeReserve != that.codeReserve) return false;
        if (libReserve != null ? !libReserve.equals(that.libReserve) : that.libReserve != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) codeReserve;
        result = 31 * result + (libReserve != null ? libReserve.hashCode() : 0);
        return result;
    }
}
