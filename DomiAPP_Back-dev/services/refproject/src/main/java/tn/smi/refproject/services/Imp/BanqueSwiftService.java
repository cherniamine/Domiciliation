package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.BanqueSwiftServiceEntity;
import tn.smi.refproject.entities.BanqueSwiftServiceEntityPK;
import tn.smi.refproject.repository.BanqueSwiftServiceRepository;
import tn.smi.refproject.services.Interface.IBanqueSwiftService;

import java.util.List;

@Service
@AllArgsConstructor
public class BanqueSwiftService implements IBanqueSwiftService {
    private BanqueSwiftServiceRepository banqueSwiftServiceRepository;
    @Override
    public BanqueSwiftServiceEntity getBanqueSwiftServiceById(BanqueSwiftServiceEntityPK id) {
        return banqueSwiftServiceRepository.findById(id).orElse(null);
    }

    @Override
    public List<BanqueSwiftServiceEntity> getBanqueSwiftServices() {
        return banqueSwiftServiceRepository.findAll();
    }
}
