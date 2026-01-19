package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.TPieceEntity;
import tn.smi.refproject.services.Interface.ITpieceService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/TPiece")
public class TPieceController {
    private ITpieceService iTpieceService;
@GetMapping("/get/{id}")
    public TPieceEntity getTpieceById(@PathVariable int id) {
        return iTpieceService.getTpieceById(id);
    }
@GetMapping("/all")
    public List<TPieceEntity> getTpieces() {
        return iTpieceService.getTpieces();
    }
}
