package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.CompteDetails;
import tn.smi.refproject.entities.CompteEntity;
import tn.smi.refproject.entities.CompteEntityPK;
import tn.smi.refproject.repository.CompteRepository;
import tn.smi.refproject.repository.DonneesGeneralesRepository;
import tn.smi.refproject.services.Interface.ICompteService;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CompteService implements ICompteService {

    private final CompteRepository compteRepository;
    private final DonneesGeneralesRepository donneesGeneralesRepository;

    @Override
    public CompteEntity getCompteById(CompteEntityPK id) {
        return compteRepository.findById(id).orElse(null);
    }

    @Override
    public List<CompteEntity> getComptes() {
        return compteRepository.findAll();
    }

    @Override
    public List<String> getAllNoPiecesClients() {
        return compteRepository.findAllNoPieceClient();
    }

    @Override
    public List<String> getAllRibsForClient(String noPieceClient) {
        List<CompteDetails> compteDetailsList = compteRepository.getCompteRib(noPieceClient);
        Byte donneeGenerale = donneesGeneralesRepository.getCodeBanque();
        String codeBanque = donneeGenerale != null ? donneeGenerale.toString() : "000";

        return compteDetailsList.stream().map(compteDetails -> {
            String cleRib = (compteDetails.getCleRib() != null ? compteDetails.getCleRib().toString() : "0");
            String codeAgenceBct = (compteDetails.getCodeAgenceBct() != null ? compteDetails.getCodeAgenceBct().toString() : "000");
            String racineCompte = (compteDetails.getRacineCompte() != null ? compteDetails.getRacineCompte() : "0000000000000");

            // Ensure cleRib is 2 digits
            cleRib = String.format("%02d", Integer.parseInt(cleRib));

            // Ensure racineCompte is 13 digits
            racineCompte = String.format("%013d", Long.parseLong(racineCompte));

            // Ensure codeAgenceBct is 3 digits
            codeAgenceBct = String.format("%03d", Integer.parseInt(codeAgenceBct));

            return codeBanque + codeAgenceBct + racineCompte + cleRib;
        }).collect(Collectors.toList());
    }
}
