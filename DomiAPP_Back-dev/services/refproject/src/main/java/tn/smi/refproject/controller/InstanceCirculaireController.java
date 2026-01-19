package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.InstanceCirculaireEntity;
import tn.smi.refproject.services.Interface.IInstanceCirculaireService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/InstanceCirculaire")
public class InstanceCirculaireController {
    private IInstanceCirculaireService iInstanceCirculaireService;
 @GetMapping("/get/{id}")
    public InstanceCirculaireEntity getInstanceCirculaireById(@PathVariable Short id) {
        return iInstanceCirculaireService.getInstanceCirculaireById(id);
    }
@GetMapping("/all")
    public List<InstanceCirculaireEntity> getInstanceCirculaires() {
        return iInstanceCirculaireService.getInstanceCirculaires();
    }
}
