package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.DechargeTypeOprDetailEntity;

import java.util.List;

public interface IDechargeTypeOprDetailService {
    DechargeTypeOprDetailEntity getDechargeTypeOprDetail(Long id);
    List<DechargeTypeOprDetailEntity> getDechargeTypeOprDetails();
}
