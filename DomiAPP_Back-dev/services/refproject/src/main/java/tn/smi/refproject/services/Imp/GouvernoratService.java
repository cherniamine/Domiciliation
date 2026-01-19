package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.GouvernoratEntity;
import tn.smi.refproject.repository.GouvernoratRepository;
import tn.smi.refproject.services.Interface.IGouvernoratService;

import java.util.List;

@Service
@AllArgsConstructor
public class GouvernoratService implements IGouvernoratService {
    private GouvernoratRepository gouvernoratRepository;
    @Override
    public GouvernoratEntity getGouvernorat(Byte id) {
        return gouvernoratRepository.findById(id).orElse(null);
    }

    @Override
    public List<GouvernoratEntity> getGouvernorats() {
        return gouvernoratRepository.findAll();
    }
}
