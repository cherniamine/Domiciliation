package tn.smi.domiciliation.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@jakarta.persistence.Table(name = "DETAIL_P_DEPOT", schema = "DOMI", catalog = "")
public class DetailPDepotEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic
    @Column(name = "ID_TCE")
    private int idTce;

//    @EmbeddedId
//    private DetailPDepotEntityPK detailPDepotEntityPK;

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
    @Column(name = "CODE_UNITE")
    private Byte codeUnite;


    @Basic
    @Column(name = "QTE_NGP")
    private Integer qteNgp;


    @Basic
    @Column(name = "TEST_RESERVE")
    private String testReserve;

    @JsonIgnore
    @ManyToOne
    DepotDomiciliationTitreEntity depotdomiciliationtitreentity;


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        DetailPDepotEntity that = (DetailPDepotEntity) o;
//
//        if (codeProduitService != that.codeProduitService) return false;
//        if (codeOperation != that.codeOperation) return false;
//        if (refOperation != that.refOperation) return false;
//        if (numRbq != that.numRbq) return false;
//        if (dateOperation != null ? !dateOperation.equals(that.dateOperation) : that.dateOperation != null)
//            return false;
//        if (codeNgp != null ? !codeNgp.equals(that.codeNgp) : that.codeNgp != null) return false;
//        if (montantDvsNgp != null ? !montantDvsNgp.equals(that.montantDvsNgp) : that.montantDvsNgp != null)
//            return false;
//        if (codePaysOrigNgp != null ? !codePaysOrigNgp.equals(that.codePaysOrigNgp) : that.codePaysOrigNgp != null)
//            return false;
//        if (codeUnite != null ? !codeUnite.equals(that.codeUnite) : that.codeUnite != null) return false;
//        if (qteNgp != null ? !qteNgp.equals(that.qteNgp) : that.qteNgp != null) return false;
//        if (testReserve != null ? !testReserve.equals(that.testReserve) : that.testReserve != null) return false;
//        if (idTce != null ? !idTce.equals(that.idTce) : that.idTce != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = (int) codeProduitService;
//        result = 31 * result + (int) codeOperation;
//        result = 31 * result + (dateOperation != null ? dateOperation.hashCode() : 0);
//        result = 31 * result + refOperation;
//        result = 31 * result + numRbq;
//        result = 31 * result + (codeNgp != null ? codeNgp.hashCode() : 0);
//        result = 31 * result + (montantDvsNgp != null ? montantDvsNgp.hashCode() : 0);
//        result = 31 * result + (codePaysOrigNgp != null ? codePaysOrigNgp.hashCode() : 0);
//        result = 31 * result + (codeUnite != null ? codeUnite.hashCode() : 0);
//        result = 31 * result + (qteNgp != null ? qteNgp.hashCode() : 0);
//        result = 31 * result + (testReserve != null ? testReserve.hashCode() : 0);
//        result = 31 * result + (idTce != null ? idTce.hashCode() : 0);
//        return result;
//    }
}
