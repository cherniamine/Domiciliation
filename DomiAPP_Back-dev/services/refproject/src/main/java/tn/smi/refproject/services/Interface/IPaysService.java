package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.PaysEntity;

import java.util.List;

public interface IPaysService {
    PaysEntity getPaysById(Byte id);
    List<PaysEntity>getPayss();
    List<Long>getAllCodePays();
}
