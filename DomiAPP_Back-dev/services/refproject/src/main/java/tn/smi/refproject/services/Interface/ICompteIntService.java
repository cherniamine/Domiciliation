package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.CompteIntEntity;

import java.util.List;

public interface ICompteIntService {
    CompteIntEntity getCompteIntById(Long id);
    List<CompteIntEntity> getComptInts();
}
