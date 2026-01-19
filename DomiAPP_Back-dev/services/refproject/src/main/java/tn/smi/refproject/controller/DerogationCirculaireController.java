package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.DerogationCirculaireEntity;
import tn.smi.refproject.services.Interface.IDerogationCirculaireService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/DerogationCirculaire")
public class DerogationCirculaireController {
    private IDerogationCirculaireService iDerogationCirculaireService;
@GetMapping("/get/{id}")
    public DerogationCirculaireEntity getDerogationCirculaireById(@PathVariable String id) {
        return iDerogationCirculaireService.getDerogationCirculaireById(id);
    }
@GetMapping("/all")
    public List<DerogationCirculaireEntity> getDerogationCirculaires() {
        return iDerogationCirculaireService.getDerogationCirculaires();
    }
}
