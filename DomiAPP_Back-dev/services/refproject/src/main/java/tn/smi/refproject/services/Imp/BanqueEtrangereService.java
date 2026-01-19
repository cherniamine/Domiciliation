package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.BanqueEtrangereEntity;
import tn.smi.refproject.repository.BanqueEtrangereRepository;
import tn.smi.refproject.services.Interface.IBanqueEtrangereService;

import java.util.List;

@Service
@AllArgsConstructor
public class BanqueEtrangereService implements IBanqueEtrangereService {
    private BanqueEtrangereRepository banqueEtrangereRepository;
    @Override
    public BanqueEtrangereEntity getBanqueEtrangereById(Long id) {
        return banqueEtrangereRepository.findById(id).orElse(null);
    }

    @Override
    public List<BanqueEtrangereEntity> getBanqueEtrangeres() {
        return banqueEtrangereRepository.findAll();
    }
}
