package tn.smi.domiciliation.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Entity
@Setter
@AllArgsConstructor
@NoArgsConstructor
@jakarta.persistence.Table(name = "IMAGE_DETAIL_P_DEPOT", schema = "DOMI", catalog = "")
public class ImageDetailPDepotEntity {
    @EmbeddedId
    private ImageDetailPDepotEntityPK imageDetailPDepotEntityPK;

    @Basic
    @Column(name = "CODE_NGP")
    private Long codeNgp;

    @Basic
    @Column(name = "MONTANT_DVS_NGP")
    private Long montantDvsNgp;

    @Basic
    @Column(name = "CODE_PAYS_ORIG_NGP")
    private Byte codePaysOrigNgp;

    @Basic
    @Column(name = "QTE_NGP")
    private Integer qteNgp;

    @Basic
    @Column(name = "CODE_UNITE")
    private Byte codeUnite;

    @Basic
    @Column(name = "TEST_RESERVE")
    private String testReserve;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        ImageDetailPDepotEntity that = (ImageDetailPDepotEntity) o;
//
//        if (idTce != that.idTce) return false;
//        if (numRbq != that.numRbq) return false;
//        if (codeNgp != null ? !codeNgp.equals(that.codeNgp) : that.codeNgp != null) return false;
//        if (montantDvsNgp != null ? !montantDvsNgp.equals(that.montantDvsNgp) : that.montantDvsNgp != null)
//            return false;
//        if (codePaysOrigNgp != null ? !codePaysOrigNgp.equals(that.codePaysOrigNgp) : that.codePaysOrigNgp != null)
//            return false;
//        if (qteNgp != null ? !qteNgp.equals(that.qteNgp) : that.qteNgp != null) return false;
//        if (codeUnite != null ? !codeUnite.equals(that.codeUnite) : that.codeUnite != null) return false;
//        if (testReserve != null ? !testReserve.equals(that.testReserve) : that.testReserve != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = idTce;
//        result = 31 * result + numRbq;
//        result = 31 * result + (codeNgp != null ? codeNgp.hashCode() : 0);
//        result = 31 * result + (montantDvsNgp != null ? montantDvsNgp.hashCode() : 0);
//        result = 31 * result + (codePaysOrigNgp != null ? codePaysOrigNgp.hashCode() : 0);
//        result = 31 * result + (qteNgp != null ? qteNgp.hashCode() : 0);
//        result = 31 * result + (codeUnite != null ? codeUnite.hashCode() : 0);
//        result = 31 * result + (testReserve != null ? testReserve.hashCode() : 0);
//        return result;
//    }
}
