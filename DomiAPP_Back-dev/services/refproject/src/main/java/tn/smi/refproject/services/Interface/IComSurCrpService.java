package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.ComSurCrpEntity;

import java.util.List;

public interface IComSurCrpService {
    ComSurCrpEntity getComSurCrpById(Long id);
    List<ComSurCrpEntity>getComSurCrps();
}
