package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.CptNostroEntity;
import tn.smi.refproject.entities.CptNostroEntityPK;
import tn.smi.refproject.services.Interface.ICptNostroService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/CptNostro")
public class CptNostroController {
    private ICptNostroService iCptNostroService;
@GetMapping("/get/{codeBnqEtr}/{codeAgenceEtr}/{codeDevise}")
    public CptNostroEntity getCptNostroById(@PathVariable short codeBnqEtr,@PathVariable short codeAgenceEtr,@PathVariable byte codeDevise) {
    CptNostroEntityPK id=new CptNostroEntityPK(codeBnqEtr,codeAgenceEtr,codeDevise);
        return iCptNostroService.getCptNostroById(id);
    }
@GetMapping("/all")
    public List<CptNostroEntity> getCptNostros() {
        return iCptNostroService.getCptNostros();
    }
}
