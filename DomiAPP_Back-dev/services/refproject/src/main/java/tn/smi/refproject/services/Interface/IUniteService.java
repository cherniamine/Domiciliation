package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.UniteEntity;

import java.util.List;

public interface IUniteService {
    UniteEntity getUniteById(Byte id);
    List<UniteEntity>getUnites();
    List<Long> findAllCodeUnite();
}
