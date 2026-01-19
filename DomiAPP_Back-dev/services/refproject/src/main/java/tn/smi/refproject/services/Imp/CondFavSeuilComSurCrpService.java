package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.CondFavSeuilComSurCrpEntity;
import tn.smi.refproject.repository.CondFavSeuilComSurCrpRepository;
import tn.smi.refproject.services.Interface.ICondFavSeuilComSurCrpService;

import java.util.List;

@Service
@AllArgsConstructor
public class CondFavSeuilComSurCrpService implements ICondFavSeuilComSurCrpService {
    private CondFavSeuilComSurCrpRepository comSurCrpRepository;
    @Override
    public CondFavSeuilComSurCrpEntity getCondFavSeuilComSurCrpById(Long id) {
        return comSurCrpRepository.findById(id).orElse(null);
    }

    @Override
    public List<CondFavSeuilComSurCrpEntity> getCondFavSeuilComSurCrps() {
        return comSurCrpRepository.findAll();
    }
}
