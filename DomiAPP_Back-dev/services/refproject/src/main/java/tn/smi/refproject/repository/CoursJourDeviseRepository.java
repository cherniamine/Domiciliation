package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.refproject.entities.CoursJoursDeviseEntity;
import tn.smi.refproject.entities.CoursJoursDeviseEntityPK;

public interface CoursJourDeviseRepository extends JpaRepository<CoursJoursDeviseEntity, CoursJoursDeviseEntityPK> {
}
