package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.ModePaiementEntity;
import tn.smi.refproject.repository.ModePaiementRepository;
import tn.smi.refproject.services.Interface.IModePaiementService;

import java.util.List;

@Service
@AllArgsConstructor
public class ModePaiementService implements IModePaiementService {
    private ModePaiementRepository modePaiementRepository;
    @Override
    public ModePaiementEntity getModePaiementById(String id) {
        return modePaiementRepository.findById(id).orElse(null);
    }

    @Override
    public List<ModePaiementEntity> getModePaiements() {
        return modePaiementRepository.findAll();
    }
}
