package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.DateValeurParOperationEntity;
import tn.smi.refproject.repository.DateValeurParOperationRepository;
import tn.smi.refproject.services.Interface.IDateValeurParOperationService;

import java.util.List;

@Service
@AllArgsConstructor
public class DateValeurParOperationService implements IDateValeurParOperationService {
    private DateValeurParOperationRepository dateValeurParOperationRepository;
    @Override
    public DateValeurParOperationEntity getDateValeurParOperationById(Long id) {
        return dateValeurParOperationRepository.findById(id).orElse(null);
    }

    @Override
    public List<DateValeurParOperationEntity> getDateValeurParOperations() {
        return dateValeurParOperationRepository.findAll();
    }
}
