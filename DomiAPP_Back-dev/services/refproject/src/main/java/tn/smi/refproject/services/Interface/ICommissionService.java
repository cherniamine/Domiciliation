package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.CommissionEntity;

import java.util.List;

public interface ICommissionService {
    CommissionEntity getCommissionById(int id);
    List<CommissionEntity> getCommissions();
}
