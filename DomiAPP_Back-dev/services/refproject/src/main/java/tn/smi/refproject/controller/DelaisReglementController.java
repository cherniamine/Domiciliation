package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.DelaisReglementEntity;
import tn.smi.refproject.services.Interface.IDelaisReglementService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/DelaisReglement")
public class DelaisReglementController {
    private IDelaisReglementService iDelaisReglementService;
@GetMapping("/get/{id}")
    public DelaisReglementEntity getDelaisReglementById(@PathVariable Byte id) {
        return iDelaisReglementService.getDelaisReglementById(id);
    }
@GetMapping("/all")
    public List<DelaisReglementEntity> getDelaisReglements() {
        return iDelaisReglementService.getDelaisReglements();
    }
    @GetMapping("/allcodedelreg")
    public List<Long> getAllCodeDelReg() {
        return iDelaisReglementService.getAllCodeDelReg();
    }
}
