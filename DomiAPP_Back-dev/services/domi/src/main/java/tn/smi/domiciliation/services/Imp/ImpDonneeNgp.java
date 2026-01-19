package tn.smi.domiciliation.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.domiciliation.entities.DonneeNgpEntity;
import tn.smi.domiciliation.repositories.DonneeNgpRepository;
import tn.smi.domiciliation.services.Interface.IDonneeNgp;

import java.util.List;
@Service
@AllArgsConstructor
public class ImpDonneeNgp implements IDonneeNgp {
    private DonneeNgpRepository donneeNgpRepository;
    @Override
    public DonneeNgpEntity createDNGP(DonneeNgpEntity donneeNgp) {
        return donneeNgpRepository.save(donneeNgp);
    }

    @Override
    public DonneeNgpEntity updateDNGP(DonneeNgpEntity donneeNgp, Long id) {
        DonneeNgpEntity existingDonneeNgp = donneeNgpRepository.findById(id).orElse(null);

        existingDonneeNgp.setLibNgp(donneeNgp.getLibNgp());
        existingDonneeNgp.setCodeProhImp(donneeNgp.getCodeProhImp());
        existingDonneeNgp.setCodeProhExp(donneeNgp.getCodeProhExp());
        existingDonneeNgp.setDateDebut(donneeNgp.getDateDebut());
        existingDonneeNgp.setDateFin(donneeNgp.getDateFin());
        existingDonneeNgp.setRestrictionImportateur(donneeNgp.getRestrictionImportateur());
        existingDonneeNgp.setFlagInsert(donneeNgp.getFlagInsert());

        return donneeNgpRepository.save(existingDonneeNgp);
    }

    @Override
    public void deleteNGP(Long id) {
        donneeNgpRepository.deleteById(id);
    }

    @Override
    public DonneeNgpEntity getByIdDNGP(Long id) {
        return donneeNgpRepository.findById(id).orElse(null);
    }

    @Override
    public List<DonneeNgpEntity> getAllDNGP() {
        return donneeNgpRepository.findAll();
    }
}
