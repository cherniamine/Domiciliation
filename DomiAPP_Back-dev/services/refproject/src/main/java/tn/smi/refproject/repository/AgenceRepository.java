package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.smi.refproject.DTO.agence;
import tn.smi.refproject.entities.AgenceEntity;
import tn.smi.refproject.entities.AgenceEntityPK;

import java.util.List;

public interface AgenceRepository extends JpaRepository<AgenceEntity, AgenceEntityPK> {

    @Query("SELECT new tn.smi.refproject.DTO.agence(a.agenceEntityPK.codeAgenceBct, a.libAgence) FROM AgenceEntity a")
    List<agence> findAgencesSummary();
}