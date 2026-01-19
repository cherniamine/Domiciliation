package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.ComClientEntity;
import tn.smi.refproject.entities.ComClientEntityPK;

import java.util.List;

public interface IComClientService {
    ComClientEntity getComClientById(ComClientEntityPK id);
    List<ComClientEntity>getComClients();
}
