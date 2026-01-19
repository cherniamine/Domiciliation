package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.ReservesEntity;
import tn.smi.refproject.services.Interface.IReservesService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/Reserves")
public class ReservesController {
    private IReservesService iReservesService;
@GetMapping("/get/{id}")
    public ReservesEntity getReservesById(@PathVariable Byte id) {
        return iReservesService.getReservesById(id);
    }
@GetMapping("/all")
    public List<ReservesEntity> getReservess() {
        return iReservesService.getReservess();
    }
}
