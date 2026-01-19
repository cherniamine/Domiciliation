package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.ConditionParCorrespondantEntity;
import tn.smi.refproject.repository.ConditionParCorrespandantRepository;
import tn.smi.refproject.services.Interface.IConditionParCorrespondantService;

import java.util.List;

@Service
@AllArgsConstructor
public class ConditionParCorrespondantService implements IConditionParCorrespondantService {
    private ConditionParCorrespandantRepository conditionParCorrespandantRepository;
    @Override
    public ConditionParCorrespondantEntity getConditionParCorrespondantById(Long id) {
        return conditionParCorrespandantRepository.findById(id).orElse(null);
    }

    @Override
    public List<ConditionParCorrespondantEntity> getConditionParCorrespondants() {
        return conditionParCorrespandantRepository.findAll();
    }
}
