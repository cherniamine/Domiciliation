package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.ActiviteDivisionEntity;
import tn.smi.refproject.entities.ActiviteDivisionEntityPK;
import tn.smi.refproject.services.Interface.IActiviteDivisionService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/ActiviteDivision")
public class ActiviteDivisionController {
    private IActiviteDivisionService iActiviteDivisionService;

@GetMapping("/get/{section}/{division}")
    public ActiviteDivisionEntity getActiviteDivisionById(@PathVariable String section,@PathVariable Byte division) {
    ActiviteDivisionEntityPK id=new ActiviteDivisionEntityPK(section,division);
        return iActiviteDivisionService.getActiviteDivisionById(id);
    }
@GetMapping("/all")
    public List<ActiviteDivisionEntity> getActiviteDivisions() {
        return iActiviteDivisionService.getActiviteDivisions();
    }
}
