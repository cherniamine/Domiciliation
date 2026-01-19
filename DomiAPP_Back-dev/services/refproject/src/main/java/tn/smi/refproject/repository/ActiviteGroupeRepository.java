package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.refproject.entities.ActiviteGroupeEntity;
import tn.smi.refproject.entities.ActiviteGroupeEntityPK;

public interface ActiviteGroupeRepository extends JpaRepository<ActiviteGroupeEntity, ActiviteGroupeEntityPK> {
}
