package tn.smi.domiciliation.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.smi.domiciliation.entities.TitreEntity;
import tn.smi.domiciliation.services.Interface.ITitre;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/domi/Titre")
public class TitreController {
    private ITitre iTitre;
@PostMapping("/create")
    public TitreEntity createT(@RequestBody TitreEntity titre) {
        return iTitre.createT(titre);
    }
@PutMapping("/update/{id}")
    public TitreEntity updateT(@RequestBody TitreEntity titre,@PathVariable Byte id) {
        return iTitre.updateT(titre, id);
    }
@DeleteMapping("/delete/{id}")
    public void deleteT(@PathVariable Byte id) {
        iTitre.deleteT(id);
    }
@GetMapping("/get/{id}")
    public TitreEntity getByIdT(@PathVariable Byte id) {
        return iTitre.getByIdT(id);
    }
@GetMapping("/all")
    public List<TitreEntity> getAllT() {
        return iTitre.getAllT();
    }
}
