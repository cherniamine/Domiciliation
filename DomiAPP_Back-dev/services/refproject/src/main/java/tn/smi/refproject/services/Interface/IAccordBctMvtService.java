package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.AccordBctMvtEntity;
import tn.smi.refproject.entities.AccordBctMvtEntityPK;

import java.util.List;

public interface IAccordBctMvtService {
    AccordBctMvtEntity getAccordBctMvtById(AccordBctMvtEntityPK id);
    List<AccordBctMvtEntity> getAccordBctMvts();
}
