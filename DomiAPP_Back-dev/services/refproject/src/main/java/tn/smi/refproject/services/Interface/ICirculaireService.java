package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.CirculaireEntity;
import tn.smi.refproject.entities.CirculaireEntityPK;

import java.util.List;

public interface ICirculaireService {
    CirculaireEntity getCirculaireById(CirculaireEntityPK id);
    List<CirculaireEntity> getCirculaires();
}
