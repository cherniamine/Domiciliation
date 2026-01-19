package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.OperationMailEntity;
import tn.smi.refproject.entities.OperationMailEntityPK;
import tn.smi.refproject.repository.OperationMailRepository;
import tn.smi.refproject.services.Interface.IOperationMailService;

import java.util.List;

@Service
@AllArgsConstructor
public class OperationMailService implements IOperationMailService {
    private OperationMailRepository operationMailRepository;
    @Override
    public OperationMailEntity getOperationMailById(OperationMailEntityPK id) {
        return operationMailRepository.findById(id).orElse(null);
    }

    @Override
    public List<OperationMailEntity> getOperationMails() {
        return operationMailRepository.findAll();
    }
}
