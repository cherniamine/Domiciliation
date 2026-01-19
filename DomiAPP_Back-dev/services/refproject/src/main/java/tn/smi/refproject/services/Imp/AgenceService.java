package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.DTO.agence;
import tn.smi.refproject.entities.AgenceEntity;
import tn.smi.refproject.entities.AgenceEntityPK;
import tn.smi.refproject.repository.AgenceRepository;
import tn.smi.refproject.services.Interface.IAgenceService;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AgenceService implements IAgenceService {
    private AgenceRepository agenceRepository;
    @Override
    public AgenceEntity getAgenceById(AgenceEntityPK id) {
        return agenceRepository.findById(id).orElse(null);
    }

    @Override
    public List<AgenceEntity> getAgences() {
        return agenceRepository.findAll();
    }

    @Override
    public List<agence> getAgencesSummary() {
        return agenceRepository.findAgencesSummary();
    }
}
