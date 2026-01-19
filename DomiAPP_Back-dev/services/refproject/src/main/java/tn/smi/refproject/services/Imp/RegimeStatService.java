package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.RegimeStatEntity;
import tn.smi.refproject.repository.RegimeStatRepository;
import tn.smi.refproject.services.Interface.IRegimeStatService;

import java.util.List;

@Service
@AllArgsConstructor
public class RegimeStatService implements IRegimeStatService {
    private RegimeStatRepository regimeStatRepository;
    @Override
    public RegimeStatEntity getRegimeStatById(Short id) {
        return regimeStatRepository.findById(id).orElse(null);
    }

    @Override
    public List<RegimeStatEntity> getRegimeStats() {
        return regimeStatRepository.findAll();
    }

    @Override
    public List<Long> getAllCodeRegimeStat() {
        return regimeStatRepository.findAllCodeRegimeStat();
    }
}
