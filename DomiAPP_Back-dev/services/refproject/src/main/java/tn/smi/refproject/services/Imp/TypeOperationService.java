package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.TypeOperationEntity;
import tn.smi.refproject.entities.TypeOperationEntityPK;
import tn.smi.refproject.repository.TypeOperationRepository;
import tn.smi.refproject.services.Interface.ITypeOperationService;

import java.util.List;

@Service
@AllArgsConstructor
public class TypeOperationService implements ITypeOperationService {
    private TypeOperationRepository typeOperationRepository;
    @Override
    public TypeOperationEntity getTypeOperationById(TypeOperationEntityPK id) {
        return typeOperationRepository.findById(id).orElse(null);
    }

    @Override
    public List<TypeOperationEntity> getTypeOperations() {
        return typeOperationRepository.findAll();
    }
}
