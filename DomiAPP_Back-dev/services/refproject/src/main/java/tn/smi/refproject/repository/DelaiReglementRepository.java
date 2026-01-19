package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.smi.refproject.entities.DelaisReglementEntity;
import tn.smi.refproject.entities.ModeDeReglementEntity;

import java.util.List;

public interface DelaiReglementRepository extends JpaRepository<DelaisReglementEntity,Byte> {
    @Query("SELECT d.codeDelReg as codeDelReg FROM DelaisReglementEntity d")
    List<Long> findAllCodeDelReg();
}
