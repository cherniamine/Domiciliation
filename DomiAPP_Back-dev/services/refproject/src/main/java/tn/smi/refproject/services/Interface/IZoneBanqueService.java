package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.ZoneBanqueEntity;
import tn.smi.refproject.entities.ZoneBanqueEntityPK;

import java.util.List;

public interface IZoneBanqueService {
    ZoneBanqueEntity getZoneBanqueById(ZoneBanqueEntityPK id);
    List<ZoneBanqueEntity>getZoneBanques();
}
