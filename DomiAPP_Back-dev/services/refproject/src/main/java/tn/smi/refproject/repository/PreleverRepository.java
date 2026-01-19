package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.refproject.entities.PreleverEntity;
import tn.smi.refproject.entities.PreleverEntityPK;

public interface PreleverRepository extends JpaRepository<PreleverEntity, PreleverEntityPK> {
}
