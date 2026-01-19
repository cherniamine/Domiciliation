package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.RegimeStatTitreEntity;
import tn.smi.refproject.entities.RegimeStatTitreEntityPK;
import tn.smi.refproject.repository.RegimeStatTitreRepository;
import tn.smi.refproject.services.Interface.IRegimeStatTitreService;

import java.util.List;

@Service
@AllArgsConstructor
public class RegimeStatTitreService implements IRegimeStatTitreService {
    private RegimeStatTitreRepository regimeStatTitreRepository;
    @Override
    public RegimeStatTitreEntity getRegimeStatTitreById(RegimeStatTitreEntityPK id) {
        return regimeStatTitreRepository.findById(id).orElse(null);
    }

    @Override
    public List<RegimeStatTitreEntity> getRegimeStatTitres() {
        return regimeStatTitreRepository.findAll();
    }
}
