package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.ZoneFraisEntity;
import tn.smi.refproject.repository.ZoneFraisRepository;
import tn.smi.refproject.services.Interface.IZoneFraisService;

import java.util.List;

@Service
@AllArgsConstructor
public class ZoneFraisService implements IZoneFraisService {
    private ZoneFraisRepository zoneFraisRepository;
    @Override
    public ZoneFraisEntity getZoneFraisById(Byte id) {
        return zoneFraisRepository.findById(id).orElse(null);
    }

    @Override
    public List<ZoneFraisEntity> getZoneFraiss() {
        return zoneFraisRepository.findAll();
    }
}
