package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.PieceEntity;
import tn.smi.refproject.repository.PieceRepository;
import tn.smi.refproject.services.Interface.IPieceService;

import java.util.List;

@Service
@AllArgsConstructor
public class PieceService implements IPieceService {
    private PieceRepository pieceRepository;
    @Override
    public PieceEntity getPieceById(Byte id) {
        return pieceRepository.findById(id).orElse(null);
    }

    @Override
    public List<PieceEntity> getPieces() {
        return pieceRepository.findAll();
    }
}
