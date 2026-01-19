package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.NatureCommissionEntity;
import tn.smi.refproject.entities.NatureCommissionEntityPK;

import java.util.List;

public interface INatureCommissionService {
    NatureCommissionEntity getNatureCommissionById(NatureCommissionEntityPK id);
    List<NatureCommissionEntity>getNatureCommissions();
}
