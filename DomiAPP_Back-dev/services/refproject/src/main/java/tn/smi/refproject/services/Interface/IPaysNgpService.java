package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.PaysNgpEntity;
import tn.smi.refproject.entities.PaysNgpEntityPK;

import java.util.List;

public interface IPaysNgpService {
    PaysNgpEntity getPaysNgpById(PaysNgpEntityPK id);
    List<PaysNgpEntity>getPaysNgps();
}
