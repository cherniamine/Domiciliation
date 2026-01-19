package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.ConditionParOperationEntity;
import tn.smi.refproject.entities.ConditionParOperationEntityPK;
import tn.smi.refproject.repository.ConditionParOperationRepository;
import tn.smi.refproject.services.Interface.IConditionParOperationService;

import java.util.List;
@Service
@AllArgsConstructor
public class ConditionParOperationService implements IConditionParOperationService {
    private ConditionParOperationRepository conditionParOperationRepository;
    @Override
    public ConditionParOperationEntity getConditionParOperationById(ConditionParOperationEntityPK id) {
        return conditionParOperationRepository.findById(id).orElse(null);
    }

    @Override
    public List<ConditionParOperationEntity> getConditionParOperations() {
        return conditionParOperationRepository.findAll();
    }
}
