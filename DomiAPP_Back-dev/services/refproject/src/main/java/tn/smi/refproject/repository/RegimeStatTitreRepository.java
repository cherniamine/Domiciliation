package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.refproject.entities.RegimeStatTitreEntity;
import tn.smi.refproject.entities.RegimeStatTitreEntityPK;

public interface RegimeStatTitreRepository extends JpaRepository<RegimeStatTitreEntity, RegimeStatTitreEntityPK> {
}
