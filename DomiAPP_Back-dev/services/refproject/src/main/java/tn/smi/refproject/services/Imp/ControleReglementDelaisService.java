package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.ControleReglementDelaisEntity;
import tn.smi.refproject.entities.ControleReglementDelaisEntityPK;
import tn.smi.refproject.repository.ControleReglementDelaiRepository;
import tn.smi.refproject.services.Interface.IControleReglementDelaisService;

import java.util.List;

@Service
@AllArgsConstructor
public class ControleReglementDelaisService implements IControleReglementDelaisService {
    private ControleReglementDelaiRepository controleReglementDelaiRepository;
    @Override
    public ControleReglementDelaisEntity getControleReglementDelaisById(ControleReglementDelaisEntityPK id) {
        return controleReglementDelaiRepository.findById(id).orElse(null);
    }

    @Override
    public List<ControleReglementDelaisEntity> getControleReglementDelaiss() {
        return controleReglementDelaiRepository.findAll();
    }
}
