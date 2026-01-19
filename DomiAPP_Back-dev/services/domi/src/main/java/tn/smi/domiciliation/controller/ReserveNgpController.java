package tn.smi.domiciliation.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.smi.domiciliation.entities.ReserveNgpEntity;
import tn.smi.domiciliation.entities.ReserveNgpEntityPK;
import tn.smi.domiciliation.services.Interface.IReserveNgp;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/domi/ReserveNgp")
public class ReserveNgpController {
    private IReserveNgp iReserveNgp;
@PostMapping("/create")
    public ReserveNgpEntity createRNGP(@RequestBody ReserveNgpEntity reserveNgp) {
        return iReserveNgp.createRNGP(reserveNgp);
    }
@PutMapping("/update/{reserveNgpEntityPK}")
    public ReserveNgpEntity updateRNGP(@RequestBody ReserveNgpEntity reserveNgp, @PathVariable ReserveNgpEntityPK reserveNgpEntityPK) {
        return iReserveNgp.updateRNGP(reserveNgp, reserveNgpEntityPK);
    }
@DeleteMapping("/delete/{reserveNgpEntityPK}")
    public void deleteRNGP(@PathVariable ReserveNgpEntityPK reserveNgpEntityPK) {
        iReserveNgp.deleteRNGP(reserveNgpEntityPK);
    }
@GetMapping("/get/{reserveNgpEntityPK}")
    public ReserveNgpEntity getByIdRNGP(@PathVariable ReserveNgpEntityPK reserveNgpEntityPK) {
        return iReserveNgp.getByIdRNGP(reserveNgpEntityPK);
    }
@GetMapping("/all")
    public List<ReserveNgpEntity> getAllRNGP() {
        return iReserveNgp.getAllRNGP();
    }
}
