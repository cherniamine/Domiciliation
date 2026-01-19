package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.CommissionEntity;
import tn.smi.refproject.repository.CommissionRepository;
import tn.smi.refproject.services.Interface.ICommissionService;

import java.util.List;

@AllArgsConstructor
@Service
public class CommissionService implements ICommissionService {
    private CommissionRepository commissionRepository;
    @Override
    public CommissionEntity getCommissionById(int id) {
        return commissionRepository.findById(id).orElse(null);
    }

    @Override
    public List<CommissionEntity> getCommissions() {
        return commissionRepository.findAll();
    }
}
