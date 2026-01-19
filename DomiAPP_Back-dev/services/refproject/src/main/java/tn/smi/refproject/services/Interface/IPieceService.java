package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.PieceEntity;

import java.util.List;

public interface IPieceService {
    PieceEntity getPieceById(Byte id);
    List<PieceEntity>getPieces();
}
