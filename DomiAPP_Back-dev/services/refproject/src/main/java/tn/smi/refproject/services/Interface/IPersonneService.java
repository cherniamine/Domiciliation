package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.PersonneEntity;
import tn.smi.refproject.entities.PersonneEntityPK;

import java.util.List;
import java.util.Optional;

public interface IPersonneService {
    PersonneEntity getPersonneById(PersonneEntityPK id);
    List<PersonneEntity>getPersonnes();
    Optional<String> getNomEtPrenom(String noPiecePersonne);
}
