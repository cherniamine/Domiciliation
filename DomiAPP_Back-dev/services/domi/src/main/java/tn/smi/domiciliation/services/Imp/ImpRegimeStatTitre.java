package tn.smi.domiciliation.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.domiciliation.entities.RegimeStatTitreEntity;
import tn.smi.domiciliation.entities.RegimeStatTitreEntityPK;
import tn.smi.domiciliation.repositories.RegimeStatTitreRepository;
import tn.smi.domiciliation.services.Interface.IRegimeStatTitre;

import java.util.List;

@Service
@AllArgsConstructor
public class ImpRegimeStatTitre implements IRegimeStatTitre {
    private RegimeStatTitreRepository regimeStatTitreRepository;

    @Override
    public RegimeStatTitreEntity createRST(RegimeStatTitreEntity regimeStatTitre) {
        return regimeStatTitreRepository.save(regimeStatTitre);
    }

    @Override
    public RegimeStatTitreEntity updateRST(RegimeStatTitreEntity regimeStatTitre, RegimeStatTitreEntityPK regimeStatTitreEntityPK) {
        RegimeStatTitreEntity regimeStatTitre1=regimeStatTitreRepository.findById(regimeStatTitreEntityPK).orElse(null);
        regimeStatTitre1.setDateFinApplication(regimeStatTitre.getDateFinApplication());
        return regimeStatTitreRepository.save(regimeStatTitre1);
    }

    @Override
    public void deleteRST(RegimeStatTitreEntityPK regimeStatTitreEntityPK) {
        regimeStatTitreRepository.deleteById(regimeStatTitreEntityPK);

    }

    @Override
    public RegimeStatTitreEntity getByIdRST(RegimeStatTitreEntityPK regimeStatTitreEntityPK) {
        return regimeStatTitreRepository.findById(regimeStatTitreEntityPK).orElse(null);
    }

    @Override
    public List<RegimeStatTitreEntity> getAllRST() {
        return regimeStatTitreRepository.findAll();
    }
}
