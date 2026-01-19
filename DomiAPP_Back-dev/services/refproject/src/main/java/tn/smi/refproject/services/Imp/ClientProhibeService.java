package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.ClientProhibeEntity;
import tn.smi.refproject.entities.ClientProhibeEntityPK;
import tn.smi.refproject.repository.ClientProhibeRepository;
import tn.smi.refproject.services.Interface.IClientProhibeService;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientProhibeService implements IClientProhibeService {
    private ClientProhibeRepository clientProhibeRepository;
    @Override
    public ClientProhibeEntity getClientProhibeById(ClientProhibeEntityPK id) {
        return clientProhibeRepository.findById(id).orElse(null);
    }

    @Override
    public List<ClientProhibeEntity> getClientProhibes() {
        return clientProhibeRepository.findAll();
    }
}
