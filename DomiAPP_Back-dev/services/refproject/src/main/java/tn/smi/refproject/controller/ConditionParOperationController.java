package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.ConditionParOperationEntity;
import tn.smi.refproject.entities.ConditionParOperationEntityPK;
import tn.smi.refproject.services.Interface.IConditionParOperationService;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/ConditionParOperation")
public class ConditionParOperationController {
    private IConditionParOperationService iConditionParOperationService;
@GetMapping("/get/{typePieceClient}/{noPieceClient}/{typeDossier}/{numDossier}/{codeCommission}")
    public ConditionParOperationEntity getConditionParOperationById(@PathVariable int typePieceClient,@PathVariable String noPieceClient,@PathVariable String typeDossier,@PathVariable int numDossier,@PathVariable int codeCommission) {
    ConditionParOperationEntityPK id=new ConditionParOperationEntityPK(typePieceClient,noPieceClient,typeDossier, numDossier,LocalDate.now(),codeCommission);
        return iConditionParOperationService.getConditionParOperationById(id);
    }
@GetMapping("/all")
    public List<ConditionParOperationEntity> getConditionParOperations() {
        return iConditionParOperationService.getConditionParOperations();
    }
}
