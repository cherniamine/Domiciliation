package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.BanqueEntity;
import tn.smi.refproject.services.Interface.IBanqueService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/Banque")
public class BanqueController {
    private IBanqueService iBanqueService;
@GetMapping("/get/{id}")
    public BanqueEntity getBanqueById(@PathVariable Byte id) {
        return iBanqueService.getBanqueById(id);
    }
@GetMapping("/all")
    public List<BanqueEntity> getBanques() {
        return iBanqueService.getBanques();
    }
}
