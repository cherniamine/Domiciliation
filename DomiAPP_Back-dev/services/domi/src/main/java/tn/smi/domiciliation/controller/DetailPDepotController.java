package tn.smi.domiciliation.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.smi.domiciliation.entities.DetailPDepotEntity;
import tn.smi.domiciliation.entities.DetailPDepotEntityPK;
import tn.smi.domiciliation.services.Interface.IDetailPDepot;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/domi/DetailPDepot")
public class DetailPDepotController {
    private IDetailPDepot iDetailPDepot;
@PostMapping("/create")
    public DetailPDepotEntity createDPD(@RequestBody DetailPDepotEntity detailPDepot) {
        return iDetailPDepot.createDPD(detailPDepot);
    }
@PutMapping("/update/{detailPDepotEntityPK}")
    public DetailPDepotEntity updateDPD(@RequestBody DetailPDepotEntity detailPDepot, @PathVariable DetailPDepotEntityPK detailPDepotEntityPK) {
        return iDetailPDepot.updateDPD(detailPDepot, detailPDepotEntityPK);
    }
@DeleteMapping("/delete/{detailPDepotEntityPK}")
    public void deleteDPD(@PathVariable DetailPDepotEntityPK detailPDepotEntityPK) {
        iDetailPDepot.deleteDPD(detailPDepotEntityPK);
    }
@GetMapping("/get/{detailPDepotEntityPK}")
    public DetailPDepotEntity getByIdDPD(@PathVariable DetailPDepotEntityPK detailPDepotEntityPK) {
        return iDetailPDepot.getByIdDPD(detailPDepotEntityPK);
    }
@GetMapping("/all")
    public List<DetailPDepotEntity> getAllDPD() {
        return iDetailPDepot.getAllDPD();
    }
}
