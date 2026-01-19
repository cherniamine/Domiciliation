package tn.smi.refproject.services.Interface;

import org.springframework.data.jpa.repository.Query;
import tn.smi.refproject.DTO.agence;
import tn.smi.refproject.entities.AgenceEntity;
import tn.smi.refproject.entities.AgenceEntityPK;

import java.util.List;

public interface IAgenceService {
    AgenceEntity getAgenceById(AgenceEntityPK id);
    List<AgenceEntity> getAgences();
    List<agence> getAgencesSummary();
}
