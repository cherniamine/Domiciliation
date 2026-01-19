package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.CoursJoursDeviseEntity;
import tn.smi.refproject.entities.CoursJoursDeviseEntityPK;
import tn.smi.refproject.services.Interface.ICoursJourDeviseService;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/CoursJoursDevise")
public class CoursJoursDeviseController {
    private ICoursJourDeviseService iCoursJourDeviseService;

    @GetMapping("/get/{dateCours}/{codeDevise}")
    public CoursJoursDeviseEntity getCoursJourDeviseById(@PathVariable LocalDate dateCours, @PathVariable int codeDevise) {
        CoursJoursDeviseEntityPK id = new CoursJoursDeviseEntityPK(dateCours, codeDevise);
        return iCoursJourDeviseService.getCoursJourDeviseById(id);
    }

    @GetMapping("/all")
    public List<CoursJoursDeviseEntity> getCoursJourDevises() {
        return iCoursJourDeviseService.getCoursJourDevises();
    }
}
