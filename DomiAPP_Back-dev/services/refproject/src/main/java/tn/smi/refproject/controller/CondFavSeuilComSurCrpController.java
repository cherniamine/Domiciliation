package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.CondFavSeuilComSurCrpEntity;
import tn.smi.refproject.services.Interface.ICondFavSeuilComSurCrpService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/CondFavSeuilComSurCrp")
public class CondFavSeuilComSurCrpController {
    private ICondFavSeuilComSurCrpService iCondFavSeuilComSurCrpService;
@GetMapping("/get/{id}")
    public CondFavSeuilComSurCrpEntity getCondFavSeuilComSurCrpById(@PathVariable Long id) {
        return iCondFavSeuilComSurCrpService.getCondFavSeuilComSurCrpById(id);
    }
@GetMapping("/all")
    public List<CondFavSeuilComSurCrpEntity> getCondFavSeuilComSurCrps() {
        return iCondFavSeuilComSurCrpService.getCondFavSeuilComSurCrps();
    }
}
