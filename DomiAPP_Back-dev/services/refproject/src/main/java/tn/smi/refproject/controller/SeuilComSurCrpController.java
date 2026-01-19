package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.SeuilComSurCrpEntity;
import tn.smi.refproject.services.Interface.ISeuilComSurCrpService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/SeuilComSurCrp")
public class SeuilComSurCrpController {
    private ISeuilComSurCrpService iSeuilComSurCrpService;
@GetMapping("/get/{id}")
    public SeuilComSurCrpEntity getSeuilComSurCrpById(@PathVariable Long id) {
        return iSeuilComSurCrpService.getSeuilComSurCrpById(id);
    }
@GetMapping("/all")
    public List<SeuilComSurCrpEntity> getSeuilComSurCrps() {
        return iSeuilComSurCrpService.getSeuilComSurCrps();
    }
}
