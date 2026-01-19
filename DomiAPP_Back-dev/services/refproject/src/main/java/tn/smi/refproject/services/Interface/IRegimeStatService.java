package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.RegimeStatEntity;

import java.util.List;

public interface IRegimeStatService {
    RegimeStatEntity getRegimeStatById(Short id);
    List<RegimeStatEntity>getRegimeStats();
    List<Long> getAllCodeRegimeStat();

}
