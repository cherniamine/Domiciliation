package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.PersonneEntity;
import tn.smi.refproject.entities.PersonneEntityPK;
import tn.smi.refproject.services.Interface.IPersonneService;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/Personne")
public class PersonneController {
    private IPersonneService iPersonneService;
@GetMapping("/get/{noPiecepersonne}/{typePiecePersonne}")
    public PersonneEntity getPersonneById(@PathVariable String noPiecepersonne,@PathVariable int typePiecePersonne) {
    PersonneEntityPK id=new PersonneEntityPK(noPiecepersonne,typePiecePersonne);
        return iPersonneService.getPersonneById(id);
    }
@GetMapping("/all")
    public List<PersonneEntity> getPersonnes() {
        return iPersonneService.getPersonnes();
    }

    @GetMapping("/nomPrenom/{noPiecePersonne}")
    public Optional<String> getNomEtPrenom(@PathVariable String noPiecePersonne) {
        return iPersonneService.getNomEtPrenom(noPiecePersonne);
    }
}
