package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.SeuilComSurCrpEntity;

import java.util.List;

public interface ISeuilComSurCrpService {
    SeuilComSurCrpEntity getSeuilComSurCrpById(Long id);
    List<SeuilComSurCrpEntity>getSeuilComSurCrps();
}
