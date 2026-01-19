package tn.smi.domiciliation.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.smi.domiciliation.entities.ReservesEntity;
import tn.smi.domiciliation.services.Interface.IReserves;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/domi/Reserves")
public class ReservesController {
    private IReserves iReserves;
@PostMapping("/create")
    public ReservesEntity createR(@RequestBody ReservesEntity reservesEntity) {
        return iReserves.createR(reservesEntity);
    }
@PutMapping("/update/{id}")
    public ReservesEntity updateR(@RequestBody ReservesEntity reservesEntity,@PathVariable Byte id) {
        return iReserves.updateR(reservesEntity, id);
    }
@DeleteMapping("/delete/{id}")
    public void deleteR(@PathVariable Byte id) {
        iReserves.deleteR(id);
    }
@GetMapping("/get/{id}")
    public ReservesEntity getByIdR(@PathVariable Byte id) {
        return iReserves.getByIdR(id);
    }
@GetMapping("/all")
    public List<ReservesEntity> getAllR() {
        return iReserves.getAllR();
    }
}
