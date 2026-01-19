package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.PaysNgpEntity;
import tn.smi.refproject.entities.PaysNgpEntityPK;
import tn.smi.refproject.services.Interface.IPaysNgpService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/PaysNgp")
public class PaysNgpController {
    private IPaysNgpService iPaysNgpService;
@GetMapping("/get/{codeNgp}/{codePays}")
    public PaysNgpEntity getPaysNgpById(@PathVariable long codeNgp,@PathVariable byte codePays) {
        PaysNgpEntityPK id=new PaysNgpEntityPK(codeNgp,codePays);
        return iPaysNgpService.getPaysNgpById(id);
    }
@GetMapping("/all")
    public List<PaysNgpEntity> getPaysNgps() {
        return iPaysNgpService.getPaysNgps();
    }
}
