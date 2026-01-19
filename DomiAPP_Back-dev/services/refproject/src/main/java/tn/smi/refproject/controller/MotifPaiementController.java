package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.MotifPaiementEntity;
import tn.smi.refproject.services.Interface.IMotifPaiementService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/MotifPaiement")
public class MotifPaiementController {
    private IMotifPaiementService iMotifPaiementService;
@GetMapping("/get/{id}")
    public MotifPaiementEntity getMotifPaiementById(@PathVariable Byte id) {
        return iMotifPaiementService.getMotifPaiementById(id);
    }
@GetMapping("/all")
    public List<MotifPaiementEntity> getMotifPaiements() {
        return iMotifPaiementService.getMotifPaiements();
    }
}
