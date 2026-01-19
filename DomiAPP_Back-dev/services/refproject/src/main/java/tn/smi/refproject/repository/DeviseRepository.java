package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.smi.refproject.entities.DeviseEntity;

import java.util.List;
import java.util.Locale;

public interface DeviseRepository extends JpaRepository<DeviseEntity,Byte> {
    @Query("SELECT d.codeDevise as codeDevise FROM DeviseEntity d")
    List<Long> findAllCodeDevises();

    @Override
    List<DeviseEntity> findAll();
}
