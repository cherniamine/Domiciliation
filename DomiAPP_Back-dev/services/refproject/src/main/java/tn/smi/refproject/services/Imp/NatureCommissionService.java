package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.NatureCommissionEntity;
import tn.smi.refproject.entities.NatureCommissionEntityPK;
import tn.smi.refproject.repository.NatureCommissionRepository;
import tn.smi.refproject.services.Interface.INatureCommissionService;

import java.util.List;

@Service
@AllArgsConstructor
public class NatureCommissionService implements INatureCommissionService {
    private NatureCommissionRepository natureCommissionRepository;
    @Override
    public NatureCommissionEntity getNatureCommissionById(NatureCommissionEntityPK id) {
        return natureCommissionRepository.findById(id).orElse(null);
    }

    @Override
    public List<NatureCommissionEntity> getNatureCommissions() {
        return natureCommissionRepository.findAll();
    }
}
