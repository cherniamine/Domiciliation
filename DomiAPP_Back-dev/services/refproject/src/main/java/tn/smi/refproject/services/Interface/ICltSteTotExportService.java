package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.CltSteTotExportEntity;
import tn.smi.refproject.entities.CltSteTotExportEntityPK;

import java.util.List;

public interface ICltSteTotExportService {
    CltSteTotExportEntity getCltSteTotExport(CltSteTotExportEntityPK id);
    List<CltSteTotExportEntity> getCltSteTotExports();
}
