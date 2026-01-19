package tn.smi.domiciliation.services.Interface;

import tn.smi.domiciliation.entities.RegimeStatTitreEntity;
import tn.smi.domiciliation.entities.RegimeStatTitreEntityPK;

import java.util.List;

public interface IRegimeStatTitre {

    RegimeStatTitreEntity createRST(RegimeStatTitreEntity regimeStatTitre);
    RegimeStatTitreEntity updateRST(RegimeStatTitreEntity regimeStatTitre, RegimeStatTitreEntityPK regimeStatTitreEntityPK);
    void deleteRST(RegimeStatTitreEntityPK regimeStatTitreEntityPK);
    RegimeStatTitreEntity getByIdRST(RegimeStatTitreEntityPK regimeStatTitreEntityPK);
    List<RegimeStatTitreEntity> getAllRST();



}
