package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.TypeDossierAvaEntity;

import java.util.List;

public interface ITypeDossierAvaService {
    TypeDossierAvaEntity getTypeDossierAvaById(Long id);
    List<TypeDossierAvaEntity>getTypeDossierAvas();
}
