package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.refproject.entities.JourFerrieEntity;
import tn.smi.refproject.entities.JourFerrieEntityPK;

public interface JourFerrieRepository extends JpaRepository<JourFerrieEntity, JourFerrieEntityPK> {
}
