package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.DirectionEntity;

import java.util.List;

public interface IDirectionService {
    DirectionEntity getDirectionById(Byte id);
    List<DirectionEntity>getDirections();
}
