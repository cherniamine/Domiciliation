package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.CommissionEntity;
import tn.smi.refproject.services.Interface.ICommissionService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/Commission")
public class CommissionController {
    private ICommissionService iCommissionService;
@GetMapping("/get/{id}")
    public CommissionEntity getCommissionById(@PathVariable int id) {
        return iCommissionService.getCommissionById(id);
    }
@GetMapping("/all")
    public List<CommissionEntity> getCommissions() {
        return iCommissionService.getCommissions();
    }
}
