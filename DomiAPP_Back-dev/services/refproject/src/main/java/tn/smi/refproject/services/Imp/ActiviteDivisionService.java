package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.ActiviteDivisionEntity;
import tn.smi.refproject.entities.ActiviteDivisionEntityPK;
import tn.smi.refproject.repository.ActiviteDivisionRepository;
import tn.smi.refproject.services.Interface.IActiviteDivisionService;

import java.util.List;

@Service
@AllArgsConstructor
public class ActiviteDivisionService implements IActiviteDivisionService {
    private ActiviteDivisionRepository activiteDivisionRepository;

    @Override
    public ActiviteDivisionEntity getActiviteDivisionById(ActiviteDivisionEntityPK id) {
        return activiteDivisionRepository.findById(id).orElse(null);
    }

    @Override
    public List<ActiviteDivisionEntity> getActiviteDivisions() {
        return activiteDivisionRepository.findAll();
    }
}
