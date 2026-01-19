package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.CorrespSbeNsiEntity;
import tn.smi.refproject.entities.CorrespSbeNsiEntityPK;
import tn.smi.refproject.repository.CorrespSbeNsiRepository;
import tn.smi.refproject.services.Interface.ICorrespSbeNsiService;

import java.util.List;

@Service
@AllArgsConstructor
public class CorrespSbeNsiService implements ICorrespSbeNsiService {
    private CorrespSbeNsiRepository correspSbeNsiRepository;
    @Override
    public CorrespSbeNsiEntity getCorrespSbeNsiById(CorrespSbeNsiEntityPK id) {
        return correspSbeNsiRepository.findById(id).orElse(null);
    }

    @Override
    public List<CorrespSbeNsiEntity> getCorrespSbeNsis() {
        return correspSbeNsiRepository.findAll();
    }
}
