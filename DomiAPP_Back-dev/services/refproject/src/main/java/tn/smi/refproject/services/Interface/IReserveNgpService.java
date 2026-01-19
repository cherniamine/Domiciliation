package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.ReserveNgpEntity;
import tn.smi.refproject.entities.ReserveNgpEntityPK;

import java.util.List;

public interface IReserveNgpService {
    ReserveNgpEntity getReserveNgpById(ReserveNgpEntityPK id);
    List<ReserveNgpEntity>getReserveNgps();
}
