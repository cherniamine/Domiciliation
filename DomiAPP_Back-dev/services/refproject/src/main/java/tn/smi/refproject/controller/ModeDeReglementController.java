package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.ModeDeReglementEntity;
import tn.smi.refproject.services.Interface.IModeDeReglementService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/ModeDeReglement")
public class ModeDeReglementController {
    private IModeDeReglementService iModeDeReglementService;
@GetMapping("/get/{id}")
    public ModeDeReglementEntity getModeDeReglementById(@PathVariable Byte id) {
        return iModeDeReglementService.getModeDeReglementById(id);
    }
@GetMapping("/all")
    public List<ModeDeReglementEntity> getModeDeReglements() {
        return iModeDeReglementService.getModeDeReglements();
    }
@GetMapping("/allCodeModReg")
    public List<Long> getAllCodeModReg() {
        return iModeDeReglementService.getAllCodeModReg();
    }
}
