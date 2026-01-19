package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.CltSteTotExportTraceEntity;
import tn.smi.refproject.services.Interface.ICltSteTotExportTraceService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/CltSteTotExportTrace")
public class CltSteTotExportTraceController {
    private ICltSteTotExportTraceService iCltSteTotExportTraceService;
@GetMapping("/get/{id}")
    public CltSteTotExportTraceEntity getCltSteTotExportTraceById(@PathVariable Long id) {
        return iCltSteTotExportTraceService.getCltSteTotExportTraceById(id);
    }
@GetMapping("/all")
    public List<CltSteTotExportTraceEntity> getCltSteTotExportTraces() {
        return iCltSteTotExportTraceService.getCltSteTotExportTraces();
    }
}
