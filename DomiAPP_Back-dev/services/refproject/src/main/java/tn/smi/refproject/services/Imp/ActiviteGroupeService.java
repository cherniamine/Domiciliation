package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.ActiviteGroupeEntity;
import tn.smi.refproject.entities.ActiviteGroupeEntityPK;
import tn.smi.refproject.repository.ActiviteGroupeRepository;
import tn.smi.refproject.services.Interface.IActiviteGroupeService;

import java.util.List;

@Service
@AllArgsConstructor
public class ActiviteGroupeService implements IActiviteGroupeService {
    private ActiviteGroupeRepository activiteGroupeRepository;
    @Override
    public ActiviteGroupeEntity getActiviteGroupeById(ActiviteGroupeEntityPK id) {
        return activiteGroupeRepository.findById(id).orElse(null);
    }

    @Override
    public List<ActiviteGroupeEntity> getActiviteGroupes() {
        return activiteGroupeRepository.findAll();
    }
}
