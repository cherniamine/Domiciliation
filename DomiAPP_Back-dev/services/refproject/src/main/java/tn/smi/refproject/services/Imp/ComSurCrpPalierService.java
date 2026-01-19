package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.ComSurCrpPallierEntity;
import tn.smi.refproject.repository.ComSurCrpPallierRepository;
import tn.smi.refproject.repository.ComSurCrpRepository;
import tn.smi.refproject.services.Interface.IComSurCrpPalierService;

import java.util.List;

@Service
@AllArgsConstructor
public class ComSurCrpPalierService implements IComSurCrpPalierService {
    private ComSurCrpPallierRepository comSurCrpPallierRepository;
    @Override
    public ComSurCrpPallierEntity getComSurCrpPalierById(Long id) {
        return comSurCrpPallierRepository.findById(id).orElse(null);
    }

    @Override
    public List<ComSurCrpPallierEntity> getComSurCrpPaliers() {
        return comSurCrpPallierRepository.findAll();
    }
}
