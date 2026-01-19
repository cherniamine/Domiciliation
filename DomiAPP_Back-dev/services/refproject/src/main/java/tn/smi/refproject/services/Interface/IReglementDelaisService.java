package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.ReglementDelaisEntity;
import tn.smi.refproject.entities.ReglementDelaisEntityPK;

import java.util.List;

public interface IReglementDelaisService {
    ReglementDelaisEntity getReglementDelaisById(ReglementDelaisEntityPK id);
    List<ReglementDelaisEntity>getReglementDelaiss();
}
