package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.TypeMvtAvaEntity;
import tn.smi.refproject.repository.TypeMvtAvaRepository;
import tn.smi.refproject.services.Interface.ITypeMvtAvaService;

import java.util.List;

@Service
@AllArgsConstructor
public class TypeMvtAvaService implements ITypeMvtAvaService {
    private TypeMvtAvaRepository typeMvtAvaRepository;
    @Override
    public TypeMvtAvaEntity getTypeMvtAvaById(String id) {
        return typeMvtAvaRepository.findById(id).orElse(null);
    }

    @Override
    public List<TypeMvtAvaEntity> getTypeMvtAvas() {
        return typeMvtAvaRepository.findAll();
    }
}
