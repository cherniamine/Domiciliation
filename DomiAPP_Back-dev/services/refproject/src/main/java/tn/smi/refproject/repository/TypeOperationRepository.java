package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.refproject.entities.TypeOperationEntity;
import tn.smi.refproject.entities.TypeOperationEntityPK;

public interface TypeOperationRepository extends JpaRepository<TypeOperationEntity, TypeOperationEntityPK> {
}
