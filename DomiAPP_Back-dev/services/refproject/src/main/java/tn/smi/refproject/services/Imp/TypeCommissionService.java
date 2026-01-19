package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.TypeCommissionEntity;
import tn.smi.refproject.repository.TypeCommissionRepository;
import tn.smi.refproject.services.Interface.ITypeCommissionService;

import java.util.List;

@Service
@AllArgsConstructor
public class TypeCommissionService implements ITypeCommissionService {
    private TypeCommissionRepository typeCommissionRepository;
    @Override
    public TypeCommissionEntity getTypeCommissionById(Byte id) {
        return typeCommissionRepository.findById(id).orElse(null);
    }

    @Override
    public List<TypeCommissionEntity> getTypeCommissions() {
        return typeCommissionRepository.findAll();
    }
}
