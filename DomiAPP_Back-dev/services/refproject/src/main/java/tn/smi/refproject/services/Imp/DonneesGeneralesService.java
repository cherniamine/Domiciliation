package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.DonneesGeneralesEntity;
import tn.smi.refproject.repository.DonneesGeneralesRepository;
import tn.smi.refproject.services.Interface.IDonneesGeneralesService;

import java.util.List;

@Service
@AllArgsConstructor
public class DonneesGeneralesService implements IDonneesGeneralesService {
    private DonneesGeneralesRepository donneesGeneralesRepository;
    @Override
    public DonneesGeneralesEntity getDonneesGeneralesByid(Byte id) {
        return donneesGeneralesRepository.findById(id).orElse(null);
    }

    @Override
    public List<DonneesGeneralesEntity> getDonneesGeneraless() {
        return donneesGeneralesRepository.findAll();
    }
}
