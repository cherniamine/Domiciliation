package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.smi.refproject.entities.CompteEntity;
import tn.smi.refproject.entities.ModeDeReglementEntity;

import java.util.List;

public interface ModeDeReglementRepository extends JpaRepository<ModeDeReglementEntity,Byte> {

    @Query("SELECT m.codeModReg as codeModReg FROM ModeDeReglementEntity m")
    List<Long> findAllCodeModReg();
}
