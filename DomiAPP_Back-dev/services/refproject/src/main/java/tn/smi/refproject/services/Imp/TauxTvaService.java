package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.TauxTvaEntity;
import tn.smi.refproject.repository.TauxTvaRepository;
import tn.smi.refproject.services.Interface.ITauxTvaService;

import java.util.List;

@Service
@AllArgsConstructor
public class TauxTvaService implements ITauxTvaService {
    private TauxTvaRepository tauxTvaRepository;
    @Override
    public TauxTvaEntity getTauxTvaById(Byte id) {
        return tauxTvaRepository.findById(id).orElse(null);
    }

    @Override
    public List<TauxTvaEntity> getTauxTvas() {
        return tauxTvaRepository.findAll();
    }
}
