package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.ComClientEntity;
import tn.smi.refproject.entities.ComClientEntityPK;
import tn.smi.refproject.services.Interface.IComClientService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/ComClient")
public class ComClientController {
    private IComClientService iComClientService;
@GetMapping("/get/{typePieceClient}/{noPieceClient}/{codeCommission}")
    public ComClientEntity getComClientById(@PathVariable int typePieceClient,@PathVariable String noPieceClient,@PathVariable int codeCommission) {
    ComClientEntityPK id=new ComClientEntityPK(typePieceClient,noPieceClient,codeCommission);
        return iComClientService.getComClientById(id);
    }
@GetMapping("/all")
    public List<ComClientEntity> getComClients() {
        return iComClientService.getComClients();
    }
}
