package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.NatureCommissionEntity;
import tn.smi.refproject.entities.NatureCommissionEntityPK;
import tn.smi.refproject.services.Interface.INatureCommissionService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/NatureCommission")
public class NatureCommissionController {
    private INatureCommissionService iNatureCommissionService;
@GetMapping("/get/{codeTypeCom}/{codeNatureCom}")
    public NatureCommissionEntity getNatureCommissionById(@PathVariable byte codeTypeCom, @PathVariable byte codeNatureCom) {
        NatureCommissionEntityPK id=new NatureCommissionEntityPK(codeTypeCom,codeNatureCom);
        return iNatureCommissionService.getNatureCommissionById(id);
    }
    @GetMapping("/all")
    public List<NatureCommissionEntity> getNatureCommissions() {
        return iNatureCommissionService.getNatureCommissions();
    }
}
