package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.CondFavComSurCrpEntity;
import tn.smi.refproject.services.Interface.ICondFavComSurCrpService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/CondFavComSurCrp")
public class CondFavComSurCrpController {
    private ICondFavComSurCrpService iCondFavComSurCrpService;
@GetMapping("/get/{id}")
    public CondFavComSurCrpEntity getCondFavComSurCrpById(@PathVariable Long id) {
        return iCondFavComSurCrpService.getCondFavComSurCrpById(id);
    }
@GetMapping("/all")
    public List<CondFavComSurCrpEntity> getCondFavComSurCrps() {
        return iCondFavComSurCrpService.getCondFavComSurCrps();
    }
}
