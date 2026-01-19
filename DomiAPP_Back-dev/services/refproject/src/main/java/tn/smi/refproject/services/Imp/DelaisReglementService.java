package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.DelaisReglementEntity;
import tn.smi.refproject.repository.DelaiReglementRepository;
import tn.smi.refproject.services.Interface.IDelaisReglementService;

import java.util.List;

@Service
@AllArgsConstructor
public class DelaisReglementService implements IDelaisReglementService {
    private DelaiReglementRepository delaiReglementRepository;

    @Override
    public DelaisReglementEntity getDelaisReglementById(Byte id) {
        return delaiReglementRepository.findById(id).orElse(null);
    }

    @Override
    public List<DelaisReglementEntity> getDelaisReglements() {
        return delaiReglementRepository.findAll();
    }

    @Override
    public List<Long> getAllCodeDelReg() {
        return delaiReglementRepository.findAllCodeDelReg();
    }
}
