package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.DonneeNgpEntity;
import tn.smi.refproject.repository.DonneeNgpRepository;
import tn.smi.refproject.services.Interface.IDonneeNgpService;

import java.util.List;

@Service
@AllArgsConstructor
public class DonneeNgpService implements IDonneeNgpService {
    private DonneeNgpRepository donneeNgpRepository;
    @Override
    public DonneeNgpEntity getDonneeNgpById(Long id) {
        return donneeNgpRepository.findById(id).orElse(null);
    }

    @Override
    public List<DonneeNgpEntity> getDonneeNgps() {
        return donneeNgpRepository.findAll();
    }

    @Override
    public List<Long> findAllCodeNgp() {
        return donneeNgpRepository.findAllCodeNgp();
    }
}
