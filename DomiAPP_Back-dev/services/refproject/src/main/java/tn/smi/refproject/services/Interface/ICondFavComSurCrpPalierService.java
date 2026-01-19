package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.CondFavComSurCrpPallierEntity;

import java.util.List;

public interface ICondFavComSurCrpPalierService {
    CondFavComSurCrpPallierEntity getCondFavComSurCrpPallierById(Long id);
    List<CondFavComSurCrpPallierEntity>getCondFavComSurCrpPalliers();
}
