package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.TypeOperationCommissionEntity;
import tn.smi.refproject.entities.TypeOperationCommissionEntityPK;

import java.util.List;

public interface ITypeOperationCommissionService {
    TypeOperationCommissionEntity getTypeOperationCommissionById(TypeOperationCommissionEntityPK id);
    List<TypeOperationCommissionEntity>getTypeOperationCommissions();
}
