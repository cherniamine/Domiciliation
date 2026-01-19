package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.CommissionParTypeEntity;
import tn.smi.refproject.repository.CommissionParTypeRepository;
import tn.smi.refproject.services.Interface.ICommissionParTypeService;

import java.util.List;

@Service
@AllArgsConstructor
public class CommissionParTypeService implements ICommissionParTypeService {
    private CommissionParTypeRepository commissionParTypeRepository;
    @Override
    public CommissionParTypeEntity getCommissionParTypeById(Short id) {
        return commissionParTypeRepository.findById(id).orElse(null);
    }

    @Override
    public List<CommissionParTypeEntity> getCommissionParTypes() {
        return commissionParTypeRepository.findAll();
    }
}
