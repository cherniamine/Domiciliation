package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.CorrespSbeNsiEntity;
import tn.smi.refproject.entities.CorrespSbeNsiEntityPK;

import java.util.List;

public interface ICorrespSbeNsiService {
    CorrespSbeNsiEntity getCorrespSbeNsiById(CorrespSbeNsiEntityPK id);
    List<CorrespSbeNsiEntity>getCorrespSbeNsis();
}
