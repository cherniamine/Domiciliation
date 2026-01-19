package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.refproject.entities.DirectionEntity;

public interface DirectionRepository extends JpaRepository<DirectionEntity,Byte> {
}
