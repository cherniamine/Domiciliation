package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.DTO.agence;
import tn.smi.refproject.entities.AgenceEntity;
import tn.smi.refproject.entities.AgenceEntityPK;
import tn.smi.refproject.services.Interface.IAgenceService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/Agence")
public class AgenceController {

    private IAgenceService iAgenceService;

    @GetMapping("/get/{codeBanque}/{codeAgenceBct}")
    public AgenceEntity getAgenceById(@PathVariable Short codeBanque, @PathVariable Short codeAgenceBct) {
        AgenceEntityPK id = new AgenceEntityPK(codeBanque, codeAgenceBct);
        return iAgenceService.getAgenceById(id);
    }


@GetMapping("/all")
    public List<AgenceEntity> getAgences() {
        return iAgenceService.getAgences();
    }


    @GetMapping("/summary")
    public List<agence> getAgencesSummary() {
        return iAgenceService.getAgencesSummary();
    }

}