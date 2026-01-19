package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.CondFavComSurCrpEntity;
import tn.smi.refproject.repository.CondFavComSurCrpRepository;
import tn.smi.refproject.services.Interface.ICondFavComSurCrpService;

import java.util.List;

@Service
@AllArgsConstructor
public class CondFavComSurCrpService implements ICondFavComSurCrpService {
    private CondFavComSurCrpRepository comSurCrpRepository;
    @Override
    public CondFavComSurCrpEntity getCondFavComSurCrpById(Long id) {
        return comSurCrpRepository.findById(id).orElse(null);
    }

    @Override
    public List<CondFavComSurCrpEntity> getCondFavComSurCrps() {
        return comSurCrpRepository.findAll();
    }
}
