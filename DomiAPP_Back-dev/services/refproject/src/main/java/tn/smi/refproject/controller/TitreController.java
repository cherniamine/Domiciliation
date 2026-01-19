package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.TitreEntity;
import tn.smi.refproject.services.Interface.ITitreService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/Titre")
public class TitreController {
    private ITitreService iTitreService;
@GetMapping("/get/{id}")
    public TitreEntity getTitreById(@PathVariable Byte id) {
        return iTitreService.getTitreById(id);
    }
@GetMapping("/all")
    public List<TitreEntity> getTitres() {
        return iTitreService.getTitres();
    }
}
