package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.TypeOperationCommissionEntity;
import tn.smi.refproject.entities.TypeOperationCommissionEntityPK;
import tn.smi.refproject.services.Interface.ITypeOperationCommissionService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/TypeOperationCommission")
public class TypeOperationCommissionController {
    private ITypeOperationCommissionService iTypeOperationCommissionService;
@GetMapping("/get/{codeProduitService}/{codeOperation}/{codeTypeOperation}")
    public TypeOperationCommissionEntity getTypeOperationCommissionById(@PathVariable short codeProduitService,@PathVariable short codeOperation,@PathVariable int codeTypeOperation) {
        TypeOperationCommissionEntityPK id=new TypeOperationCommissionEntityPK(codeProduitService,codeOperation,codeTypeOperation);
        return iTypeOperationCommissionService.getTypeOperationCommissionById(id);
    }
@GetMapping("/all")
    public List<TypeOperationCommissionEntity> getTypeOperationCommissions() {
        return iTypeOperationCommissionService.getTypeOperationCommissions();
    }
}
