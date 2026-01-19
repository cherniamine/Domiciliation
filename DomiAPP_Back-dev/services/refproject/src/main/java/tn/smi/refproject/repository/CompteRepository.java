package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.smi.refproject.CompteDetails;
import tn.smi.refproject.entities.CompteEntity;
import tn.smi.refproject.entities.CompteEntityPK;
import tn.smi.refproject.entities.ModeDeLivraisonEntity;

import java.util.List;

public interface CompteRepository extends JpaRepository<CompteEntity, CompteEntityPK> {
    @Query("SELECT c.compteEntityPK.noPieceClient as noPieceClient FROM CompteEntity c")
    List<String> findAllNoPieceClient();
    @Query("SELECT new tn.smi.refproject.CompteDetails(c.compteEntityPK.cleRib, c.compteEntityPK.codeAgenceBct, c.compteEntityPK.racineCompte) " +
            "FROM CompteEntity c WHERE c.compteEntityPK.noPieceClient = :noPieceClient")
    List<CompteDetails> getCompteRib(String noPieceClient);
}
