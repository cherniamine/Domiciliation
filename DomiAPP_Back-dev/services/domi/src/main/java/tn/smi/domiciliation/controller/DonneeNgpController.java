package tn.smi.domiciliation.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.smi.domiciliation.entities.DonneeNgpEntity;
import tn.smi.domiciliation.services.Interface.IDonneeNgp;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/domi/DonneeNgp")
public class DonneeNgpController {
    private IDonneeNgp iDonneeNgp;
@PostMapping("/create")
    public DonneeNgpEntity createDNGP(@RequestBody DonneeNgpEntity donneeNgp) {
        return iDonneeNgp.createDNGP(donneeNgp);
    }
@PutMapping("/update/{id}")
    public DonneeNgpEntity updateDNGP(@RequestBody DonneeNgpEntity donneeNgp,@PathVariable Long id) {
        return iDonneeNgp.updateDNGP(donneeNgp, id);
    }
@DeleteMapping("/delete/{id}")
    public void deleteNGP(@PathVariable Long id) {
        iDonneeNgp.deleteNGP(id);
    }
@GetMapping("/get/{id}")
    public DonneeNgpEntity getByIdDNGP(@PathVariable Long id) {
        return iDonneeNgp.getByIdDNGP(id);
    }
@GetMapping("/all")
    public List<DonneeNgpEntity> getAllDNGP() {
        return iDonneeNgp.getAllDNGP();
    }
}
