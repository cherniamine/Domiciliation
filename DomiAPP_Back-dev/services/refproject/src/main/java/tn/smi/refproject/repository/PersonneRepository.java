package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.refproject.entities.PersonneEntity;
import tn.smi.refproject.entities.PersonneEntityPK;

import java.util.Optional;

public interface PersonneRepository extends JpaRepository<PersonneEntity, PersonneEntityPK> {
    Optional<PersonneEntity> findByPersonneEntityPKNoPiecePersonne(String noPiecePersonne);
}
