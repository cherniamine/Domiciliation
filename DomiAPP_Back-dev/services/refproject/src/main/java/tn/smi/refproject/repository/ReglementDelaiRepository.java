package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.refproject.entities.ReglementDelaisEntity;
import tn.smi.refproject.entities.ReglementDelaisEntityPK;

public interface ReglementDelaiRepository extends JpaRepository<ReglementDelaisEntity, ReglementDelaisEntityPK> {
}
