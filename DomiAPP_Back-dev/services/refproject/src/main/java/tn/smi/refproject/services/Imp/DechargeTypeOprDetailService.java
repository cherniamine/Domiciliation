package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.DechargeTypeOprDetailEntity;
import tn.smi.refproject.repository.DechargeTypeOprDetailRepository;
import tn.smi.refproject.services.Interface.IDechargeTypeOprDetailService;

import java.util.List;

@Service
@AllArgsConstructor
public class DechargeTypeOprDetailService implements IDechargeTypeOprDetailService {
    private DechargeTypeOprDetailRepository dechargeTypeOprDetailRepository;
    @Override
    public DechargeTypeOprDetailEntity getDechargeTypeOprDetail(Long id) {
        return dechargeTypeOprDetailRepository.findById(id).orElse(null);
    }

    @Override
    public List<DechargeTypeOprDetailEntity> getDechargeTypeOprDetails() {
        return dechargeTypeOprDetailRepository.findAll();
    }
}
