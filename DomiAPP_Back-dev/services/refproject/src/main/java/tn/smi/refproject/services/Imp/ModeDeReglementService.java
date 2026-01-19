package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.ModeDeReglementEntity;
import tn.smi.refproject.repository.ModeDeReglementRepository;
import tn.smi.refproject.services.Interface.IModeDeReglementService;

import java.util.List;

@Service
@AllArgsConstructor
public class ModeDeReglementService implements IModeDeReglementService {
    private ModeDeReglementRepository modeDeReglementRepository;
    @Override
    public ModeDeReglementEntity getModeDeReglementById(Byte id) {
        return modeDeReglementRepository.findById(id).orElse(null);
    }

    @Override
    public List<ModeDeReglementEntity> getModeDeReglements() {
        return modeDeReglementRepository.findAll();
    }

    @Override
    public List<Long> getAllCodeModReg() {
        return modeDeReglementRepository.findAllCodeModReg();
    }
}
