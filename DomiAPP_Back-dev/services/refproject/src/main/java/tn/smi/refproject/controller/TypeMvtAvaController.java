package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.TypeMvtAvaEntity;
import tn.smi.refproject.services.Interface.ITypeMvtAvaService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/TypeMvtAva")
public class TypeMvtAvaController {
    private ITypeMvtAvaService iTypeMvtAvaService;
@GetMapping("/get/{id}")
    public TypeMvtAvaEntity getTypeMvtAvaById(@PathVariable String id) {
        return iTypeMvtAvaService.getTypeMvtAvaById(id);
    }
@GetMapping("/all")
    public List<TypeMvtAvaEntity> getTypeMvtAvas() {
        return iTypeMvtAvaService.getTypeMvtAvas();
    }
}
