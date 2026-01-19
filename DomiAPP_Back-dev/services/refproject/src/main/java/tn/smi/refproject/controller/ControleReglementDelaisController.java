package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.ControleReglementDelaisEntity;
import tn.smi.refproject.entities.ControleReglementDelaisEntityPK;
import tn.smi.refproject.services.Interface.IControleReglementDelaisService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/ControleReglementDelais")
public class ControleReglementDelaisController {
    private IControleReglementDelaisService iControleReglementDelaisService;
@GetMapping("/get/{importExport}/{codeModReg}/{codeDelReg}")
    public ControleReglementDelaisEntity getControleReglementDelaisById(@PathVariable String importExport,@PathVariable byte codeModReg,@PathVariable byte codeDelReg) {
        ControleReglementDelaisEntityPK id=new ControleReglementDelaisEntityPK(importExport,codeModReg,codeDelReg);
        return iControleReglementDelaisService.getControleReglementDelaisById(id);
    }
@GetMapping("/all")
    public List<ControleReglementDelaisEntity> getControleReglementDelaiss() {
        return iControleReglementDelaisService.getControleReglementDelaiss();
    }
}
