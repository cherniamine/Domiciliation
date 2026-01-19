package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.ActiviteClasseEntity;
import tn.smi.refproject.entities.ActiviteClasseEntityPK;
import tn.smi.refproject.services.Interface.IActiviteClasseService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/ActiviteClasse")
public class ActiviteClasseController {
    private IActiviteClasseService iActiviteClasseService;
@GetMapping("/get/{codeSection}/{codeDivision}/{codeGroupe}/{codeClasse}")
    public ActiviteClasseEntity getActiviteClasseById(@PathVariable String codeSection,@PathVariable Byte codeDivision,@PathVariable int codeGroupe,@PathVariable int codeClasse) {
        ActiviteClasseEntityPK id=new ActiviteClasseEntityPK(codeSection,codeDivision,codeGroupe,codeClasse);
        return iActiviteClasseService.getActiviteClasseById(id);
    }
@GetMapping("/all")
    public List<ActiviteClasseEntity> getActiviteClasses() {
        return iActiviteClasseService.getActiviteClasses();
    }


}
