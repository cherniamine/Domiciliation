package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.CoursJoursDeviseEntity;
import tn.smi.refproject.entities.CoursJoursDeviseEntityPK;
import tn.smi.refproject.repository.CoursJourDeviseRepository;
import tn.smi.refproject.services.Interface.ICoursJourDeviseService;

import java.util.List;

@Service
@AllArgsConstructor
public class CoursJourDeviseService implements ICoursJourDeviseService {
    private CoursJourDeviseRepository coursJourDeviseRepository;
    @Override
    public CoursJoursDeviseEntity getCoursJourDeviseById(CoursJoursDeviseEntityPK id) {
        return coursJourDeviseRepository.findById(id).orElse(null);
    }

    @Override
    public List<CoursJoursDeviseEntity> getCoursJourDevises() {
        return coursJourDeviseRepository.findAll();
    }
}
