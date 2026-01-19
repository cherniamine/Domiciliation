package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.CompteDetails;
import tn.smi.refproject.entities.CompteEntity;
import tn.smi.refproject.entities.CompteEntityPK;
import tn.smi.refproject.services.Interface.ICompteService;

import java.math.BigInteger;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/Compte")
public class CompteController {
    private ICompteService iCompteService;
@GetMapping("/get/{typePieceClient}/{noPieceClient}/{codeAgenceBct}/{racineCompte}/{cleRib}")
    public CompteEntity getCompteById(@PathVariable BigInteger typePieceClient,@PathVariable String noPieceClient,@PathVariable BigInteger codeAgenceBct, @PathVariable String racineCompte,@PathVariable BigInteger cleRib) {
        CompteEntityPK id=new CompteEntityPK(typePieceClient,noPieceClient,codeAgenceBct,racineCompte,cleRib);
        return iCompteService.getCompteById(id);
    }
@GetMapping("/all")
    public List<CompteEntity> getComptes() {
        return iCompteService.getComptes();
    }

    @GetMapping("/allNoPiecesClients")
    public List<String> getAllNoPiecesClients() {
        return iCompteService.getAllNoPiecesClients();
    }

    @GetMapping("/getCompteRib/{noPieceClient}")

    public List<String> getCompteRib(@PathVariable String noPieceClient) {
        return iCompteService.getAllRibsForClient(noPieceClient);
    }
}
