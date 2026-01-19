package tn.smi.domiciliation.services.Interface;

import tn.smi.domiciliation.entities.ReservesEntity;

import java.util.List;

public interface IReserves {
    ReservesEntity createR(ReservesEntity reservesEntity);
    ReservesEntity updateR(ReservesEntity reservesEntity,Byte id);
    void deleteR(Byte id);
    ReservesEntity getByIdR(Byte id);
    List<ReservesEntity> getAllR();
}
