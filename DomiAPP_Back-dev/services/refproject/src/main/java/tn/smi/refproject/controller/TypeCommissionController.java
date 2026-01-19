package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.TypeCommissionEntity;
import tn.smi.refproject.services.Interface.ITypeCommissionService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/TypeCommission")
public class TypeCommissionController {
    private ITypeCommissionService iTypeCommissionService;
@GetMapping("/get/{id}")
    public TypeCommissionEntity getTypeCommissionById(@PathVariable Byte id) {
        return iTypeCommissionService.getTypeCommissionById(id);
    }
@GetMapping("/all")
    public List<TypeCommissionEntity> getTypeCommissions() {
        return iTypeCommissionService.getTypeCommissions();
    }
}
