package tn.smi.domiciliation.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.domiciliation.entities.ReservesEntity;
import tn.smi.domiciliation.repositories.ReserveRepository;
import tn.smi.domiciliation.services.Interface.IReserves;

import java.util.List;

@Service
@AllArgsConstructor
public class ImpReserves implements IReserves {
    private ReserveRepository reserveRepository;
    @Override
    public ReservesEntity createR(ReservesEntity reservesEntity) {
        return reserveRepository.save(reservesEntity);
    }

    @Override
    public ReservesEntity updateR(ReservesEntity reservesEntity, Byte id) {
        ReservesEntity existingReserves = reserveRepository.findById(id).orElse(null);

        existingReserves.setLibReserve(reservesEntity.getLibReserve());

        return reserveRepository.save(existingReserves);
    }

    @Override
    public void deleteR(Byte id) {
        reserveRepository.deleteById(id);
    }

    @Override
    public ReservesEntity getByIdR(Byte id) {
        return reserveRepository.findById(id).orElse(null);
    }

    @Override
    public List<ReservesEntity> getAllR() {
        return reserveRepository.findAll();
    }
}
