package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.refproject.entities.CodePostalEntity;
import tn.smi.refproject.entities.CodePostalEntityPK;

public interface CodePostalRepository extends JpaRepository<CodePostalEntity, CodePostalEntityPK> {
}
