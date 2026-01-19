package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.AccordBctMvtEntity;
import tn.smi.refproject.entities.AccordBctMvtEntityPK;
import tn.smi.refproject.services.Interface.IAccordBctMvtService;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/AccordBctMvt")
public class AccordBctMvtController {
    private IAccordBctMvtService iAccordBctMvtService;

@GetMapping("/get/{codeProduitService}/{codeOperation}/{refOperation}")
    public AccordBctMvtEntity getAccordBctMvtById(@PathVariable Short codeProduitService,@PathVariable Short codeOperation,@PathVariable int refOperation) {
        AccordBctMvtEntityPK id=new AccordBctMvtEntityPK(codeProduitService,codeOperation, LocalDate.now(),refOperation);
        return iAccordBctMvtService.getAccordBctMvtById(id);
    }
@GetMapping("/all")
    public List<AccordBctMvtEntity> getAccordBctMvts() {
        return iAccordBctMvtService.getAccordBctMvts();
    }
}
