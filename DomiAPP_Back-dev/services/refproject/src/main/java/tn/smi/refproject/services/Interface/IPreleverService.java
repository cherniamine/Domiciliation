package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.PreleverEntity;
import tn.smi.refproject.entities.PreleverEntityPK;

import java.util.List;

public interface IPreleverService {
    PreleverEntity getPreleverById(PreleverEntityPK id);
    List<PreleverEntity>getPrelevers();
}
