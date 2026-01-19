package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.CltSteTotExportTraceEntity;

import java.util.List;

public interface ICltSteTotExportTraceService {
    CltSteTotExportTraceEntity getCltSteTotExportTraceById(Long id);
    List<CltSteTotExportTraceEntity> getCltSteTotExportTraces();
}
