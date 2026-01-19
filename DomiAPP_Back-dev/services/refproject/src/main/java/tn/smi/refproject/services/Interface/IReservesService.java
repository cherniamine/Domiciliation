package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.ReservesEntity;

import java.util.List;

public interface IReservesService {
    ReservesEntity getReservesById(Byte id);
    List<ReservesEntity>getReservess();
}
