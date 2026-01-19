package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.refproject.entities.TPieceEntity;

public interface TPieceRepository extends JpaRepository<TPieceEntity,Integer> {
}
