package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.CompteEntity;
import tn.smi.refproject.entities.CompteEntityPK;

import java.util.List;

public interface ICompteService {
    CompteEntity getCompteById(CompteEntityPK id);
    List<CompteEntity> getComptes();
    List<String> getAllNoPiecesClients();
    List<String> getAllRibsForClient(String noPieceClient);
}
