package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.BanqueEtrangereEntity;
import tn.smi.refproject.services.Interface.IBanqueEtrangereService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/BanqueEtrangere")
public class BanqueEtrangereController {
    private IBanqueEtrangereService iBanqueEtrangereService;

@GetMapping("/get/{id}")
    public BanqueEtrangereEntity getBanqueEtrangereById(@PathVariable Long id) {
        return iBanqueEtrangereService.getBanqueEtrangereById(id);
    }
@GetMapping("/all")
    public List<BanqueEtrangereEntity> getBanqueEtrangeres() {
        return iBanqueEtrangereService.getBanqueEtrangeres();
    }
}
