package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.RegimeStatTitreEntity;
import tn.smi.refproject.entities.RegimeStatTitreEntityPK;

import java.util.List;

public interface IRegimeStatTitreService {
    RegimeStatTitreEntity getRegimeStatTitreById(RegimeStatTitreEntityPK id);
    List<RegimeStatTitreEntity>getRegimeStatTitres();
}
