package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.ClientProhibeEntity;
import tn.smi.refproject.entities.ClientProhibeEntityPK;

import java.util.List;

public interface IClientProhibeService {
    ClientProhibeEntity getClientProhibeById(ClientProhibeEntityPK id);
    List<ClientProhibeEntity> getClientProhibes();

}
