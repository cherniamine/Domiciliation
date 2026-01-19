package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.ReglementDelaisEntity;
import tn.smi.refproject.entities.ReglementDelaisEntityPK;
import tn.smi.refproject.services.Interface.IReglementDelaisService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/ReglementDelais")
public class ReglementDelaisController {
    private IReglementDelaisService iReglementDelaisService;
@GetMapping("/get/{codeModReg}/{codeDelReg}")
    public ReglementDelaisEntity getReglementDelaisById(@PathVariable byte codeModReg,@PathVariable byte codeDelReg) {
    ReglementDelaisEntityPK id=new ReglementDelaisEntityPK(codeModReg,codeDelReg);
        return iReglementDelaisService.getReglementDelaisById(id);
    }
@GetMapping("/all")
    public List<ReglementDelaisEntity> getReglementDelaiss() {
        return iReglementDelaisService.getReglementDelaiss();
    }
}
