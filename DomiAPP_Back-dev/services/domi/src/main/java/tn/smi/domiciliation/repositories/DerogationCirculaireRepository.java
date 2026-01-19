package tn.smi.domiciliation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.domiciliation.entities.DerogationCirculaireEntity;
import tn.smi.domiciliation.entities.DerogationCirculaireEntityPK;

public interface DerogationCirculaireRepository extends JpaRepository<DerogationCirculaireEntity, DerogationCirculaireEntityPK> {
}
