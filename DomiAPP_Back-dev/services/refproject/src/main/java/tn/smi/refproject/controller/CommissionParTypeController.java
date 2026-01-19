package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.CommissionParTypeEntity;
import tn.smi.refproject.services.Interface.ICommissionParTypeService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/CommissionParType")
public class CommissionParTypeController {
    private ICommissionParTypeService iCommissionParTypeService;
@GetMapping("/get/{id}")
    public CommissionParTypeEntity getCommissionParTypeById(@PathVariable Short id) {
        return iCommissionParTypeService.getCommissionParTypeById(id);
    }
@GetMapping("/all")
    public List<CommissionParTypeEntity> getCommissionParTypes() {
        return iCommissionParTypeService.getCommissionParTypes();
    }
}
