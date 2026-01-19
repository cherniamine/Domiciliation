package tn.smi.gen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.smi.gen.entities.DocumentsEntity;

import java.util.List;

@Repository
public interface DocumentsRepository extends JpaRepository<DocumentsEntity, Long> {
    List<DocumentsEntity> findByNumDossier(Integer numDossier);
    @Query("SELECT MAX(d.numLigne) FROM DocumentsEntity d WHERE d.numDossier = :numDossier")
    Byte getMaxNumLigne(@Param("numDossier") Integer numDossier);
}
