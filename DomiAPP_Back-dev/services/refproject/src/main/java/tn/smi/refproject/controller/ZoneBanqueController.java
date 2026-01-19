package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.ZoneBanqueEntity;
import tn.smi.refproject.entities.ZoneBanqueEntityPK;
import tn.smi.refproject.services.Interface.IZoneBanqueService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/ZoneBanque")
public class ZoneBanqueController {
    private IZoneBanqueService iZoneBanqueService;
@GetMapping("/get/{codeBanque}/{codeZone}")
    public ZoneBanqueEntity getZoneBanqueById(@PathVariable byte codeBanque,@PathVariable byte codeZone) {
        ZoneBanqueEntityPK id=new ZoneBanqueEntityPK(codeBanque,codeZone);
        return iZoneBanqueService.getZoneBanqueById(id);
    }
@GetMapping("/all")
    public List<ZoneBanqueEntity> getZoneBanques() {
        return iZoneBanqueService.getZoneBanques();
    }
}
