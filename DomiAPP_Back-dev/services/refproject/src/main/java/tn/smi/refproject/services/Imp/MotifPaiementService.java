package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.MotifPaiementEntity;
import tn.smi.refproject.repository.MotifPaiementRepository;
import tn.smi.refproject.services.Interface.IMotifPaiementService;

import java.util.List;

@Service
@AllArgsConstructor
public class MotifPaiementService implements IMotifPaiementService {
    private MotifPaiementRepository motifPaiementRepository;
    @Override
    public MotifPaiementEntity getMotifPaiementById(Byte id) {
        return motifPaiementRepository.findById(id).orElse(null);
    }

    @Override
    public List<MotifPaiementEntity> getMotifPaiements() {
        return motifPaiementRepository.findAll();
    }
}
