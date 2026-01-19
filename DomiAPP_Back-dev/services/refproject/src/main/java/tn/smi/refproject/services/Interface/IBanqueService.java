package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.BanqueEntity;

import java.util.List;

public interface IBanqueService {
    BanqueEntity getBanqueById(Byte id);
    List<BanqueEntity>getBanques();
}
