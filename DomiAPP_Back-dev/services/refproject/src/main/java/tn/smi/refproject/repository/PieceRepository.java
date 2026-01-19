package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.refproject.entities.PieceEntity;

public interface PieceRepository extends JpaRepository<PieceEntity,Byte> {
}
