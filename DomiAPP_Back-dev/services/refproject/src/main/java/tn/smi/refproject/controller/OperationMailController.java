package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.OperationMailEntity;
import tn.smi.refproject.entities.OperationMailEntityPK;
import tn.smi.refproject.services.Interface.IOperationMailService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/OperationMail")
public class OperationMailController {
    private IOperationMailService iOperationMailService;
@GetMapping("/get/{codeProduitService}/{codeOperation}")
    public OperationMailEntity getOperationMailById(@PathVariable short codeProduitService,@PathVariable short codeOperation) {
        OperationMailEntityPK id=new OperationMailEntityPK(codeProduitService,codeOperation);
        return iOperationMailService.getOperationMailById(id);
    }
@GetMapping("/all")
    public List<OperationMailEntity> getOperationMails() {
        return iOperationMailService.getOperationMails();
    }
}
