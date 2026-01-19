package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.CorrespSbeNsiEntity;
import tn.smi.refproject.entities.CorrespSbeNsiEntityPK;
import tn.smi.refproject.services.Interface.ICorrespSbeNsiService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/CorrespSbeNsi")
public class CorrespSbeNsiController {
    private ICorrespSbeNsiService iCorrespSbeNsiService;
@GetMapping("/get/{codeProduitServiceOrig}/{codeOperationOrig}/{codeProduitServicr}/{codeOperation}")
    public CorrespSbeNsiEntity getCorrespSbeNsiById(@PathVariable short codeProduitServiceOrig,@PathVariable int codeOperationOrig,@PathVariable short codeProduitServicr,@PathVariable short codeOperation) {
    CorrespSbeNsiEntityPK id=new CorrespSbeNsiEntityPK(codeProduitServiceOrig,codeOperationOrig,codeProduitServicr,codeOperation);
        return iCorrespSbeNsiService.getCorrespSbeNsiById(id);
    }
@GetMapping("/all")
    public List<CorrespSbeNsiEntity> getCorrespSbeNsis() {
        return iCorrespSbeNsiService.getCorrespSbeNsis();
    }
}
