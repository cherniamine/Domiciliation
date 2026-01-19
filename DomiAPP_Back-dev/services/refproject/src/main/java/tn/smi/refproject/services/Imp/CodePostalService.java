package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.CodePostalEntity;
import tn.smi.refproject.entities.CodePostalEntityPK;
import tn.smi.refproject.repository.CodePostalRepository;
import tn.smi.refproject.services.Interface.ICodePostalService;

import java.util.List;

@Service
@AllArgsConstructor
public class CodePostalService implements ICodePostalService {
    private CodePostalRepository codePostalRepository;
    @Override
    public CodePostalEntity getCodePostalByid(CodePostalEntityPK id) {
        return codePostalRepository.findById(id).orElse(null);
    }

    @Override
    public List<CodePostalEntity> getCodePostals() {
        return codePostalRepository.findAll();
    }
}
