package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.PreleverEntity;
import tn.smi.refproject.entities.PreleverEntityPK;
import tn.smi.refproject.repository.PreleverRepository;
import tn.smi.refproject.services.Interface.IPreleverService;

import java.util.List;

@Service
@AllArgsConstructor
public class PreleverService implements IPreleverService {
    private PreleverRepository preleverRepository;
    @Override
    public PreleverEntity getPreleverById(PreleverEntityPK id) {
        return preleverRepository.findById(id).orElse(null);
    }

    @Override
    public List<PreleverEntity> getPrelevers() {
        return preleverRepository.findAll();
    }
}
