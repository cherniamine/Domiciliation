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
@Embeddable
public class ImageDetailPDepotEntityPK implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TCE")
    private int idTce;

    @Column(name = "NUM_RBQ")
    private int numRbq;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImageDetailPDepotEntityPK that = (ImageDetailPDepotEntityPK) o;

        if (idTce != that.idTce) return false;
        if (numRbq != that.numRbq) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTce;
        result = 31 * result + numRbq;
        return result;
    }
}
