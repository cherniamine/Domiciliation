package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.smi.refproject.entities.DeviseEntity;
import tn.smi.refproject.entities.PaysEntity;

import java.util.List;

public interface PaysRepository extends JpaRepository<PaysEntity,Byte> {
    @Query("SELECT p.codePays as codePays FROM PaysEntity p")
    List<Long> findAllCodePays();
}
