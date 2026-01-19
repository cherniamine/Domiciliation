package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.PreleverEntity;
import tn.smi.refproject.entities.PreleverEntityPK;
import tn.smi.refproject.services.Interface.IPreleverService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/Prelever")
public class PreleverController {
    private IPreleverService iPreleverService;
@GetMapping("/get/{codeOperation}/{codeProduitService}/{codeCommission}/{codeTypeOperation}")
    public PreleverEntity getPreleverById(@PathVariable short codeOperation,@PathVariable byte codeProduitService, @PathVariable int codeCommission,@PathVariable int codeTypeOperation) {
        PreleverEntityPK id=new PreleverEntityPK(codeOperation,codeProduitService,codeCommission,codeTypeOperation);
        return iPreleverService.getPreleverById(id);
    }
@GetMapping("/all")
    public List<PreleverEntity> getPrelevers() {
        return iPreleverService.getPrelevers();
    }
}
