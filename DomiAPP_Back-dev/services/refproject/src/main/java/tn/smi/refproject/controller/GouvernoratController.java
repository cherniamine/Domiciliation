package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.GouvernoratEntity;
import tn.smi.refproject.services.Interface.IGouvernoratService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/Gouvernorat")
public class GouvernoratController {
    private IGouvernoratService iGouvernoratService;
@GetMapping("/get/{id}")
    public GouvernoratEntity getGouvernorat(@PathVariable Byte id) {
        return iGouvernoratService.getGouvernorat(id);
    }
@GetMapping("/all")
    public List<GouvernoratEntity> getGouvernorats() {
        return iGouvernoratService.getGouvernorats();
    }
}
