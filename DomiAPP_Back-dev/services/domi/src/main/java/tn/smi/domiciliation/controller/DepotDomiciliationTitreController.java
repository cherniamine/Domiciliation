package tn.smi.domiciliation.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.smi.domiciliation.entities.DepotDomiciliationTitreEntity;
import tn.smi.domiciliation.entities.DepotDomiciliationTitreEntityPK;
import tn.smi.domiciliation.services.Interface.IDepotDomicliationTitre;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/domi/DepotDomiciliationTitre")
public class DepotDomiciliationTitreController {
    private IDepotDomicliationTitre iDepotDomicliationTitre;
@PostMapping("/create")
    public DepotDomiciliationTitreEntity create(@RequestBody DepotDomiciliationTitreEntity depotDomiciliationTitre) {
        return iDepotDomicliationTitre.createDT(depotDomiciliationTitre);
    }
@PutMapping("/update/{id}")
    public DepotDomiciliationTitreEntity update(@RequestBody DepotDomiciliationTitreEntity depotDomiciliationTitre, @PathVariable Long id) {
        return iDepotDomicliationTitre.updateDT(depotDomiciliationTitre, id);
    }
@DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        iDepotDomicliationTitre.deleteDT(id);
    }
@GetMapping("/get/{id}")
    public DepotDomiciliationTitreEntity getById(@PathVariable Long id) {
        return iDepotDomicliationTitre.getByIdDT(id);
    }
@GetMapping("/all")
    public List<DepotDomiciliationTitreEntity> getAll() {
        return iDepotDomicliationTitre.getAllDT();
    }
@PostMapping("/verifEtat/{id}")
    public void EtatVerifie(@PathVariable Long id) {
        iDepotDomicliationTitre.EtatVerifie(id);
    }
    @PostMapping("/updateEtat/{id}")

    public void EtatModif(@PathVariable Long id) {
        iDepotDomicliationTitre.EtatModif(id);
    }
    @PostMapping("/observation/{id}/{msg}")

    public void AjouterObservation(@PathVariable Long id,@PathVariable String msg) {
        iDepotDomicliationTitre.AjouterObservation(id, msg);
    }
}
