package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.BureauDouaneEntity;
import tn.smi.refproject.services.Interface.IBureauDouaneService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/BureauDouane")
public class BureauDouaneController {
    public IBureauDouaneService iBureauDouaneService;
@GetMapping("/get/{id}")
    public BureauDouaneEntity getBureauDouaneById(@PathVariable Byte id) {
        return iBureauDouaneService.getBureauDouaneById(id);
    }
@GetMapping("/all")
    public List<BureauDouaneEntity> getBureauDouanes() {
        return iBureauDouaneService.getBureauDouanes();
    }
}
