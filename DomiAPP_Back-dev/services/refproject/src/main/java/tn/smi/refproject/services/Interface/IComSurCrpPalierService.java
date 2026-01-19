package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.ComSurCrpPallierEntity;

import java.util.List;

public interface IComSurCrpPalierService {
    ComSurCrpPallierEntity getComSurCrpPalierById(Long id);
    List<ComSurCrpPallierEntity>getComSurCrpPaliers();
}
