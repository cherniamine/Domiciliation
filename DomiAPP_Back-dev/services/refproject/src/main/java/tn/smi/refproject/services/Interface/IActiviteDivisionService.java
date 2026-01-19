package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.ActiviteDivisionEntity;
import tn.smi.refproject.entities.ActiviteDivisionEntityPK;

import java.util.List;

public interface IActiviteDivisionService {
    ActiviteDivisionEntity getActiviteDivisionById(ActiviteDivisionEntityPK id);
    List<ActiviteDivisionEntity> getActiviteDivisions();
}
