package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.JourFerrieEntity;
import tn.smi.refproject.entities.JourFerrieEntityPK;
import tn.smi.refproject.services.Interface.IJourFerrieService;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/JourFerrie")
public class JourFerrieController {
    private IJourFerrieService iJourFerrieService;
@GetMapping("/get/{codePays}/{dateFerrie}")
    public JourFerrieEntity getJourFerrieById(@PathVariable byte codePays,@PathVariable LocalDate dateFerrie) {
        JourFerrieEntityPK id=new JourFerrieEntityPK(codePays,dateFerrie);
        return iJourFerrieService.getJourFerrieById(id);
    }
@GetMapping("/all")
    public List<JourFerrieEntity> getJourFerries() {
        return iJourFerrieService.getJourFerries();
    }
}
