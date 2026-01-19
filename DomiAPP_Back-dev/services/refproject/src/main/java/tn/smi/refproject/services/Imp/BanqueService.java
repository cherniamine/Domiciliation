package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.BanqueEntity;
import tn.smi.refproject.repository.BanqueRepository;
import tn.smi.refproject.services.Interface.IBanqueService;

import java.util.List;

@Service
@AllArgsConstructor
public class BanqueService implements IBanqueService {
    private BanqueRepository banqueRepository;
    @Override
    public BanqueEntity getBanqueById(Byte id) {
        return banqueRepository.findById(id).orElse(null);
    }

    @Override
    public List<BanqueEntity> getBanques() {
        return banqueRepository.findAll();
    }
}
