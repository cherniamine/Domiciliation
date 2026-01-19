package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.DerogationCirculaireEntity;
import tn.smi.refproject.repository.DerogationCirculaireRepository;
import tn.smi.refproject.services.Interface.IDerogationCirculaireService;

import java.util.List;

@Service
@AllArgsConstructor
public class DerogationCirculaireService implements IDerogationCirculaireService {
    private DerogationCirculaireRepository derogationCirculaireRepository;
    @Override
    public DerogationCirculaireEntity getDerogationCirculaireById(String id) {
        return derogationCirculaireRepository.findById(id).orElse(null);
    }

    @Override
    public List<DerogationCirculaireEntity> getDerogationCirculaires() {
        return derogationCirculaireRepository.findAll();
    }
}
