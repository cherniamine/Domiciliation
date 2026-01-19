package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.RestrictionImpNgpEntity;
import tn.smi.refproject.entities.RestrictionImpNgpEntityPK;
import tn.smi.refproject.services.Interface.IRestrictionImpNgpService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/RestrictionImpNgp")
public class RestrictionImpNgpController {
    private IRestrictionImpNgpService iRestrictionImpNgpService;
@GetMapping("/get/{codeNgp}/{codeEnDouane}")
    public RestrictionImpNgpEntity getRestrictionImpNgpByid(@PathVariable long codeNgp,@PathVariable String codeEnDouane) {
        RestrictionImpNgpEntityPK id=new RestrictionImpNgpEntityPK(codeNgp,codeEnDouane);
        return iRestrictionImpNgpService.getRestrictionImpNgpByid(id);
    }
@GetMapping("/all")
    public List<RestrictionImpNgpEntity> getRestrictionImpNgps() {
        return iRestrictionImpNgpService.getRestrictionImpNgps();
    }
}
