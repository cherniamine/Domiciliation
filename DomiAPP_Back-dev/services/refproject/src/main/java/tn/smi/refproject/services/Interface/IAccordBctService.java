package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.AccordBctEntity;
import tn.smi.refproject.entities.AccordBctEntityPK;
import tn.smi.refproject.entities.enumeration.TypeAccordBct;

import java.time.LocalDate;
import java.util.List;

public interface IAccordBctService {
    AccordBctEntity getAccordBctById(AccordBctEntityPK id);
    List<AccordBctEntity> getAccords();
    List<Long> getNumAccordBct(TypeAccordBct typeAccordBct);
    List<LocalDate> getDateAccordBct(TypeAccordBct typeAccordBct);

    List<AccordBctEntity> getAccordsByNoPieceClient(String noPieceClient);

    AccordBctEntity createAccordBctForClient(AccordBctEntity accordBctEntity);
}
