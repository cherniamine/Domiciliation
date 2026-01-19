package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.refproject.entities.TypeOperationCommissionEntity;
import tn.smi.refproject.entities.TypeOperationCommissionEntityPK;

public interface TypeOperationCommissionRepository extends JpaRepository<TypeOperationCommissionEntity, TypeOperationCommissionEntityPK> {
}
