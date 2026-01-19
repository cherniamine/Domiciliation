package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.ActiviteClasseEntity;
import tn.smi.refproject.entities.ActiviteClasseEntityPK;

import java.util.List;

public interface IActiviteClasseService {
    ActiviteClasseEntity getActiviteClasseById(ActiviteClasseEntityPK id);
    List<ActiviteClasseEntity> getActiviteClasses();



}
