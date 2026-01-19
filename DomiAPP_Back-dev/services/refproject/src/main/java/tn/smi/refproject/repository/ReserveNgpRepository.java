package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.refproject.entities.ReserveNgpEntity;
import tn.smi.refproject.entities.ReserveNgpEntityPK;

public interface ReserveNgpRepository extends JpaRepository<ReserveNgpEntity, ReserveNgpEntityPK> {
}
