package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.TPieceEntity;

import java.util.List;

public interface ITpieceService {
    TPieceEntity getTpieceById(int id);
    List<TPieceEntity>getTpieces();
}
