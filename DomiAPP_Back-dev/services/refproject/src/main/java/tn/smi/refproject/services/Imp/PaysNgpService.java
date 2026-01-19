package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.PaysNgpEntity;
import tn.smi.refproject.entities.PaysNgpEntityPK;
import tn.smi.refproject.repository.PaysNgpRepository;
import tn.smi.refproject.services.Interface.IPaysNgpService;

import java.util.List;

@Service
@AllArgsConstructor
public class PaysNgpService implements IPaysNgpService {
    private PaysNgpRepository paysNgpRepository;
    @Override
    public PaysNgpEntity getPaysNgpById(PaysNgpEntityPK id) {
        return paysNgpRepository.findById(id).orElse(null);
    }

    @Override
    public List<PaysNgpEntity> getPaysNgps() {
        return paysNgpRepository.findAll();
    }
}
