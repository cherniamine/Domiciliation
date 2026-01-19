package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.ReservesEntity;
import tn.smi.refproject.repository.ReservesRepository;
import tn.smi.refproject.services.Interface.IReservesService;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservesService implements IReservesService {
    private ReservesRepository reservesRepository;
    @Override
    public ReservesEntity getReservesById(Byte id) {
        return reservesRepository.findById(id).orElse(null);
    }

    @Override
    public List<ReservesEntity> getReservess() {
        return reservesRepository.findAll();
    }
}
