package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.refproject.entities.CptNostroEntity;
import tn.smi.refproject.entities.CptNostroEntityPK;

public interface CptNostroRepository extends JpaRepository<CptNostroEntity, CptNostroEntityPK> {
}
