package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.refproject.entities.ClientEntity;
import tn.smi.refproject.entities.ClientEntityPK;

import java.util.List;
import java.util.Optional;

public interface ClientRepository extends JpaRepository<ClientEntity, ClientEntityPK> {
    Optional<ClientEntity> findByClientEntityPK_NoPieceClient(String noPieceClient);


}