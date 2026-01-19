package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.CltSteTotExportTraceEntity;
import tn.smi.refproject.repository.CltSteTotExportTraceRepository;
import tn.smi.refproject.services.Interface.ICltSteTotExportTraceService;

import java.util.List;

@Service
@AllArgsConstructor
public class CltSteTotExportTraceService implements ICltSteTotExportTraceService {
    private CltSteTotExportTraceRepository cltSteTotExportTraceRepository;
    @Override
    public CltSteTotExportTraceEntity getCltSteTotExportTraceById(Long id) {
        return cltSteTotExportTraceRepository.findById(id).orElse(null);
    }

    @Override
    public List<CltSteTotExportTraceEntity> getCltSteTotExportTraces() {
        return cltSteTotExportTraceRepository.findAll();
    }
}
