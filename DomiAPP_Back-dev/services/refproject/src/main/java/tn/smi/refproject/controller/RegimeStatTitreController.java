package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.RegimeStatTitreEntity;
import tn.smi.refproject.entities.RegimeStatTitreEntityPK;
import tn.smi.refproject.services.Interface.IRegimeStatTitreService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/RegimeStatTitre")
public class RegimeStatTitreController {
    private IRegimeStatTitreService iRegimeStatTitreService;
 @GetMapping("/get/{codeTitre}/{codeRegimeStat}")
    public RegimeStatTitreEntity getRegimeStatTitreById(@PathVariable byte codeTitre,@PathVariable byte codeRegimeStat) {
        RegimeStatTitreEntityPK id=new RegimeStatTitreEntityPK(codeTitre,codeRegimeStat);
        return iRegimeStatTitreService.getRegimeStatTitreById(id);
    }
@GetMapping("/all")
    public List<RegimeStatTitreEntity> getRegimeStatTitres() {
        return iRegimeStatTitreService.getRegimeStatTitres();
    }
}
