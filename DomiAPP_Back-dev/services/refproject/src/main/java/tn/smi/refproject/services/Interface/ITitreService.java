package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.TitreEntity;

import java.util.List;

public interface ITitreService {
    TitreEntity getTitreById(Byte id);
    List<TitreEntity>getTitres();
}
