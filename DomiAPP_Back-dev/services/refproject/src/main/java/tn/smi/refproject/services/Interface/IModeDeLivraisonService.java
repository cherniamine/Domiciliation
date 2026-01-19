package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.ModeDeLivraisonEntity;

import java.util.List;

public interface IModeDeLivraisonService {
    ModeDeLivraisonEntity getModeDeLivraisonById(Byte id);
    List<ModeDeLivraisonEntity>getModeDeLivraisons();
    List<Long> getAllModLiv();

}
