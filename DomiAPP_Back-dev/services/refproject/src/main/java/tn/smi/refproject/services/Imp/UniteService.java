package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.UniteEntity;
import tn.smi.refproject.repository.UniteRepository;
import tn.smi.refproject.services.Interface.IUniteService;

import java.util.List;

@Service
@AllArgsConstructor
public class UniteService implements IUniteService {
    private UniteRepository uniteRepository;
    @Override
    public UniteEntity getUniteById(Byte id) {
        return uniteRepository.findById(id).orElse(null);
    }

    @Override
    public List<UniteEntity> getUnites() {
        return uniteRepository.findAll();
    }

    @Override
    public List<Long> findAllCodeUnite() {
        return uniteRepository.findAllCodeUnite();
    }

}
