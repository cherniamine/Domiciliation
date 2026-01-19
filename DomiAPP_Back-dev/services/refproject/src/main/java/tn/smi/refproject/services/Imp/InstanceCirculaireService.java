package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.InstanceCirculaireEntity;
import tn.smi.refproject.repository.InstanceCirculaireRepository;
import tn.smi.refproject.services.Interface.IInstanceCirculaireService;

import java.util.List;

@Service
@AllArgsConstructor
public class InstanceCirculaireService implements IInstanceCirculaireService {
    private InstanceCirculaireRepository instanceCirculaireRepository;
    @Override
    public InstanceCirculaireEntity getInstanceCirculaireById(Short id) {
        return instanceCirculaireRepository.findById(id).orElse(null);
    }

    @Override
    public List<InstanceCirculaireEntity> getInstanceCirculaires() {
        return instanceCirculaireRepository.findAll();
    }
}
