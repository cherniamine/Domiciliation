package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.smi.refproject.entities.PaysEntity;
import tn.smi.refproject.entities.UniteEntity;

import java.util.List;
import java.util.Locale;

public interface UniteRepository extends JpaRepository<UniteEntity,Byte> {
    @Query("SELECT u.codeUnite as codeUnite FROM UniteEntity u")
    List<Long> findAllCodeUnite();
}
