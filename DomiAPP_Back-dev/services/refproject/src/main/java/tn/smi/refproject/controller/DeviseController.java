package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.DeviseEntity;
import tn.smi.refproject.services.Interface.IDeviseService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/Devise")
public class DeviseController {
    private IDeviseService iDeviseService;
@GetMapping("/get/{id}")
    public DeviseEntity getDeviseById(@PathVariable Byte id) {
        return iDeviseService.getDeviseById(id);
    }
    @GetMapping("/all")
    public List<DeviseEntity> getDevises() {
        return iDeviseService.getDevises();
    }

@GetMapping("/allcodedevises")
    public List<Long> getAllCodeDevise() {
        return iDeviseService.getAllCodeDevise();
    }
}
