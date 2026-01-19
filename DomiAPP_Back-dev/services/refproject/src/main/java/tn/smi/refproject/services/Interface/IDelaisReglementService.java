package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.DelaisReglementEntity;

import java.util.List;

public interface IDelaisReglementService {
    DelaisReglementEntity getDelaisReglementById(Byte id);
    List<DelaisReglementEntity>getDelaisReglements();
    List<Long> getAllCodeDelReg();

}
