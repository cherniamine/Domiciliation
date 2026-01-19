package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.ComSurCrpEntity;
import tn.smi.refproject.services.Interface.IComSurCrpService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/ComSurCrp")
public class ComSurCrpController {
    private IComSurCrpService iComSurCrpService;
@GetMapping("/get/{id}")
    public ComSurCrpEntity getComSurCrpById(@PathVariable Long id) {
        return iComSurCrpService.getComSurCrpById(id);
    }
@GetMapping("/all")
    public List<ComSurCrpEntity> getComSurCrps() {
        return iComSurCrpService.getComSurCrps();
    }
}
