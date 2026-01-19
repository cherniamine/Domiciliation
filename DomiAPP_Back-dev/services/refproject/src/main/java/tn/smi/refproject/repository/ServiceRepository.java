package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.refproject.entities.ServiceEntity;

public interface ServiceRepository extends JpaRepository<ServiceEntity,Byte> {
}
