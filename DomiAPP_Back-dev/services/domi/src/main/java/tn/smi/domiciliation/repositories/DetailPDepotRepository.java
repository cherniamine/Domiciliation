package tn.smi.domiciliation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.domiciliation.entities.DetailPDepotEntity;
import tn.smi.domiciliation.entities.DetailPDepotEntityPK;

public interface DetailPDepotRepository extends JpaRepository<DetailPDepotEntity, DetailPDepotEntityPK> {
}
