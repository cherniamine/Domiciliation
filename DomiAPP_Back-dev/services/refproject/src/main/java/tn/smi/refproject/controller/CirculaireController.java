package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.CirculaireEntity;
import tn.smi.refproject.entities.CirculaireEntityPK;
import tn.smi.refproject.services.Interface.ICirculaireService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/Circulaire")
public class CirculaireController {
    private ICirculaireService iCirculaireService;
@GetMapping("/get/{codeInstance}/{referenceCirculaire}")
    public CirculaireEntity getCirculaireById(@PathVariable Short codeInstance,@PathVariable String referenceCirculaire) {
        CirculaireEntityPK id=new CirculaireEntityPK(codeInstance,referenceCirculaire);
        return iCirculaireService.getCirculaireById(id);
    }
@GetMapping("/all")
    public List<CirculaireEntity> getCirculaires() {
        return iCirculaireService.getCirculaires();
    }
}
