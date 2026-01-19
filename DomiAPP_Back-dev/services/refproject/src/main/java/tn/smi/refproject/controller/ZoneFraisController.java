package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.ZoneFraisEntity;
import tn.smi.refproject.services.Interface.IZoneFraisService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/ZoneFrais")
public class ZoneFraisController {
    private IZoneFraisService iZoneFraisService;
    @GetMapping("/get/{id}")
    public ZoneFraisEntity getZoneFraisById(@PathVariable Byte id) {
        return iZoneFraisService.getZoneFraisById(id);
    }
@GetMapping("/all")
    public List<ZoneFraisEntity> getZoneFraiss() {
        return iZoneFraisService.getZoneFraiss();
    }
}
