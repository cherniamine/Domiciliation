package tn.smi.domiciliation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.domiciliation.entities.DepotDomiciliationTitreEntity;
import tn.smi.domiciliation.entities.DepotDomiciliationTitreEntityPK;

public interface DepotDomiciliationTitreRepository extends JpaRepository<DepotDomiciliationTitreEntity, Long> {
}
