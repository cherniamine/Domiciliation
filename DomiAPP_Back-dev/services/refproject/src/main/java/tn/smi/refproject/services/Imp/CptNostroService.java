package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.CptNostroEntity;
import tn.smi.refproject.entities.CptNostroEntityPK;
import tn.smi.refproject.repository.CptNostroRepository;
import tn.smi.refproject.services.Interface.ICptNostroService;

import java.util.List;

@Service
@AllArgsConstructor
public class CptNostroService implements ICptNostroService {
    private CptNostroRepository cptNostroRepository;
    @Override
    public CptNostroEntity getCptNostroById(CptNostroEntityPK id) {
        return cptNostroRepository.findById(id).orElse(null);
    }

    @Override
    public List<CptNostroEntity> getCptNostros() {
        return cptNostroRepository.findAll();
    }
}
