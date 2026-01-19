package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.ActiviteSectionEntity;
import tn.smi.refproject.repository.ActiviteSectionRepository;
import tn.smi.refproject.services.Interface.IActiviteSectionService;

import java.util.List;

@Service
@AllArgsConstructor
public class ActiviteSectionService implements IActiviteSectionService {
    private ActiviteSectionRepository activiteSectionRepository;

    @Override
    public ActiviteSectionEntity getActiviteSectionById(String id) {
        return activiteSectionRepository.findById(id).orElse(null);
    }

    @Override
    public List<ActiviteSectionEntity> getActiviteSections() {
        return activiteSectionRepository.findAll();
    }
}
