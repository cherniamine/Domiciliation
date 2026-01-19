package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.CptNostroEntity;
import tn.smi.refproject.entities.CptNostroEntityPK;

import java.util.List;

public interface ICptNostroService {
    CptNostroEntity getCptNostroById(CptNostroEntityPK id);
    List<CptNostroEntity>getCptNostros();
}
