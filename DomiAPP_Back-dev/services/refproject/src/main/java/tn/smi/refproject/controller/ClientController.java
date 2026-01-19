package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.DTO.ActivityResponse;
import tn.smi.refproject.entities.ActiviteClasseEntity;
import tn.smi.refproject.entities.ClientEntity;
import tn.smi.refproject.entities.ClientEntityPK;
import tn.smi.refproject.services.Imp.ClientService;
import tn.smi.refproject.services.Interface.IActiviteClasseService;
import tn.smi.refproject.services.Interface.IClientService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/Client")
public class ClientController {
    private final IClientService iClientService;
    private IActiviteClasseService iActiviteClasseService;
    @Autowired
    private ClientService clientService;
    @GetMapping("/get/{noPieceClient}/{typePieceClient}")
    public ClientEntity getClientById(@PathVariable String noPieceClient, @PathVariable int typePieceClient) {
        ClientEntityPK id = new ClientEntityPK(noPieceClient, typePieceClient);
        return iClientService.getClientById(id);
    }



    @GetMapping("/all")
    public List<ClientEntity> getClients() {
        return iClientService.getClients();
    }

    @GetMapping("/totalement-exportatrice/{noPieceClient}")
    public ResponseEntity<Boolean> isTotalementExportatrice(@PathVariable String noPieceClient) {
        boolean result = iClientService.isTotalementExportatrice(noPieceClient);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/activities/{noPieceClient}")
    public ResponseEntity<ActivityResponse> getClientActivities(@PathVariable String noPieceClient) {
        ActivityResponse response = clientService.getClientActivities(noPieceClient);
        return ResponseEntity.ok(response);
    }



}
