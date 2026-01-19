package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.CondFavComSurCrpPallierEntity;
import tn.smi.refproject.repository.CondFavComSurCrpPallierRepository;
import tn.smi.refproject.services.Interface.ICondFavComSurCrpPalierService;

import java.util.List;

@Service
@AllArgsConstructor
public class CondFavComSurCrpPallierService implements ICondFavComSurCrpPalierService {
    private CondFavComSurCrpPallierRepository comSurCrpPallierRepository;
    @Override
    public CondFavComSurCrpPallierEntity getCondFavComSurCrpPallierById(Long id) {
        return comSurCrpPallierRepository.findById(id).orElse(null);
    }

    @Override
    public List<CondFavComSurCrpPallierEntity> getCondFavComSurCrpPalliers() {
        return comSurCrpPallierRepository.findAll();
    }
}
