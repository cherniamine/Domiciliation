package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.RestrictionImpNgpEntity;
import tn.smi.refproject.entities.RestrictionImpNgpEntityPK;

import java.util.List;

public interface IRestrictionImpNgpService {
    RestrictionImpNgpEntity getRestrictionImpNgpByid(RestrictionImpNgpEntityPK id);
    List<RestrictionImpNgpEntity>getRestrictionImpNgps();
}
