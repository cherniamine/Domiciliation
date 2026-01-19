package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.ComSurCrpEntity;
import tn.smi.refproject.repository.ComSurCrpRepository;
import tn.smi.refproject.services.Interface.IComSurCrpService;

import java.util.List;

@Service
@AllArgsConstructor
public class ComSurCrpService implements IComSurCrpService {
    private ComSurCrpRepository comSurCrpRepository;
    @Override
    public ComSurCrpEntity getComSurCrpById(Long id) {
        return comSurCrpRepository.findById(id).orElse(null);
    }

    @Override
    public List<ComSurCrpEntity> getComSurCrps() {
        return comSurCrpRepository.findAll();
    }
}
