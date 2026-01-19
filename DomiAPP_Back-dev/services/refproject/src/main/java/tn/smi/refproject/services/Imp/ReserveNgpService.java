package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.ReserveNgpEntity;
import tn.smi.refproject.entities.ReserveNgpEntityPK;
import tn.smi.refproject.repository.ReserveNgpRepository;
import tn.smi.refproject.services.Interface.IReserveNgpService;

import java.util.List;

@Service
@AllArgsConstructor
public class ReserveNgpService implements IReserveNgpService {
    private ReserveNgpRepository reserveNgpRepository;
    @Override
    public ReserveNgpEntity getReserveNgpById(ReserveNgpEntityPK id) {
        return reserveNgpRepository.findById(id).orElse(null);
    }

    @Override
    public List<ReserveNgpEntity> getReserveNgps() {
        return reserveNgpRepository.findAll();
    }
}
