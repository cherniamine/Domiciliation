package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.refproject.entities.ComClientEntity;
import tn.smi.refproject.entities.ComClientEntityPK;

public interface ComClientRepository extends JpaRepository<ComClientEntity, ComClientEntityPK> {
}
