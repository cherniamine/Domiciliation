package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.smi.refproject.entities.DonneeNgpEntity;
import tn.smi.refproject.entities.ModeDeLivraisonEntity;

import java.util.List;

public interface ModeDeLivraisonRepository extends JpaRepository<ModeDeLivraisonEntity,Byte> {
    @Query("SELECT m.codeModLiv as codeModLiv FROM ModeDeLivraisonEntity m")
    List<Long> findAllCodeModLiv();
}
