package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.refproject.entities.ConditionParOperationEntity;
import tn.smi.refproject.entities.ConditionParOperationEntityPK;

public interface ConditionParOperationRepository extends JpaRepository<ConditionParOperationEntity, ConditionParOperationEntityPK> {
}
