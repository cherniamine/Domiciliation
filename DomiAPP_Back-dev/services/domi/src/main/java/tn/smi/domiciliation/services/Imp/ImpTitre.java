package tn.smi.domiciliation.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.domiciliation.entities.TitreEntity;
import tn.smi.domiciliation.repositories.TitreRepository;
import tn.smi.domiciliation.services.Interface.ITitre;

import java.util.List;

@Service
@AllArgsConstructor
public class ImpTitre implements ITitre {
    private TitreRepository titreRepository;
    @Override
    public TitreEntity createT(TitreEntity titre) {
        return titreRepository.save(titre);
    }

    @Override
    public TitreEntity updateT(TitreEntity titre, Byte id) {
        TitreEntity existingTitre = titreRepository.findById(id).orElse(null);

        existingTitre.setLibTitre(titre.getLibTitre());
        existingTitre.setDureeValTit(titre.getDureeValTit());
        existingTitre.setDureeApurement(titre.getDureeApurement());
        existingTitre.setNatureTitre(titre.getNatureTitre());
        existingTitre.setAutre(titre.getAutre());
        existingTitre.setTypeDate(titre.getTypeDate());

        return titreRepository.save(existingTitre);
    }

    @Override
    public void deleteT(Byte id) {
        titreRepository.deleteById(id);
    }

    @Override
    public TitreEntity getByIdT(Byte id) {
        return titreRepository.findById(id).orElse(null);
    }

    @Override
    public List<TitreEntity> getAllT() {
        return titreRepository.findAll();
    }
}
