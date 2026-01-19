package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.ZoneFraisEntity;

import java.util.List;

public interface IZoneFraisService {
    ZoneFraisEntity getZoneFraisById(Byte id);
    List<ZoneFraisEntity>getZoneFraiss();
}
