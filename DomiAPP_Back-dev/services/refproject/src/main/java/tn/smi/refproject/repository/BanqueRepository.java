package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.refproject.entities.BanqueEntity;

public interface BanqueRepository extends JpaRepository<BanqueEntity,Byte> {
}
