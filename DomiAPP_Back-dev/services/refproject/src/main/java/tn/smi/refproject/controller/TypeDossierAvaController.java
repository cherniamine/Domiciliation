package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.TypeDossierAvaEntity;
import tn.smi.refproject.services.Interface.ITypeDossierAvaService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/TypeDossierAva")
public class TypeDossierAvaController {
    private ITypeDossierAvaService iTypeDossierAvaService;
@GetMapping("/get/{id}")
    public TypeDossierAvaEntity getTypeDossierAvaById(@PathVariable Long id) {
        return iTypeDossierAvaService.getTypeDossierAvaById(id);
    }
@GetMapping("/all")
    public List<TypeDossierAvaEntity> getTypeDossierAvas() {
        return iTypeDossierAvaService.getTypeDossierAvas();
    }
}
