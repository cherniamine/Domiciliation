package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.InstanceCirculaireEntity;

import java.util.List;

public interface IInstanceCirculaireService {
    InstanceCirculaireEntity getInstanceCirculaireById(Short id);
    List<InstanceCirculaireEntity>getInstanceCirculaires();
}
