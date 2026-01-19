package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.ActiviteClasseEntity;
import tn.smi.refproject.entities.ActiviteClasseEntityPK;
import tn.smi.refproject.repository.ActiviteClasseRepository;
import tn.smi.refproject.services.Interface.IActiviteClasseService;

import java.util.List;
@Service
@AllArgsConstructor
public class ActiviteClasseService implements IActiviteClasseService {
    private ActiviteClasseRepository activiteClasseRepository;
    @Override
    public ActiviteClasseEntity getActiviteClasseById(ActiviteClasseEntityPK id) {
        return activiteClasseRepository.findById(id).orElse(null);
    }

    @Override
    public List<ActiviteClasseEntity> getActiviteClasses() {
        return activiteClasseRepository.findAll();
    }
}
