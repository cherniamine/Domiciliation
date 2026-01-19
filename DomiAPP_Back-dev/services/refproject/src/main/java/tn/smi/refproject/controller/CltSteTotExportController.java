package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.CltSteTotExportEntity;
import tn.smi.refproject.entities.CltSteTotExportEntityPK;
import tn.smi.refproject.services.Interface.ICltSteTotExportService;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/CltSteTotExport")
public class CltSteTotExportController {
    private ICltSteTotExportService iCltSteTotExportService;
@GetMapping("/get/{typePieceClient}/{noPieceClient}")
    public CltSteTotExportEntity getCltSteTotExport(@PathVariable int typePieceClient,@PathVariable String noPieceClient) {
    CltSteTotExportEntityPK id=new CltSteTotExportEntityPK(typePieceClient,noPieceClient);
        return iCltSteTotExportService.getCltSteTotExport(id);
    }
@GetMapping("/all")
    public List<CltSteTotExportEntity> getCltSteTotExports() {
        return iCltSteTotExportService.getCltSteTotExports();
    }
}
