package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.ModeDeLivraisonEntity;
import tn.smi.refproject.repository.ModeDeLivraisonRepository;
import tn.smi.refproject.services.Interface.IModeDeLivraisonService;

import java.util.List;

@Service
@AllArgsConstructor
public class ModeDeLivraisonService implements IModeDeLivraisonService {
    private ModeDeLivraisonRepository modeDeLivraisonRepository;
    @Override
    public ModeDeLivraisonEntity getModeDeLivraisonById(Byte id) {
        return modeDeLivraisonRepository.findById(id).orElse(null);
    }

    @Override
    public List<ModeDeLivraisonEntity> getModeDeLivraisons() {
        return modeDeLivraisonRepository.findAll();
    }

    @Override
    public List<Long> getAllModLiv() {
        return modeDeLivraisonRepository.findAllCodeModLiv();
    }
}
