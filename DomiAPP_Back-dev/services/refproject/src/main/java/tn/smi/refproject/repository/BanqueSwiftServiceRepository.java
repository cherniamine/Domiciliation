package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.refproject.entities.BanqueSwiftServiceEntity;
import tn.smi.refproject.entities.BanqueSwiftServiceEntityPK;

public interface BanqueSwiftServiceRepository extends JpaRepository<BanqueSwiftServiceEntity, BanqueSwiftServiceEntityPK> {
}
