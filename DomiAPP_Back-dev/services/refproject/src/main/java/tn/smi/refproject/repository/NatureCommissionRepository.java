package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.refproject.entities.NatureCommissionEntity;
import tn.smi.refproject.entities.NatureCommissionEntityPK;

public interface NatureCommissionRepository extends JpaRepository<NatureCommissionEntity, NatureCommissionEntityPK> {
}
