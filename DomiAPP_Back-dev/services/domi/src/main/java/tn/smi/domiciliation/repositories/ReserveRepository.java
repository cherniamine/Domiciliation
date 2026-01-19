package tn.smi.domiciliation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.domiciliation.entities.ReservesEntity;

public interface ReserveRepository extends JpaRepository<ReservesEntity,Byte> {
}
