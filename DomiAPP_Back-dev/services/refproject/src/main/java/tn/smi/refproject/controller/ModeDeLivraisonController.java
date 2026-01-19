package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.ModeDeLivraisonEntity;
import tn.smi.refproject.services.Interface.IModeDeLivraisonService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/ModeDeLivraison")
public class ModeDeLivraisonController {
    private IModeDeLivraisonService iModeDeLivraisonService;
@GetMapping("/get/{id}")
    public ModeDeLivraisonEntity getModeDeLivraisonById(@PathVariable Byte id) {
        return iModeDeLivraisonService.getModeDeLivraisonById(id);
    }
@GetMapping("/all")
    public List<ModeDeLivraisonEntity> getModeDeLivraisons() {
        return iModeDeLivraisonService.getModeDeLivraisons();
    }
@GetMapping("/allmodliv")

    public List<Long> getAllModLiv() {
        return iModeDeLivraisonService.getAllModLiv();
    }
}
