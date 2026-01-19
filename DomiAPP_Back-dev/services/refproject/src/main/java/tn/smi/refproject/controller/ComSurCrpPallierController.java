package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.ComSurCrpPallierEntity;
import tn.smi.refproject.services.Interface.IComSurCrpPalierService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/ComSurCrpPallier")
public class ComSurCrpPallierController {
    private IComSurCrpPalierService iComSurCrpPalierService;
@GetMapping("/get/{id}")
    public ComSurCrpPallierEntity getComSurCrpPalierById(@PathVariable Long id) {
        return iComSurCrpPalierService.getComSurCrpPalierById(id);
    }
@GetMapping("/all")
    public List<ComSurCrpPallierEntity> getComSurCrpPaliers() {
        return iComSurCrpPalierService.getComSurCrpPaliers();
    }
}
