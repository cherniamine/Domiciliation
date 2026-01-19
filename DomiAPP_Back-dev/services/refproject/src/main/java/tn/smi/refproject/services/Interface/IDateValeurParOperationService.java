package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.DateValeurParOperationEntity;

import java.util.List;

public interface IDateValeurParOperationService {
    DateValeurParOperationEntity getDateValeurParOperationById(Long id);
    List<DateValeurParOperationEntity>getDateValeurParOperations();
}
