package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.refproject.entities.ActiviteDivisionEntity;
import tn.smi.refproject.entities.ActiviteDivisionEntityPK;

public interface ActiviteDivisionRepository extends JpaRepository<ActiviteDivisionEntity, ActiviteDivisionEntityPK> {
}
