package tn.smi.domiciliation.services.Interface;

import tn.smi.domiciliation.entities.RestrictionImpNgpEntity;
import tn.smi.domiciliation.entities.RestrictionImpNgpEntityPK;

import java.util.List;

public interface IRestrictionImpNgp {
    RestrictionImpNgpEntity createRINGP(RestrictionImpNgpEntity restrictionImpNgp);
    RestrictionImpNgpEntity updateRINGP(RestrictionImpNgpEntity restrictionImpNgp, RestrictionImpNgpEntityPK restrictionImpNgpEntityPK);
    void deleteRINGP(RestrictionImpNgpEntityPK restrictionImpNgpEntityPK);

    RestrictionImpNgpEntity getByIdRINGP(RestrictionImpNgpEntityPK restrictionImpNgpEntityPK);
    List<RestrictionImpNgpEntity> getAllRINGP();
}
