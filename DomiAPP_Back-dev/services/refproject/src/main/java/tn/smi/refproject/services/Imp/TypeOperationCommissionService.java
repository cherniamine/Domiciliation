package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.TypeOperationCommissionEntity;
import tn.smi.refproject.entities.TypeOperationCommissionEntityPK;
import tn.smi.refproject.repository.TypeOperationCommissionRepository;
import tn.smi.refproject.services.Interface.ITypeOperationCommissionService;

import java.util.List;

@Service
@AllArgsConstructor
public class TypeOperationCommissionService implements ITypeOperationCommissionService {
    private TypeOperationCommissionRepository typeOperationCommissionRepository;
    @Override
    public TypeOperationCommissionEntity getTypeOperationCommissionById(TypeOperationCommissionEntityPK id) {
        return typeOperationCommissionRepository.findById(id).orElse(null);
    }

    @Override
    public List<TypeOperationCommissionEntity> getTypeOperationCommissions() {
        return typeOperationCommissionRepository.findAll();
    }
}
