package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.CompteIntEntity;
import tn.smi.refproject.services.Interface.ICompteIntService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/CompteInt")
public class CompteIntController {
    private ICompteIntService iCompteIntService;
@GetMapping("/get/{id}")
    public CompteIntEntity getCompteIntById(@PathVariable Long id) {
        return iCompteIntService.getCompteIntById(id);
    }
@GetMapping("/all")
    public List<CompteIntEntity> getComptInts() {
        return iCompteIntService.getComptInts();
    }
}
