package tn.smi.domiciliation.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.smi.domiciliation.entities.enumeration.TypeDerogation;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class DerogationCirculaireEntityPK implements Serializable {

    @Column(name = "TYPE_DEROGATION")
    @Enumerated(EnumType.STRING)
    private TypeDerogation typeDerogation;
    @Column(name = "CODE_DEROGATION_CIRCULAIRE")
    private String codeDerogationCirculaire;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DerogationCirculaireEntityPK that = (DerogationCirculaireEntityPK) o;

        if (typeDerogation != null ? !typeDerogation.equals(that.typeDerogation) : that.typeDerogation != null)
            return false;
        if (codeDerogationCirculaire != null ? !codeDerogationCirculaire.equals(that.codeDerogationCirculaire) : that.codeDerogationCirculaire != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = typeDerogation != null ? typeDerogation.hashCode() : 0;
        result = 31 * result + (codeDerogationCirculaire != null ? codeDerogationCirculaire.hashCode() : 0);
        return result;
    }
}
