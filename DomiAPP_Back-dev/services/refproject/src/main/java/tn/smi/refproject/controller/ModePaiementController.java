package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.ModePaiementEntity;
import tn.smi.refproject.services.Interface.IModePaiementService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/ModePaiement")
public class ModePaiementController {
    private IModePaiementService iModePaiementService;
@GetMapping("/get/{id}")
    public ModePaiementEntity getModePaiementById(@PathVariable String id) {
        return iModePaiementService.getModePaiementById(id);
    }
@GetMapping("/all")
    public List<ModePaiementEntity> getModePaiements() {
        return iModePaiementService.getModePaiements();
    }
}
