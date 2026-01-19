package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.DechargeDocumentsEntity;

import java.util.List;

public interface IDechargeDocumentsService {
    DechargeDocumentsEntity getDechargeDocumentsById(Short id);
    List<DechargeDocumentsEntity>getDechargeDocumentss();
}
