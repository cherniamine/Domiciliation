package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.CondFavComSurCrpEntity;
import tn.smi.refproject.entities.CondFavSeuilComCrpPallierEntity;
import tn.smi.refproject.repository.CondFavSeuilComCrpPallierRepository;
import tn.smi.refproject.services.Interface.ICondFavComSurCrpService;
import tn.smi.refproject.services.Interface.ICondFavSeuilComCrpPallier;

import java.util.List;

@Service
@AllArgsConstructor
public class CondFavSeuilComCrpPallierService implements ICondFavSeuilComCrpPallier {
    private CondFavSeuilComCrpPallierRepository condFavSeuilComCrpPallierRepository;


    @Override
    public CondFavSeuilComCrpPallierEntity getCondFavSeuilComCrpPallierById(Long id) {
        return condFavSeuilComCrpPallierRepository.findById(id).orElse(null);
    }

    @Override
    public List<CondFavSeuilComCrpPallierEntity> getCondFavSeuilComCrpPallierEntitys() {
        return condFavSeuilComCrpPallierRepository.findAll();
    }
}
