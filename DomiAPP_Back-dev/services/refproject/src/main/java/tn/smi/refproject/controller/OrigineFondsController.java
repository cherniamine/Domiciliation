package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.OrigineFondsEntity;
import tn.smi.refproject.services.Interface.IOrigineFondsService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/OrigineFonds")
public class OrigineFondsController {
    private IOrigineFondsService iOrigineFondsService;
@GetMapping("/get/{id}")
    public OrigineFondsEntity getOrigineFondsById(@PathVariable Byte id) {
        return iOrigineFondsService.getOrigineFondsById(id);
    }
@GetMapping("/all")
    public List<OrigineFondsEntity> getOrigineFondss() {
        return iOrigineFondsService.getOrigineFondss();
    }
}
