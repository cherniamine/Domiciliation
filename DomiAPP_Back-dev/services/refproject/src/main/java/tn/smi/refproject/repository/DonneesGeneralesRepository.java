package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.smi.refproject.entities.DonneesGeneralesEntity;

public interface DonneesGeneralesRepository extends JpaRepository<DonneesGeneralesEntity,Byte> {

    @Query("select d.codeBanque as codeBanque from DonneesGeneralesEntity d")
    Byte getCodeBanque();
}
