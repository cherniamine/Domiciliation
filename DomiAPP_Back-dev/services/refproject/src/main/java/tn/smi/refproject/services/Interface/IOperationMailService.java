package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.OperationMailEntity;
import tn.smi.refproject.entities.OperationMailEntityPK;

import java.util.List;

public interface IOperationMailService {
    OperationMailEntity getOperationMailById(OperationMailEntityPK id);
    List<OperationMailEntity> getOperationMails();
}
