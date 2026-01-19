package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.BureauDouaneEntity;

import java.util.List;

public interface IBureauDouaneService {
    BureauDouaneEntity getBureauDouaneById(Byte id);
    List<BureauDouaneEntity> getBureauDouanes();
}
