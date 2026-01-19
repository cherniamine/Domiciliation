package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.smi.refproject.entities.DonneeNgpEntity;
import tn.smi.refproject.entities.UniteEntity;

import java.util.List;

public interface DonneeNgpRepository extends JpaRepository<DonneeNgpEntity,Long> {
    @Query("SELECT d.codeNgp as codeNgp FROM DonneeNgpEntity d")
    List<Long> findAllCodeNgp();

}
