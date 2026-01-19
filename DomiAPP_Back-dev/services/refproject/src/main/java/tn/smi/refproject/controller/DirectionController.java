package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.DirectionEntity;
import tn.smi.refproject.services.Interface.IDirectionService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/Direction")
public class DirectionController {
    private IDirectionService iDirectionService;
@GetMapping("/get/{id}")
    public DirectionEntity getDirectionById(@PathVariable Byte id) {
        return iDirectionService.getDirectionById(id);
    }
@GetMapping("/all")
    public List<DirectionEntity> getDirections() {
        return iDirectionService.getDirections();
    }
}
