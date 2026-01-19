package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.CondFavSeuilComCrpPallierEntity;

import java.util.List;

public interface ICondFavSeuilComCrpPallier {
    CondFavSeuilComCrpPallierEntity getCondFavSeuilComCrpPallierById(Long id);
    List<CondFavSeuilComCrpPallierEntity> getCondFavSeuilComCrpPallierEntitys();

}
