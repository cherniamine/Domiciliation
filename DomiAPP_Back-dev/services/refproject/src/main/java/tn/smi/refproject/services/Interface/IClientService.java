package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.ClientEntity;
import tn.smi.refproject.entities.ClientEntityPK;

import java.util.List;

public interface IClientService {
    ClientEntity getClientById(ClientEntityPK id);
    List<ClientEntity>getClients();

    boolean isTotalementExportatrice(String noPieceClient);
}
