package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.refproject.entities.ZoneBanqueEntity;
import tn.smi.refproject.entities.ZoneBanqueEntityPK;

public interface ZoneBanqueRepository extends JpaRepository<ZoneBanqueEntity, ZoneBanqueEntityPK> {
}
