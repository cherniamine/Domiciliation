package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.CompteIntEntity;
import tn.smi.refproject.repository.CompteIntRepository;
import tn.smi.refproject.services.Interface.ICompteIntService;

import java.util.List;

@Service
@AllArgsConstructor
public class CompteIntService implements ICompteIntService {
    private CompteIntRepository compteIntRepository;
    @Override
    public CompteIntEntity getCompteIntById(Long id) {
        return compteIntRepository.findById(id).orElse(null);
    }

    @Override
    public List<CompteIntEntity> getComptInts() {
        return compteIntRepository.findAll();
    }
}
