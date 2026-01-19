package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.CompteInt2Entity;
import tn.smi.refproject.repository.CompteInt2Repository;
import tn.smi.refproject.services.Interface.ICompteInt2Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CompteInt2Service implements ICompteInt2Service {
    private CompteInt2Repository compteInt2Repository;
    @Override
    public CompteInt2Entity getCompteInt2ById(Long id) {
        return compteInt2Repository.findById(id).orElse(null);
    }

    @Override
    public List<CompteInt2Entity> getCompteInt2s() {
        return compteInt2Repository.findAll();
    }
}
