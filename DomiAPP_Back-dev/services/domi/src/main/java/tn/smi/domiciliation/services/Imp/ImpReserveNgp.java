package tn.smi.domiciliation.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.domiciliation.entities.ReserveNgpEntity;
import tn.smi.domiciliation.entities.ReserveNgpEntityPK;
import tn.smi.domiciliation.repositories.ReserveNgpRepository;
import tn.smi.domiciliation.services.Interface.IReserveNgp;

import java.util.List;

@Service
@AllArgsConstructor
public class ImpReserveNgp implements IReserveNgp {
    private ReserveNgpRepository reserveNgpRepository;
    @Override
    public ReserveNgpEntity createRNGP(ReserveNgpEntity reserveNgp) {
        return reserveNgpRepository.save(reserveNgp);
    }

    @Override
    public ReserveNgpEntity updateRNGP(ReserveNgpEntity reserveNgp, ReserveNgpEntityPK reserveNgpEntityPK) {
        ReserveNgpEntity existingReserveNgp = reserveNgpRepository.findById(reserveNgpEntityPK).orElse(null);

        existingReserveNgp.setDateInsertion(reserveNgp.getDateInsertion());

        return reserveNgpRepository.save(existingReserveNgp);

    }

    @Override
    public void deleteRNGP(ReserveNgpEntityPK reserveNgpEntityPK) {
        reserveNgpRepository.deleteById(reserveNgpEntityPK);
    }

    @Override
    public ReserveNgpEntity getByIdRNGP(ReserveNgpEntityPK reserveNgpEntityPK) {
        return reserveNgpRepository.findById(reserveNgpEntityPK).orElse(null);
    }

    @Override
    public List<ReserveNgpEntity> getAllRNGP() {
        return reserveNgpRepository.findAll();
    }
}
