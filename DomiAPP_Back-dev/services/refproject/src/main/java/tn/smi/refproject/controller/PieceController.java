package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.PieceEntity;
import tn.smi.refproject.services.Interface.IPieceService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/Piece")
public class PieceController {
    private IPieceService iPieceService;
@GetMapping("/get/{id}")
    public PieceEntity getPieceById(@PathVariable Byte id) {
        return iPieceService.getPieceById(id);
    }
@GetMapping("/all")
    public List<PieceEntity> getPieces() {
        return iPieceService.getPieces();
    }
}
