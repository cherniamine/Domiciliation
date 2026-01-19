package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.DerogationCirculaireEntity;

import java.util.List;

public interface IDerogationCirculaireService {
    DerogationCirculaireEntity getDerogationCirculaireById(String id);
    List<DerogationCirculaireEntity>getDerogationCirculaires();
}
