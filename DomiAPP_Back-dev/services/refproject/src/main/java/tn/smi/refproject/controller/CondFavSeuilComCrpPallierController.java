package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.CondFavSeuilComCrpPallierEntity;
import tn.smi.refproject.services.Interface.ICondFavSeuilComCrpPallier;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/CondFavSeuilComCrpPallier")
public class CondFavSeuilComCrpPallierController {
    private ICondFavSeuilComCrpPallier iCondFavSeuilComCrpPallier;
@GetMapping("/get/{id}")
    public CondFavSeuilComCrpPallierEntity getCondFavSeuilComCrpPallierById(@PathVariable Long id) {
        return iCondFavSeuilComCrpPallier.getCondFavSeuilComCrpPallierById(id);
    }
@GetMapping("/all")
    public List<CondFavSeuilComCrpPallierEntity> getCondFavSeuilComCrpPallierEntitys() {
        return iCondFavSeuilComCrpPallier.getCondFavSeuilComCrpPallierEntitys();
    }
}
