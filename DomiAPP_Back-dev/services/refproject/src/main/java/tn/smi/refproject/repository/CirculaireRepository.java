package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.refproject.entities.CirculaireEntity;
import tn.smi.refproject.entities.CirculaireEntityPK;

public interface CirculaireRepository extends JpaRepository<CirculaireEntity, CirculaireEntityPK> {
}
