package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.AgenceEtrangereEntity;
import tn.smi.refproject.services.Interface.IAgenceEtrangereService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/AgenceEtrangere")
public class AgenceEtrangereController {
    private IAgenceEtrangereService iAgenceEtrangereService;
@GetMapping("/get/{id}")
    public AgenceEtrangereEntity getAgenceEtrangereById(@PathVariable Long id) {
        return iAgenceEtrangereService.getAgenceEtrangereById(id);
    }
@GetMapping("/all")
    public List<AgenceEtrangereEntity> getAgenceEtrangeres() {
        return iAgenceEtrangereService.getAgenceEtrangeres();
    }
}
