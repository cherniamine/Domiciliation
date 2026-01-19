package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.AccordBctMvtEntity;
import tn.smi.refproject.entities.AccordBctMvtEntityPK;
import tn.smi.refproject.repository.AccordBctMvtRepository;
import tn.smi.refproject.services.Interface.IAccordBctMvtService;

import java.util.List;

@Service
@AllArgsConstructor
public class AccordBctMvtService implements IAccordBctMvtService {
    private AccordBctMvtRepository accordBctMvtRepository;
    @Override
    public AccordBctMvtEntity getAccordBctMvtById(AccordBctMvtEntityPK id) {
        return accordBctMvtRepository.findById(id).orElse(null);
    }

    @Override
    public List<AccordBctMvtEntity> getAccordBctMvts() {
        return accordBctMvtRepository.findAll();
    }
}
