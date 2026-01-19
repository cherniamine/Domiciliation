package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.refproject.entities.PaysNgpEntity;
import tn.smi.refproject.entities.PaysNgpEntityPK;

public interface PaysNgpRepository extends JpaRepository<PaysNgpEntity, PaysNgpEntityPK> {
}
