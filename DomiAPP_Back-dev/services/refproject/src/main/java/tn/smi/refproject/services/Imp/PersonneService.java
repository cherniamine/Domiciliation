package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.PersonneEntity;
import tn.smi.refproject.entities.PersonneEntityPK;
import tn.smi.refproject.repository.PersonneRepository;
import tn.smi.refproject.services.Interface.IPersonneService;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PersonneService implements IPersonneService {
    private PersonneRepository personneRepository;
    @Override
    public PersonneEntity getPersonneById(PersonneEntityPK id) {
        return personneRepository.findById(id).orElse(null);
    }

    @Override
    public List<PersonneEntity> getPersonnes() {
        return personneRepository.findAll();
    }

    @Override
    public Optional<String> getNomEtPrenom(String noPiecePersonne) {
        return personneRepository.findByPersonneEntityPKNoPiecePersonne(noPiecePersonne)
                .map(personne -> personne.getNom() + " " + personne.getPrenom());
    }
}
