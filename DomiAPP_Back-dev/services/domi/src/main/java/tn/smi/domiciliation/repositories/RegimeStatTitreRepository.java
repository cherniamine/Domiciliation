package tn.smi.domiciliation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.domiciliation.entities.RegimeStatTitreEntity;
import tn.smi.domiciliation.entities.RegimeStatTitreEntityPK;

public interface RegimeStatTitreRepository extends JpaRepository<RegimeStatTitreEntity, RegimeStatTitreEntityPK> {
}
