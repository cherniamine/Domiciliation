package tn.smi.domiciliation.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.smi.domiciliation.entities.RestrictionImpNgpEntity;
import tn.smi.domiciliation.entities.RestrictionImpNgpEntityPK;
import tn.smi.domiciliation.services.Interface.IRestrictionImpNgp;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/domi/RestrictionImpNgp")
public class RestrictionImpNgpController {
    private IRestrictionImpNgp iRestrictionImpNgp;
@PostMapping("/create")
    public RestrictionImpNgpEntity createRINGP(@RequestBody RestrictionImpNgpEntity restrictionImpNgp) {
        return iRestrictionImpNgp.createRINGP(restrictionImpNgp);
    }
@PutMapping("/update/{restrictionImpNgpEntityPK}")
    public RestrictionImpNgpEntity updateRINGP(@RequestBody RestrictionImpNgpEntity restrictionImpNgp,@PathVariable RestrictionImpNgpEntityPK restrictionImpNgpEntityPK) {
        return iRestrictionImpNgp.updateRINGP(restrictionImpNgp, restrictionImpNgpEntityPK);
    }
@DeleteMapping("/delete/{restrictionImpNgpEntityPK}")
    public void deleteRINGP( @PathVariable RestrictionImpNgpEntityPK restrictionImpNgpEntityPK) {
        iRestrictionImpNgp.deleteRINGP(restrictionImpNgpEntityPK);
    }
@GetMapping("/get/{restrictionImpNgpEntityPK}")
    public RestrictionImpNgpEntity getByIdRINGP(@PathVariable RestrictionImpNgpEntityPK restrictionImpNgpEntityPK) {
        return iRestrictionImpNgp.getByIdRINGP(restrictionImpNgpEntityPK);
    }
@GetMapping("/all")
    public List<RestrictionImpNgpEntity> getAllRINGP() {
        return iRestrictionImpNgp.getAllRINGP();
    }
}
