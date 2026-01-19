package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.OrigineFondsEntity;
import tn.smi.refproject.repository.OrigineFondsRepository;
import tn.smi.refproject.services.Interface.IOrigineFondsService;

import java.util.List;

@Service
@AllArgsConstructor
public class OrigineFondsService implements IOrigineFondsService {
    private OrigineFondsRepository origineFondsRepository;
    @Override
    public OrigineFondsEntity getOrigineFondsById(Byte id) {
        return origineFondsRepository.findById(id).orElse(null);
    }

    @Override
    public List<OrigineFondsEntity> getOrigineFondss() {
        return origineFondsRepository.findAll();
    }
}
