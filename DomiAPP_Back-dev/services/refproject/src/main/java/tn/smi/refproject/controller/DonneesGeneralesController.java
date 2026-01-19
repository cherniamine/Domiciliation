package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.DonneesGeneralesEntity;
import tn.smi.refproject.services.Interface.IDonneesGeneralesService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/DonneesGenerales")
public class DonneesGeneralesController {
    private IDonneesGeneralesService iDonneesGeneralesService;
@GetMapping("/get/{id}")
    public DonneesGeneralesEntity getDonneesGeneralesByid(@PathVariable Byte id) {
        return iDonneesGeneralesService.getDonneesGeneralesByid(id);
    }
@GetMapping("/all")
    public List<DonneesGeneralesEntity> getDonneesGeneraless() {
        return iDonneesGeneralesService.getDonneesGeneraless();
    }
}
