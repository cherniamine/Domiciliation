package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.CltSteTotExportEntity;
import tn.smi.refproject.entities.CltSteTotExportEntityPK;
import tn.smi.refproject.repository.CltSteTotExportRepository;
import tn.smi.refproject.services.Interface.ICltSteTotExportService;

import java.util.List;

@Service
@AllArgsConstructor
public class CltSteTotExportService implements ICltSteTotExportService {
    private CltSteTotExportRepository cltSteTotExportRepository;
    @Override
    public CltSteTotExportEntity getCltSteTotExport(CltSteTotExportEntityPK id) {
        return cltSteTotExportRepository.findById(id).orElse(null);
    }

    @Override
    public List<CltSteTotExportEntity> getCltSteTotExports() {
        return cltSteTotExportRepository.findAll();
    }
}
