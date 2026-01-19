package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.TypeOperationEntity;
import tn.smi.refproject.entities.TypeOperationEntityPK;
import tn.smi.refproject.services.Interface.ITypeOperationService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/TypeOperation")
public class TypeOperationController {
    private ITypeOperationService iTypeOperationService;
@GetMapping("/get/{codeProduitService}/{codeOperation}/{codeTypeOperation}")
    public TypeOperationEntity getTypeOperationById(@PathVariable short codeProduitService,@PathVariable short codeOperation,@PathVariable short codeTypeOperation) {
        TypeOperationEntityPK id=new TypeOperationEntityPK(codeProduitService,codeOperation,codeTypeOperation);
        return iTypeOperationService.getTypeOperationById(id);
    }
@GetMapping("/all")
    public List<TypeOperationEntity> getTypeOperations() {
        return iTypeOperationService.getTypeOperations();
    }
}
