package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.PaysEntity;
import tn.smi.refproject.services.Interface.IPaysService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/Pays")
public class PaysController {
    private IPaysService iPaysService;
@GetMapping("/get/{id}")
    public PaysEntity getPaysById(@PathVariable Byte id) {
        return iPaysService.getPaysById(id);
    }
@GetMapping("/all")
    public List<PaysEntity> getPayss() {
        return iPaysService.getPayss();
    }
    @GetMapping("/allcodepays")
    public List<Long> getAllCodePays() {
        return iPaysService.getAllCodePays();
    }
}
