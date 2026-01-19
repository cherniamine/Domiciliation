package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.ConditionParCorrespondantEntity;

import java.util.List;

public interface IConditionParCorrespondantService {
    ConditionParCorrespondantEntity getConditionParCorrespondantById(Long id);
    List<ConditionParCorrespondantEntity>getConditionParCorrespondants();
}
