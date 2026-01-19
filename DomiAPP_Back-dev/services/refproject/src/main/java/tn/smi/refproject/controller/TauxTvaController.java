package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.TauxTvaEntity;
import tn.smi.refproject.services.Interface.ITauxTvaService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/TauxTva")
public class TauxTvaController {
    private ITauxTvaService iTauxTvaService;
@GetMapping("/get/{id}")
    public TauxTvaEntity getTauxTvaById(@PathVariable Byte id) {
        return iTauxTvaService.getTauxTvaById(id);
    }
@GetMapping("/all")
    public List<TauxTvaEntity> getTauxTvas() {
        return iTauxTvaService.getTauxTvas();
    }
}
