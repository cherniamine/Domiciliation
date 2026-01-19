package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.BanqueEtrangereEntity;

import java.util.List;

public interface IBanqueEtrangereService {
    BanqueEtrangereEntity getBanqueEtrangereById(Long id);
    List<BanqueEtrangereEntity> getBanqueEtrangeres();
}
