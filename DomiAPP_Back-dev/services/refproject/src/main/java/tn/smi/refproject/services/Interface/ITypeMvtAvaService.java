package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.TypeMvtAvaEntity;

import java.util.List;

public interface ITypeMvtAvaService {
    TypeMvtAvaEntity getTypeMvtAvaById(String id);
    List<TypeMvtAvaEntity>getTypeMvtAvas();
}
