package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.CompteInt2Entity;
import tn.smi.refproject.services.Interface.ICompteInt2Service;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/CompteInt2")
public class CompteInt2Controller {
    private ICompteInt2Service iCompteInt2Service;
@GetMapping("/get/{id}")
    public CompteInt2Entity getCompteInt2ById(@PathVariable Long id) {
        return iCompteInt2Service.getCompteInt2ById(id);
    }
@GetMapping("/all")
    public List<CompteInt2Entity> getCompteInt2s() {
        return iCompteInt2Service.getCompteInt2s();
    }
}
