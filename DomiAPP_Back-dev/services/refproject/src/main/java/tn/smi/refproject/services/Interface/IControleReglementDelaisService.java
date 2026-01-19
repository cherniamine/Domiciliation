package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.ControleReglementDelaisEntity;
import tn.smi.refproject.entities.ControleReglementDelaisEntityPK;

import java.util.List;

public interface IControleReglementDelaisService {
    ControleReglementDelaisEntity getControleReglementDelaisById(ControleReglementDelaisEntityPK id);
    List<ControleReglementDelaisEntity> getControleReglementDelaiss();

}
