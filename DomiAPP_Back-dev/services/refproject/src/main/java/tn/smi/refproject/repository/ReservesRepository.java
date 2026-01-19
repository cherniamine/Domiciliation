package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.refproject.entities.ReservesEntity;

public interface ReservesRepository extends JpaRepository<ReservesEntity,Byte> {
}
