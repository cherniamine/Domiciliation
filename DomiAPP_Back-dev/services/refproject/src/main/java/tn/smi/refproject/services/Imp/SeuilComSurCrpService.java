package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.SeuilComSurCrpEntity;
import tn.smi.refproject.repository.SeuilComSurCrpRepository;
import tn.smi.refproject.services.Interface.ISeuilComSurCrpService;

import java.util.List;

@Service
@AllArgsConstructor
public class SeuilComSurCrpService implements ISeuilComSurCrpService {
    private SeuilComSurCrpRepository seuilComSurCrpRepository;
    @Override
    public SeuilComSurCrpEntity getSeuilComSurCrpById(Long id) {
        return seuilComSurCrpRepository.findById(id).orElse(null);
    }

    @Override
    public List<SeuilComSurCrpEntity> getSeuilComSurCrps() {
        return seuilComSurCrpRepository.findAll();
    }
}
