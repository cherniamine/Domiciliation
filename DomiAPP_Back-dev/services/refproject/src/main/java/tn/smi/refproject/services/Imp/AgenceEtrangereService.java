package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.AgenceEtrangereEntity;
import tn.smi.refproject.repository.AgenceEtrangereRepository;
import tn.smi.refproject.services.Interface.IAgenceEtrangereService;

import java.util.List;
@Service
@AllArgsConstructor
public class AgenceEtrangereService implements IAgenceEtrangereService {
    private AgenceEtrangereRepository agenceEtrangereRepository;
    @Override
    public AgenceEtrangereEntity getAgenceEtrangereById(Long id) {
        return agenceEtrangereRepository.findById(id).orElse(null);
    }

    @Override
    public List<AgenceEtrangereEntity> getAgenceEtrangeres() {
        return agenceEtrangereRepository.findAll();
    }
}
