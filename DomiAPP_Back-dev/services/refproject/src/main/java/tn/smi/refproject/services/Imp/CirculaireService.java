package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.CirculaireEntity;
import tn.smi.refproject.entities.CirculaireEntityPK;
import tn.smi.refproject.repository.CirculaireRepository;
import tn.smi.refproject.services.Interface.ICirculaireService;

import java.util.List;

@Service
@AllArgsConstructor
public class CirculaireService implements ICirculaireService {
    private CirculaireRepository circulaireRepository;
    @Override
    public CirculaireEntity getCirculaireById(CirculaireEntityPK id) {
        return circulaireRepository.findById(id).orElse(null);
    }

    @Override
    public List<CirculaireEntity> getCirculaires() {
        return circulaireRepository.findAll();
    }
}
