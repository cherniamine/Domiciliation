package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.UniteEntity;
import tn.smi.refproject.services.Interface.IUniteService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/Unite")
public class UniteController {
    private IUniteService iUniteService;
@GetMapping("/get/{id}")
    public UniteEntity getUniteById(@PathVariable Byte id) {
        return iUniteService.getUniteById(id);
    }
@GetMapping("/all")
    public List<UniteEntity> getUnites() {
        return iUniteService.getUnites();
    }
    @GetMapping("/allcodeunite")

    public List<Long> findAllCodeUnite() {
        return iUniteService.findAllCodeUnite();
    }
}
