package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.ModeDeReglementEntity;

import java.util.List;

public interface IModeDeReglementService {
    ModeDeReglementEntity getModeDeReglementById(Byte id);
    List<ModeDeReglementEntity>getModeDeReglements();
    List<Long> getAllCodeModReg();

}
