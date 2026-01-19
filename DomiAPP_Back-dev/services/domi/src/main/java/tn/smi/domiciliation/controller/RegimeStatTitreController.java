package tn.smi.domiciliation.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.smi.domiciliation.entities.RegimeStatTitreEntity;
import tn.smi.domiciliation.entities.RegimeStatTitreEntityPK;
import tn.smi.domiciliation.services.Interface.IRegimeStatTitre;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/domi/RegimeStatTitre")
public class RegimeStatTitreController {
    private IRegimeStatTitre iRegimeStatTitre;
@PostMapping("/create")
    public RegimeStatTitreEntity createRST(@RequestBody RegimeStatTitreEntity regimeStatTitre) {
        return iRegimeStatTitre.createRST(regimeStatTitre);
    }
@PutMapping("/update/{regimeStatTitreEntityPK}")
    public RegimeStatTitreEntity updateRST(@RequestBody RegimeStatTitreEntity regimeStatTitre,@PathVariable RegimeStatTitreEntityPK regimeStatTitreEntityPK) {
        return iRegimeStatTitre.updateRST(regimeStatTitre, regimeStatTitreEntityPK);
    }
@DeleteMapping("/delete/{regimeStatTitreEntityPK}")
    public void deleteRST(@PathVariable RegimeStatTitreEntityPK regimeStatTitreEntityPK) {
        iRegimeStatTitre.deleteRST(regimeStatTitreEntityPK);
    }
@GetMapping("/get/{regimeStatTitreEntityPK}")
    public RegimeStatTitreEntity getByIdRST(@PathVariable RegimeStatTitreEntityPK regimeStatTitreEntityPK) {
        return iRegimeStatTitre.getByIdRST(regimeStatTitreEntityPK);
    }
@GetMapping("/all")
    public List<RegimeStatTitreEntity> getAllRST() {
        return iRegimeStatTitre.getAllRST();
    }
}
