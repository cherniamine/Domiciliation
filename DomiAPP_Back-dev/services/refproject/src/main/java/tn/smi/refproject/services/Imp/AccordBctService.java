package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.AccordBctEntity;
import tn.smi.refproject.entities.AccordBctEntityPK;
import tn.smi.refproject.entities.enumeration.TypeAccordBct;
import tn.smi.refproject.repository.AccordBctRepository;
import tn.smi.refproject.services.Interface.IAccordBctService;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
public class AccordBctService implements IAccordBctService {

    private final AccordBctRepository accordBctRepository;

    public AccordBctEntity findById(TypeAccordBct typeAccordBct, Long numAccordBct, LocalDate dateAccordBct) {
        AccordBctEntityPK key = new AccordBctEntityPK(typeAccordBct, numAccordBct, dateAccordBct);
        return accordBctRepository.findById(key).orElse(null);
    }
    @Override
    public AccordBctEntity getAccordBctById(AccordBctEntityPK id) {
        return accordBctRepository.findById(id).orElse(null);
    }

    @Override
    public List<Long> getNumAccordBct(TypeAccordBct typeAccordBct) {
        return accordBctRepository.findNumAccordBctByTypeAccordBct(typeAccordBct);  // Utilisation du paramètre typeAccordBct
    }

    @Override
    public List<AccordBctEntity> getAccords() {
        return accordBctRepository.findAll();  // Cette méthode récupère tous les accords sans filtre
    }

    @Override
    public List<LocalDate> getDateAccordBct(TypeAccordBct typeAccordBct) {
        return accordBctRepository.findDateAccordBctByTypeAccordBct(typeAccordBct);
    }

    @Override
    public AccordBctEntity createAccordBctForClient(AccordBctEntity accordBctEntity) {
        return accordBctRepository.save(accordBctEntity);
    }
    @Override
    public List<AccordBctEntity> getAccordsByNoPieceClient(String noPieceClient) {
        return accordBctRepository.findByNoPieceClient(noPieceClient);
    }


}