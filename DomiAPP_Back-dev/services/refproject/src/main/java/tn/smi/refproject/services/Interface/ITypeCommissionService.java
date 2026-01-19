package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.TypeCommissionEntity;

import java.util.List;

public interface ITypeCommissionService {
    TypeCommissionEntity getTypeCommissionById(Byte id);
    List<TypeCommissionEntity>getTypeCommissions();
}
