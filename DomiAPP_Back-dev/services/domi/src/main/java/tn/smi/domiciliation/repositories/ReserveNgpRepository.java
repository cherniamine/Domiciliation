package tn.smi.domiciliation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.domiciliation.entities.ReserveNgpEntity;
import tn.smi.domiciliation.entities.ReserveNgpEntityPK;

public interface ReserveNgpRepository extends JpaRepository<ReserveNgpEntity, ReserveNgpEntityPK> {
}
