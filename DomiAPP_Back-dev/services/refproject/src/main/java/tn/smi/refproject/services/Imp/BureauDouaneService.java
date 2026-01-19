package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.BureauDouaneEntity;
import tn.smi.refproject.repository.BureauDouaneRepository;
import tn.smi.refproject.services.Interface.IBureauDouaneService;

import java.util.List;

@Service
@AllArgsConstructor
public class BureauDouaneService implements IBureauDouaneService {
    private BureauDouaneRepository bureauDouaneRepository;
    @Override
    public BureauDouaneEntity getBureauDouaneById(Byte id) {
        return bureauDouaneRepository.findById(id).orElse(null);
    }
    @Override
    public List<BureauDouaneEntity> getBureauDouanes() {
        return bureauDouaneRepository.findAll();
    }
}
