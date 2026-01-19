package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.AgenceEtrangereEntity;

import java.util.List;

public interface IAgenceEtrangereService {
    AgenceEtrangereEntity getAgenceEtrangereById(Long id);
    List<AgenceEtrangereEntity>getAgenceEtrangeres();
}
