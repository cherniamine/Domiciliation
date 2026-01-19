package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.ClientProhibeEntity;
import tn.smi.refproject.entities.ClientProhibeEntityPK;
import tn.smi.refproject.services.Interface.IClientProhibeService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/ClientProhibe")
public class ClientProhibeController {
    private IClientProhibeService iClientProhibeService;
@GetMapping("/get/{noPieceClient}/{typePieceClient}")
    public ClientProhibeEntity getClientProhibeById(@PathVariable String noPieceClient, @PathVariable int typePieceClient) {
        ClientProhibeEntityPK id=new ClientProhibeEntityPK(typePieceClient,noPieceClient);
        return iClientProhibeService.getClientProhibeById(id);
    }
@GetMapping("/all")
    public List<ClientProhibeEntity> getClientProhibes() {
        return iClientProhibeService.getClientProhibes();
    }
}
