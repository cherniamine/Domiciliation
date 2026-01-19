package tn.smi.domiciliation.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.smi.domiciliation.entities.ImageDepotDomiciliationEntity;
import tn.smi.domiciliation.services.Interface.IImageDepotDomiciliation;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/domi/ImageDepotDomiciliation")
public class ImageDepotDomiciliationController {
    private IImageDepotDomiciliation iImageDepotDomiciliation;
@PostMapping("/create")
    public ImageDepotDomiciliationEntity create(@RequestBody ImageDepotDomiciliationEntity imageDepotDomiciliation) {
        return iImageDepotDomiciliation.createIMDD(imageDepotDomiciliation);
    }
@PutMapping("/update/{id}")
    public ImageDepotDomiciliationEntity update(@RequestBody ImageDepotDomiciliationEntity imageDepotDomiciliation,@PathVariable int id) {
        return iImageDepotDomiciliation.updateIMDD(imageDepotDomiciliation, id);
    }

    public void delete(int id) {
        iImageDepotDomiciliation.deleteIMDD(id);
    }

    public ImageDepotDomiciliationEntity getById(int id) {
        return iImageDepotDomiciliation.getByIdIMDD(id);
    }

    public List<ImageDepotDomiciliationEntity> getAll() {
        return iImageDepotDomiciliation.getAllIMDD();
    }
}
