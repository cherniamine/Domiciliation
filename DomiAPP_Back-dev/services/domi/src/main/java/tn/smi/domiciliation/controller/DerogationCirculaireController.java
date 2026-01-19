package tn.smi.domiciliation.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.smi.domiciliation.entities.DerogationCirculaireEntity;
import tn.smi.domiciliation.entities.DerogationCirculaireEntityPK;
import tn.smi.domiciliation.services.Interface.IDerogationCirculaire;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/domi/DerogationCirculaire")
public class DerogationCirculaireController {
    private IDerogationCirculaire iDerogationCirculaire;
@PostMapping("/create")
    public DerogationCirculaireEntity createDC(@RequestBody DerogationCirculaireEntity derogationCirculaire) {
        return iDerogationCirculaire.createDC(derogationCirculaire);
    }
@PutMapping("/update/{id}")
    public DerogationCirculaireEntity updateDC(@RequestBody DerogationCirculaireEntity derogationCirculaire,@PathVariable DerogationCirculaireEntityPK id) {
        return iDerogationCirculaire.updateDC(derogationCirculaire, id);
    }
@DeleteMapping("/delete/{id}")
    public void deleteDC(@PathVariable DerogationCirculaireEntityPK id) {
        iDerogationCirculaire.deleteDC(id);
    }
@GetMapping("/get/{id}")
    public DerogationCirculaireEntity getByIdDC(@PathVariable DerogationCirculaireEntityPK id) {
        return iDerogationCirculaire.getByIdDC(id);
    }
@GetMapping("/all")
    public List<DerogationCirculaireEntity> getAllDC() {
        return iDerogationCirculaire.getAllDC();
    }
}
