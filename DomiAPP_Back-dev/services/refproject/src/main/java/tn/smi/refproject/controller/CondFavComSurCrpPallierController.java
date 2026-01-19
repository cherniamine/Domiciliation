package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.CondFavComSurCrpPallierEntity;
import tn.smi.refproject.services.Interface.ICondFavComSurCrpPalierService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/CondFavComSurCrpPallier")
public class CondFavComSurCrpPallierController {
    private ICondFavComSurCrpPalierService iCondFavComSurCrpPalierService;
@GetMapping("/get/{id}")
    public CondFavComSurCrpPallierEntity getCondFavComSurCrpPallierById(@PathVariable Long id) {
        return iCondFavComSurCrpPalierService.getCondFavComSurCrpPallierById(id);
    }
@GetMapping("/all")
    public List<CondFavComSurCrpPallierEntity> getCondFavComSurCrpPalliers() {
        return iCondFavComSurCrpPalierService.getCondFavComSurCrpPalliers();
    }
}
