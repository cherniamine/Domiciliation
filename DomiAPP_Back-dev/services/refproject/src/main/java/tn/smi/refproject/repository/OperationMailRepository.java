package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.refproject.entities.OperationMailEntity;
import tn.smi.refproject.entities.OperationMailEntityPK;

public interface OperationMailRepository extends JpaRepository<OperationMailEntity, OperationMailEntityPK> {
}
