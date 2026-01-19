package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.ReglementDelaisEntity;
import tn.smi.refproject.entities.ReglementDelaisEntityPK;
import tn.smi.refproject.repository.ReglementDelaiRepository;
import tn.smi.refproject.services.Interface.IReglementDelaisService;

import java.util.List;

@Service
@AllArgsConstructor
public class ReglementDelaisService implements IReglementDelaisService {
    private ReglementDelaiRepository reglementDelaiRepository;
    @Override
    public ReglementDelaisEntity getReglementDelaisById(ReglementDelaisEntityPK id) {
        return reglementDelaiRepository.findById(id).orElse(null);
    }

    @Override
    public List<ReglementDelaisEntity> getReglementDelaiss() {
        return reglementDelaiRepository.findAll();
    }
}
