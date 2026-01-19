package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.DechargeDocumentsEntity;
import tn.smi.refproject.services.Interface.IDechargeDocumentsService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/DechargeDocument")
public class DechargeDocumentController {
    private IDechargeDocumentsService iDechargeDocumentsService;

    public DechargeDocumentsEntity getDechargeDocumentsById(Short id) {
        return iDechargeDocumentsService.getDechargeDocumentsById(id);
    }

    public List<DechargeDocumentsEntity> getDechargeDocumentss() {
        return iDechargeDocumentsService.getDechargeDocumentss();
    }
}
