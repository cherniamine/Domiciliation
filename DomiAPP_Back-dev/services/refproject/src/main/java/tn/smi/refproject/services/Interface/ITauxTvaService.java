package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.TauxTvaEntity;

import java.util.List;

public interface ITauxTvaService {
    TauxTvaEntity getTauxTvaById(Byte id);
    List<TauxTvaEntity>getTauxTvas();
}
