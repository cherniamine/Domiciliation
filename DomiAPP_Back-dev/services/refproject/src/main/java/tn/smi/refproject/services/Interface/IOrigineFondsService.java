package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.OrigineFondsEntity;

import java.util.List;

public interface IOrigineFondsService {
    OrigineFondsEntity getOrigineFondsById(Byte id);
    List<OrigineFondsEntity>getOrigineFondss();
}
