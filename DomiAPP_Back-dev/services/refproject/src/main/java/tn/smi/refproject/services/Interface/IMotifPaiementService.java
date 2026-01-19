package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.MotifPaiementEntity;

import java.util.List;

public interface IMotifPaiementService {
    MotifPaiementEntity getMotifPaiementById(Byte id);
    List<MotifPaiementEntity>getMotifPaiements();
}
