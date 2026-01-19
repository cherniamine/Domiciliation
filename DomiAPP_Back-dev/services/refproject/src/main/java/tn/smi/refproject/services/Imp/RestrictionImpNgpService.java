package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.RestrictionImpNgpEntity;
import tn.smi.refproject.entities.RestrictionImpNgpEntityPK;
import tn.smi.refproject.repository.RestrictionImpNgpRepository;
import tn.smi.refproject.services.Interface.IRestrictionImpNgpService;

import java.util.List;

@Service
@AllArgsConstructor
public class RestrictionImpNgpService implements IRestrictionImpNgpService {
    private RestrictionImpNgpRepository restrictionImpNgpRepository;
    @Override
    public RestrictionImpNgpEntity getRestrictionImpNgpByid(RestrictionImpNgpEntityPK id) {
        return restrictionImpNgpRepository.findById(id).orElse(null);
    }

    @Override
    public List<RestrictionImpNgpEntity> getRestrictionImpNgps() {
        return restrictionImpNgpRepository.findAll();
    }
}
