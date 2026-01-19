package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.TitreEntity;
import tn.smi.refproject.repository.TitreRepository;
import tn.smi.refproject.services.Interface.ITitreService;

import java.util.List;

@Service
@AllArgsConstructor
public class TitreService implements ITitreService {
    private TitreRepository titreRepository;
    @Override
    public TitreEntity getTitreById(Byte id) {
        return titreRepository.findById(id).orElse(null);
    }

    @Override
    public List<TitreEntity> getTitres() {
        return titreRepository.findAll();
    }
}
