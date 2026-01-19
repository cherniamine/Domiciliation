package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.CondFavSeuilComSurCrpEntity;

import java.util.List;

public interface ICondFavSeuilComSurCrpService {
    CondFavSeuilComSurCrpEntity getCondFavSeuilComSurCrpById(Long id);
    List<CondFavSeuilComSurCrpEntity>getCondFavSeuilComSurCrps();

}
