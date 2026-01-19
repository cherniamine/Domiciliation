package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.CommissionParTypeEntity;

import java.util.List;

public interface ICommissionParTypeService {
    CommissionParTypeEntity getCommissionParTypeById(Short id);
    List<CommissionParTypeEntity> getCommissionParTypes();
}
