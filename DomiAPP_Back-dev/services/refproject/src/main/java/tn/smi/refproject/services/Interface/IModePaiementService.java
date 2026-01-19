package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.ModePaiementEntity;

import java.util.List;

public interface IModePaiementService {
    ModePaiementEntity getModePaiementById(String id);
    List<ModePaiementEntity>getModePaiements();
}
