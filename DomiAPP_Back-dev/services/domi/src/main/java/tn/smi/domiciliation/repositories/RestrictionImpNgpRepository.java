package tn.smi.domiciliation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.domiciliation.entities.RestrictionImpNgpEntity;
import tn.smi.domiciliation.entities.RestrictionImpNgpEntityPK;

public interface RestrictionImpNgpRepository extends JpaRepository<RestrictionImpNgpEntity, RestrictionImpNgpEntityPK> {
}
