package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.refproject.entities.CommissionEntity;

public interface CommissionRepository extends JpaRepository<CommissionEntity,Integer> {
}
