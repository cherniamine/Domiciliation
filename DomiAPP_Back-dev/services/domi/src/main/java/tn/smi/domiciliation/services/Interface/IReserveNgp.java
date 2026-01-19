package tn.smi.domiciliation.services.Interface;



import tn.smi.domiciliation.entities.ReserveNgpEntity;
import tn.smi.domiciliation.entities.ReserveNgpEntityPK;

import java.util.List;

public interface IReserveNgp {
    ReserveNgpEntity createRNGP(ReserveNgpEntity reserveNgp);
    ReserveNgpEntity updateRNGP(ReserveNgpEntity reserveNgp,ReserveNgpEntityPK reserveNgpEntityPK);
    void deleteRNGP(ReserveNgpEntityPK reserveNgpEntityPK);
    ReserveNgpEntity getByIdRNGP(ReserveNgpEntityPK reserveNgpEntityPK);
    List<ReserveNgpEntity> getAllRNGP();

}
