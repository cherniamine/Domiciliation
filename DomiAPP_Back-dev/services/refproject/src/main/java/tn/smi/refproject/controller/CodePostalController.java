package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.CodePostalEntity;
import tn.smi.refproject.entities.CodePostalEntityPK;
import tn.smi.refproject.services.Interface.ICodePostalService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/CodePostal")
public class CodePostalController {
    private ICodePostalService iCodePostalService;
@GetMapping("/get/{codeGouv}/{codeDirection}/{codePostal}")
    public CodePostalEntity getCodePostalByid(@PathVariable Byte codeGouv,@PathVariable Byte codeDirection,@PathVariable String codePostal) {
        CodePostalEntityPK id=new CodePostalEntityPK(codeGouv,codeDirection,codePostal);
        return iCodePostalService.getCodePostalByid(id);
    }
@GetMapping("/all")
    public List<CodePostalEntity> getCodePostals() {
        return iCodePostalService.getCodePostals();
    }
}
