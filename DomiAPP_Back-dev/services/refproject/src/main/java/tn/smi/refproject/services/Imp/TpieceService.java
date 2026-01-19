package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.TPieceEntity;
import tn.smi.refproject.repository.TPieceRepository;
import tn.smi.refproject.services.Interface.ITpieceService;

import java.util.List;

@Service
@AllArgsConstructor
public class TpieceService implements ITpieceService {
    private TPieceRepository tPieceRepository;
    @Override
    public TPieceEntity getTpieceById(int id) {
        return tPieceRepository.findById(id).orElse(null);
    }

    @Override
    public List<TPieceEntity> getTpieces() {
        return tPieceRepository.findAll();
    }
}
