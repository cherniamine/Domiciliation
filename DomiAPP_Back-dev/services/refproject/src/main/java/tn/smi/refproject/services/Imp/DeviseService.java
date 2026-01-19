package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.DeviseEntity;
import tn.smi.refproject.repository.DeviseRepository;
import tn.smi.refproject.services.Interface.IDeviseService;

import java.util.List;

@Service
@AllArgsConstructor
public class DeviseService implements IDeviseService {
    private DeviseRepository deviseRepository;
    @Override
    public DeviseEntity getDeviseById(Byte id) {
        return deviseRepository.findById(id).orElse(null);
    }

    @Override
    public List<DeviseEntity> getDevises() {
        return deviseRepository.findAll();
    }

    @Override
    public List<Long> getAllCodeDevise() {
        return deviseRepository.findAllCodeDevises();
    }
}
