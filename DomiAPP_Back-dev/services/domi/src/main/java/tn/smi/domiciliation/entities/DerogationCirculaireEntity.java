package tn.smi.domiciliation.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.smi.domiciliation.entities.enumeration.NatureDerogation;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@jakarta.persistence.Table(name = "DEROGATION_CIRCULAIRE", schema = "DOMI", catalog = "")
public class DerogationCirculaireEntity {
    @EmbeddedId
    private DerogationCirculaireEntityPK derogationCirculaireEntityPK;

    @Basic
    @Column(name = "LIBELLE_DEROGATION_CIRCULAIRE")
    private String libelleDerogationCirculaire;

    @Basic
    @Column(name = "NATURE_DEROGATION")
    @Enumerated(EnumType.STRING)
    private NatureDerogation natureDerogation;



//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        DerogationCirculaireEntity that = (DerogationCirculaireEntity) o;
//
//        if (typeDerogation != null ? !typeDerogation.equals(that.typeDerogation) : that.typeDerogation != null)
//            return false;
//        if (codeDerogationCirculaire != null ? !codeDerogationCirculaire.equals(that.codeDerogationCirculaire) : that.codeDerogationCirculaire != null)
//            return false;
//        if (libelleDerogationCirculaire != null ? !libelleDerogationCirculaire.equals(that.libelleDerogationCirculaire) : that.libelleDerogationCirculaire != null)
//            return false;
//        if (natureDerogation != null ? !natureDerogation.equals(that.natureDerogation) : that.natureDerogation != null)
//            return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = typeDerogation != null ? typeDerogation.hashCode() : 0;
//        result = 31 * result + (codeDerogationCirculaire != null ? codeDerogationCirculaire.hashCode() : 0);
//        result = 31 * result + (libelleDerogationCirculaire != null ? libelleDerogationCirculaire.hashCode() : 0);
//        result = 31 * result + (natureDerogation != null ? natureDerogation.hashCode() : 0);
//        return result;
//    }
}
