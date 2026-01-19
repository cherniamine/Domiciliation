package tn.smi.domiciliation.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.domiciliation.entities.RestrictionImpNgpEntity;
import tn.smi.domiciliation.entities.RestrictionImpNgpEntityPK;
import tn.smi.domiciliation.repositories.RestrictionImpNgpRepository;
import tn.smi.domiciliation.services.Interface.IRestrictionImpNgp;

import java.util.List;

@Service
@AllArgsConstructor
public class ImpRestrictionImpNgp implements IRestrictionImpNgp {

    private RestrictionImpNgpRepository restrictionImpNgpRepository;
    @Override
    public RestrictionImpNgpEntity createRINGP(RestrictionImpNgpEntity restrictionImpNgp) {
        return restrictionImpNgpRepository.save(restrictionImpNgp);
    }

    @Override
    public RestrictionImpNgpEntity updateRINGP(RestrictionImpNgpEntity restrictionImpNgp, RestrictionImpNgpEntityPK restrictionImpNgpEntityPK) {
        //mafeha ken cle primaire hedhi
        return null;
    }

    @Override
    public void deleteRINGP(RestrictionImpNgpEntityPK restrictionImpNgpEntityPK) {
        restrictionImpNgpRepository.deleteById(restrictionImpNgpEntityPK);
    }

    @Override
    public RestrictionImpNgpEntity getByIdRINGP(RestrictionImpNgpEntityPK restrictionImpNgpEntityPK) {
        return restrictionImpNgpRepository.findById(restrictionImpNgpEntityPK).orElse(null);
    }

    @Override
    public List<RestrictionImpNgpEntity> getAllRINGP() {
        return restrictionImpNgpRepository.findAll();
    }
}
