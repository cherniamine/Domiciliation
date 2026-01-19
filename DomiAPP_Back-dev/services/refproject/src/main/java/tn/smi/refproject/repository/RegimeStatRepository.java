package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.smi.refproject.entities.ModeDeReglementEntity;
import tn.smi.refproject.entities.RegimeStatEntity;

import java.util.List;

public interface RegimeStatRepository extends JpaRepository<RegimeStatEntity,Short> {
    @Query("SELECT r.codeRegimeStat as codeRegimeStat FROM RegimeStatEntity r")
    List<Long> findAllCodeRegimeStat();
}
