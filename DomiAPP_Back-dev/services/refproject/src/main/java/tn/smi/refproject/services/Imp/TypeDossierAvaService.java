package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.TypeDossierAvaEntity;
import tn.smi.refproject.repository.TypeDossierAvaRepository;
import tn.smi.refproject.services.Interface.ITypeDossierAvaService;

import java.util.List;

@Service
@AllArgsConstructor
public class TypeDossierAvaService implements ITypeDossierAvaService {
    private TypeDossierAvaRepository typeDossierAvaRepository;
    @Override
    public TypeDossierAvaEntity getTypeDossierAvaById(Long id) {
        return typeDossierAvaRepository.findById(id).orElse(null);
    }

    @Override
    public List<TypeDossierAvaEntity> getTypeDossierAvas() {
        return typeDossierAvaRepository.findAll();
    }
}
