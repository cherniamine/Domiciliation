package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.ConditionParCorrespondantEntity;
import tn.smi.refproject.services.Interface.IConditionParCorrespondantService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/ConditionParCorrespandant")
public class ConditionParCorrespandantController {
    private IConditionParCorrespondantService iConditionParCorrespondantService;
@GetMapping("/get/{id}")
    public ConditionParCorrespondantEntity getConditionParCorrespondantById(@PathVariable Long id) {
        return iConditionParCorrespondantService.getConditionParCorrespondantById(id);
    }
@GetMapping("/all")
    public List<ConditionParCorrespondantEntity> getConditionParCorrespondants() {
        return iConditionParCorrespondantService.getConditionParCorrespondants();
    }
}
