package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.JourFerrieEntity;
import tn.smi.refproject.entities.JourFerrieEntityPK;

import java.util.List;

public interface IJourFerrieService {
    JourFerrieEntity getJourFerrieById(JourFerrieEntityPK id);
    List<JourFerrieEntity>getJourFerries();
}
