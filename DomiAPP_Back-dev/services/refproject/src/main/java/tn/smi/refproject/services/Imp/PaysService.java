package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.PaysEntity;
import tn.smi.refproject.repository.PaysRepository;
import tn.smi.refproject.services.Interface.IPaysService;

import java.util.List;

@Service
@AllArgsConstructor
public class PaysService implements IPaysService {
    private PaysRepository paysRepository;
    @Override
    public PaysEntity getPaysById(Byte id) {
        return paysRepository.findById(id).orElse(null);
    }

    @Override
    public List<PaysEntity> getPayss() {
        return paysRepository.findAll();
    }

    @Override
    public List<Long> getAllCodePays() {
        return paysRepository.findAllCodePays();
    }
}
