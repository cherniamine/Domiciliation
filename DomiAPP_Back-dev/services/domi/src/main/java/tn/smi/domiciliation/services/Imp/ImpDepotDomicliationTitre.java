package tn.smi.domiciliation.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.domiciliation.entities.DepotDomiciliationTitreEntity;
import tn.smi.domiciliation.entities.enumeration.EtatVerif;
import tn.smi.domiciliation.repositories.DepotDomiciliationTitreRepository;
import tn.smi.domiciliation.services.Interface.IDepotDomicliationTitre;

import java.util.List;

@Service
@AllArgsConstructor
public class ImpDepotDomicliationTitre implements IDepotDomicliationTitre {
    private DepotDomiciliationTitreRepository depotDomiciliationTitreRepository;
    @Override
    public DepotDomiciliationTitreEntity createDT(DepotDomiciliationTitreEntity depotDomiciliationTitre) {
        return depotDomiciliationTitreRepository.save(depotDomiciliationTitre);
    }

    @Override
    public DepotDomiciliationTitreEntity updateDT(DepotDomiciliationTitreEntity depotDomiciliationTitre, Long id) {
        DepotDomiciliationTitreEntity existingDepotDomiciliationTitre = depotDomiciliationTitreRepository.findById(id).orElse(null);

        existingDepotDomiciliationTitre.setCodeAgence(depotDomiciliationTitre.getCodeAgence());
        existingDepotDomiciliationTitre.setTypePieceClient(depotDomiciliationTitre.getTypePieceClient());
        existingDepotDomiciliationTitre.setNoPieceClient(depotDomiciliationTitre.getNoPieceClient());
        existingDepotDomiciliationTitre.setNumCompte(depotDomiciliationTitre.getNumCompte());
        existingDepotDomiciliationTitre.setRegimeSecteurActivite(depotDomiciliationTitre.getRegimeSecteurActivite());
        existingDepotDomiciliationTitre.setActivitePrincipaleSecondaire(depotDomiciliationTitre.getActivitePrincipaleSecondaire());
        existingDepotDomiciliationTitre.setCodeSecteurActivite(depotDomiciliationTitre.getCodeSecteurActivite());
        existingDepotDomiciliationTitre.setCodeSecteurActiviteSec(depotDomiciliationTitre.getCodeSecteurActiviteSec());
        existingDepotDomiciliationTitre.setCodeTitre(depotDomiciliationTitre.getCodeTitre());
        existingDepotDomiciliationTitre.setNumDom(depotDomiciliationTitre.getNumDom());
        existingDepotDomiciliationTitre.setDateDom(depotDomiciliationTitre.getDateDom());
        existingDepotDomiciliationTitre.setNumDepot(depotDomiciliationTitre.getNumDepot());
        existingDepotDomiciliationTitre.setDateDepot(depotDomiciliationTitre.getDateDepot());
        existingDepotDomiciliationTitre.setNumeroDossier(depotDomiciliationTitre.getNumeroDossier());
        existingDepotDomiciliationTitre.setNumeroDemande(depotDomiciliationTitre.getNumeroDemande());
        existingDepotDomiciliationTitre.setNumContratCom(depotDomiciliationTitre.getNumContratCom());
        existingDepotDomiciliationTitre.setDateContratCom(depotDomiciliationTitre.getDateContratCom());
        existingDepotDomiciliationTitre.setCodeDevise(depotDomiciliationTitre.getCodeDevise());
        existingDepotDomiciliationTitre.setMntDvsPtfnFact(depotDomiciliationTitre.getMntDvsPtfnFact());
        existingDepotDomiciliationTitre.setMntDvsFobFact(depotDomiciliationTitre.getMntDvsFobFact());
        existingDepotDomiciliationTitre.setMntTndFob(depotDomiciliationTitre.getMntTndFob());
        existingDepotDomiciliationTitre.setMntTndPtfn(depotDomiciliationTitre.getMntTndPtfn());
        existingDepotDomiciliationTitre.setAcompte(depotDomiciliationTitre.getAcompte());
        existingDepotDomiciliationTitre.setNomFournisseur(depotDomiciliationTitre.getNomFournisseur());
        existingDepotDomiciliationTitre.setAdrFournisseur(depotDomiciliationTitre.getAdrFournisseur());
        existingDepotDomiciliationTitre.setNomClient(depotDomiciliationTitre.getNomClient());
        existingDepotDomiciliationTitre.setAdrClient(depotDomiciliationTitre.getAdrClient());
        existingDepotDomiciliationTitre.setCodPayAch(depotDomiciliationTitre.getCodPayAch());
        existingDepotDomiciliationTitre.setCodPayProv(depotDomiciliationTitre.getCodPayProv());
        existingDepotDomiciliationTitre.setCodPayOrig(depotDomiciliationTitre.getCodPayOrig());
        existingDepotDomiciliationTitre.setCodePaysDestDef(depotDomiciliationTitre.getCodePaysDestDef());
        existingDepotDomiciliationTitre.setCodeModLiv(depotDomiciliationTitre.getCodeModLiv());
        existingDepotDomiciliationTitre.setCodeModReg(depotDomiciliationTitre.getCodeModReg());
        existingDepotDomiciliationTitre.setCodeDelReg(depotDomiciliationTitre.getCodeDelReg());
        existingDepotDomiciliationTitre.setRegimeStat(depotDomiciliationTitre.getRegimeStat());
        existingDepotDomiciliationTitre.setNbrColis(depotDomiciliationTitre.getNbrColis());
        existingDepotDomiciliationTitre.setTypeAccordBct(depotDomiciliationTitre.getTypeAccordBct());
        existingDepotDomiciliationTitre.setNumAccordBct(depotDomiciliationTitre.getNumAccordBct());
        existingDepotDomiciliationTitre.setDateAccordBct(depotDomiciliationTitre.getDateAccordBct());
        existingDepotDomiciliationTitre.setNumCotunas(depotDomiciliationTitre.getNumCotunas());
        existingDepotDomiciliationTitre.setDateCotunas(depotDomiciliationTitre.getDateCotunas());
        existingDepotDomiciliationTitre.setDateValidite(depotDomiciliationTitre.getDateValidite());
        existingDepotDomiciliationTitre.setDateApurement(depotDomiciliationTitre.getDateApurement());
        existingDepotDomiciliationTitre.setObservation(depotDomiciliationTitre.getObservation());
        existingDepotDomiciliationTitre.setMatEmp(depotDomiciliationTitre.getMatEmp());
        existingDepotDomiciliationTitre.setStatus(depotDomiciliationTitre.getStatus());
        existingDepotDomiciliationTitre.setDateValidation(depotDomiciliationTitre.getDateValidation());
        existingDepotDomiciliationTitre.setCodeEnvoiSpecial(depotDomiciliationTitre.getCodeEnvoiSpecial());
        existingDepotDomiciliationTitre.setIdTce(depotDomiciliationTitre.getIdTce());

        return depotDomiciliationTitreRepository.save(existingDepotDomiciliationTitre);

    }

    @Override
    public void deleteDT(Long id) {
        depotDomiciliationTitreRepository.deleteById(id);

    }

    @Override
    public DepotDomiciliationTitreEntity getByIdDT(Long id) {
        return depotDomiciliationTitreRepository.findById(id).orElse(null);
    }

    @Override
    public List<DepotDomiciliationTitreEntity> getAllDT() {
        return depotDomiciliationTitreRepository.findAll();
    }

    @Override
    public void EtatVerifie(Long id) {
        DepotDomiciliationTitreEntity depotDomiciliationTitreEntity=depotDomiciliationTitreRepository.findById(id).orElse(null);
        depotDomiciliationTitreEntity.setEtatVerif(EtatVerif.Vérifier);
        depotDomiciliationTitreRepository.save(depotDomiciliationTitreEntity);
    }

    @Override
    public void EtatModif(Long id) {
        DepotDomiciliationTitreEntity depotDomiciliationTitreEntity=depotDomiciliationTitreRepository.findById(id).orElse(null);
        depotDomiciliationTitreEntity.setEtatVerif(EtatVerif.A_Modifier);
        depotDomiciliationTitreRepository.save(depotDomiciliationTitreEntity);

    }

    @Override
    public void AjouterObservation(Long id,String msg) {
        DepotDomiciliationTitreEntity depotDomiciliationTitreEntity=depotDomiciliationTitreRepository.findById(id).orElse(null);
        depotDomiciliationTitreEntity.setObservation(msg);
        depotDomiciliationTitreRepository.save(depotDomiciliationTitreEntity);

    }
}
