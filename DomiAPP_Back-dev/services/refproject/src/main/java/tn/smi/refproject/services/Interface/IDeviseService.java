package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.DeviseEntity;

import java.util.List;

public interface IDeviseService {
    DeviseEntity getDeviseById(Byte id);
    List<DeviseEntity> getDevises();
    List<Long> getAllCodeDevise();
}
