package tn.smi.domiciliation.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.domiciliation.entities.DerogationCirculaireEntity;
import tn.smi.domiciliation.entities.DerogationCirculaireEntityPK;
import tn.smi.domiciliation.repositories.DerogationCirculaireRepository;
import tn.smi.domiciliation.services.Interface.IDerogationCirculaire;

import java.util.List;
@Service
@AllArgsConstructor
public class ImpDerogationCirculaire implements IDerogationCirculaire {
    private DerogationCirculaireRepository derogationCirculaireRepository;


    @Override
    public DerogationCirculaireEntity createDC(DerogationCirculaireEntity derogationCirculaire) {
        return derogationCirculaireRepository.save(derogationCirculaire);
    }

    @Override
    public DerogationCirculaireEntity updateDC(DerogationCirculaireEntity derogationCirculaire, DerogationCirculaireEntityPK id) {
        DerogationCirculaireEntity derogationCirculaire1=derogationCirculaireRepository.findById(id).orElse(null);
        derogationCirculaire1.setNatureDerogation(derogationCirculaire.getNatureDerogation());
        derogationCirculaire1.setLibelleDerogationCirculaire(derogationCirculaire.getLibelleDerogationCirculaire());
        return derogationCirculaireRepository.save(derogationCirculaire1);
    }

    @Override
    public void deleteDC(DerogationCirculaireEntityPK id) {
        derogationCirculaireRepository.deleteById(id);
    }

    @Override
    public DerogationCirculaireEntity getByIdDC(DerogationCirculaireEntityPK id) {
        return derogationCirculaireRepository.findById(id).orElse(null);
    }

    @Override
    public List<DerogationCirculaireEntity> getAllDC() {
        return derogationCirculaireRepository.findAll();
    }
}
