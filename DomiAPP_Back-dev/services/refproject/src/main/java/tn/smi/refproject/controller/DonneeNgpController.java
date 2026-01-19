package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.DonneeNgpEntity;
import tn.smi.refproject.services.Interface.IDonneeNgpService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/DonneeNgp")
public class DonneeNgpController {
    private IDonneeNgpService iDonneeNgpService;
@GetMapping("/get/{id}")
    public DonneeNgpEntity getDonneeNgpById(@PathVariable Long id) {
        return iDonneeNgpService.getDonneeNgpById(id);
    }
@GetMapping("/all")
    public List<DonneeNgpEntity> getDonneeNgps() {
        return iDonneeNgpService.getDonneeNgps();
    }
    @GetMapping("/allcodengp")

    public List<Long> findAllCodeNgp() {
        return iDonneeNgpService.findAllCodeNgp();
    }
}
