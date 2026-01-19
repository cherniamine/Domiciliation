package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.refproject.entities.ClientProhibeEntity;
import tn.smi.refproject.entities.ClientProhibeEntityPK;

public interface ClientProhibeRepository extends JpaRepository<ClientProhibeEntity, ClientProhibeEntityPK> {
}
