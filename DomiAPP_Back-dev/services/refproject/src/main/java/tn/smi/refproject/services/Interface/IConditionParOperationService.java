package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.ConditionParOperationEntity;
import tn.smi.refproject.entities.ConditionParOperationEntityPK;

import java.util.List;

public interface IConditionParOperationService {
    ConditionParOperationEntity getConditionParOperationById(ConditionParOperationEntityPK id);
    List<ConditionParOperationEntity>getConditionParOperations();
}
