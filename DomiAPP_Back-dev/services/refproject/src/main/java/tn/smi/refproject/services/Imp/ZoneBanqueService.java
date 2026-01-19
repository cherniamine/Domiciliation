package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.ZoneBanqueEntity;
import tn.smi.refproject.entities.ZoneBanqueEntityPK;
import tn.smi.refproject.repository.ZoneBanqueRepository;
import tn.smi.refproject.services.Interface.IZoneBanqueService;

import java.util.List;

@Service
@AllArgsConstructor
public class ZoneBanqueService implements IZoneBanqueService {
    private ZoneBanqueRepository zoneBanqueRepository;
    @Override
    public ZoneBanqueEntity getZoneBanqueById(ZoneBanqueEntityPK id) {
        return zoneBanqueRepository.findById(id).orElse(null);
    }

    @Override
    public List<ZoneBanqueEntity> getZoneBanques() {
        return zoneBanqueRepository.findAll();
    }
}
