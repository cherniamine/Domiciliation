package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.CondFavComSurCrpEntity;

import java.util.List;

public interface ICondFavComSurCrpService {
    CondFavComSurCrpEntity getCondFavComSurCrpById(Long id);
    List<CondFavComSurCrpEntity>getCondFavComSurCrps();
}
