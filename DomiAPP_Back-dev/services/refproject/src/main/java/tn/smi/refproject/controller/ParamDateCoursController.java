package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.ParamDateCoursEntity;
import tn.smi.refproject.services.Interface.IParamDateCoursService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/ParamDateCours")
public class ParamDateCoursController {
    IParamDateCoursService iParamDateCoursService;
@GetMapping("/get/{id}")
    public ParamDateCoursEntity getParamDateCoursById(@PathVariable Long id) {
        return iParamDateCoursService.getParamDateCoursById(id);
    }
@GetMapping("/all")
    public List<ParamDateCoursEntity> getParamDateCourss() {
        return iParamDateCoursService.getParamDateCourss();
    }
}
