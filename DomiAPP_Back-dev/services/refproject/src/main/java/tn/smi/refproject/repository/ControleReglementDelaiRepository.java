package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.refproject.entities.ControleReglementDelaisEntity;
import tn.smi.refproject.entities.ControleReglementDelaisEntityPK;

public interface ControleReglementDelaiRepository extends JpaRepository<ControleReglementDelaisEntity, ControleReglementDelaisEntityPK> {
}
