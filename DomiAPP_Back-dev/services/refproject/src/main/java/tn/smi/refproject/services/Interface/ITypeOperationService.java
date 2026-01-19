package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.TypeOperationEntity;
import tn.smi.refproject.entities.TypeOperationEntityPK;

import java.util.List;

public interface ITypeOperationService {
    TypeOperationEntity getTypeOperationById(TypeOperationEntityPK id);
    List<TypeOperationEntity>getTypeOperations();
}
