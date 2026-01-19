package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.ActiviteGroupeEntity;
import tn.smi.refproject.entities.ActiviteGroupeEntityPK;

import java.util.List;

public interface IActiviteGroupeService {
    ActiviteGroupeEntity getActiviteGroupeById(ActiviteGroupeEntityPK id);
    List<ActiviteGroupeEntity> getActiviteGroupes();
}
