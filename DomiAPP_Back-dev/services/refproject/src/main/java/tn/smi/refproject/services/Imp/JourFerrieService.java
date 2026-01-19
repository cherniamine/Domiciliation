package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.JourFerrieEntity;
import tn.smi.refproject.entities.JourFerrieEntityPK;
import tn.smi.refproject.repository.JourFerrieRepository;
import tn.smi.refproject.services.Interface.IJourFerrieService;

import java.util.List;

@Service
@AllArgsConstructor
public class JourFerrieService implements IJourFerrieService {
    private JourFerrieRepository jourFerrieRepository;
    @Override
    public JourFerrieEntity getJourFerrieById(JourFerrieEntityPK id) {
        return jourFerrieRepository.findById(id).orElse(null);
    }

    @Override
    public List<JourFerrieEntity> getJourFerries() {
        return jourFerrieRepository.findAll();
    }
}
