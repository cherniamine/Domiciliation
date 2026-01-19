package tn.smi.domiciliation.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.smi.domiciliation.entities.ImageDetailPDepotEntity;
import tn.smi.domiciliation.entities.ImageDetailPDepotEntityPK;
import tn.smi.domiciliation.services.Interface.IImageDetailPDepot;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/domi/ImageDetailPDepot")
public class ImageDetailPDepotController {
    private IImageDetailPDepot iImageDetailPDepot;
    @PostMapping("/create")

    public ImageDetailPDepotEntity create(@RequestBody ImageDetailPDepotEntity imageDetailPDepot) {
        return iImageDetailPDepot.create(imageDetailPDepot);
    }
@PutMapping("/update/{imageDetailPDepotEntityPK}")
    public ImageDetailPDepotEntity update(@RequestBody ImageDetailPDepotEntity imageDetailPDepot,@PathVariable ImageDetailPDepotEntityPK imageDetailPDepotEntityPK) {
        return iImageDetailPDepot.update(imageDetailPDepot, imageDetailPDepotEntityPK);
    }

    public void delete(ImageDetailPDepotEntityPK imageDetailPDepotEntityPK) {
        iImageDetailPDepot.delete(imageDetailPDepotEntityPK);
    }

    public ImageDetailPDepotEntity getById(ImageDetailPDepotEntityPK imageDetailPDepotEntityPK) {
        return iImageDetailPDepot.getById(imageDetailPDepotEntityPK);
    }

    public List<ImageDetailPDepotEntity> getAll() {
        return iImageDetailPDepot.getAll();
    }
}
