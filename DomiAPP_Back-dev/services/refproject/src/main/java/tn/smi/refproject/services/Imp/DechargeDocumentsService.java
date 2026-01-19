package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.DechargeDocumentsEntity;
import tn.smi.refproject.repository.DechargeDocumentRepository;
import tn.smi.refproject.services.Interface.IDechargeDocumentsService;

import java.util.List;

@Service
@AllArgsConstructor
public class DechargeDocumentsService implements IDechargeDocumentsService {
    private DechargeDocumentRepository dechargeDocumentRepository;
    @Override
    public DechargeDocumentsEntity getDechargeDocumentsById(Short id) {
        return dechargeDocumentRepository.findById(id).orElse(null);
    }

    @Override
    public List<DechargeDocumentsEntity> getDechargeDocumentss() {
        return dechargeDocumentRepository.findAll();
    }
}
