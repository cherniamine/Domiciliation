package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.ComClientEntity;
import tn.smi.refproject.entities.ComClientEntityPK;
import tn.smi.refproject.repository.ComClientRepository;
import tn.smi.refproject.services.Interface.IComClientService;

import java.util.List;

@Service
@AllArgsConstructor
public class ComClientService implements IComClientService {
    private ComClientRepository comClientRepository;
    @Override
    public ComClientEntity getComClientById(ComClientEntityPK id) {
        return comClientRepository.findById(id).orElse(null);
    }

    @Override
    public List<ComClientEntity> getComClients() {
        return comClientRepository.findAll();
    }
}
