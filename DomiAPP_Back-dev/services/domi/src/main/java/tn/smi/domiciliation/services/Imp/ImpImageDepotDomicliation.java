package tn.smi.domiciliation.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.domiciliation.entities.ImageDepotDomiciliationEntity;
import tn.smi.domiciliation.repositories.ImageDepotDomicliationRepository;
import tn.smi.domiciliation.services.Interface.IImageDepotDomiciliation;

import java.util.List;
@Service
@AllArgsConstructor
public class ImpImageDepotDomicliation implements IImageDepotDomiciliation {
    private ImageDepotDomicliationRepository imageDepotDomicliationRepository;
    @Override
    public ImageDepotDomiciliationEntity createIMDD(ImageDepotDomiciliationEntity imageDepotDomiciliation) {
        return imageDepotDomicliationRepository.save(imageDepotDomiciliation);
    }

    @Override
    public ImageDepotDomiciliationEntity updateIMDD(ImageDepotDomiciliationEntity imageDepotDomiciliation, int id) {
        ImageDepotDomiciliationEntity existingImageDepotDomiciliation = imageDepotDomicliationRepository.findById(id).orElse(null);

        existingImageDepotDomiciliation.setCodeAgence(imageDepotDomiciliation.getCodeAgence());
        existingImageDepotDomiciliation.setTypePieceClient(imageDepotDomiciliation.getTypePieceClient());
        existingImageDepotDomiciliation.setNoPieceClient(imageDepotDomiciliation.getNoPieceClient());
        existingImageDepotDomiciliation.setNumCompte(imageDepotDomiciliation.getNumCompte());
        existingImageDepotDomiciliation.setRegimeSecteurActivite(imageDepotDomiciliation.getRegimeSecteurActivite());
        existingImageDepotDomiciliation.setActivitePrincipaleSecondaire(imageDepotDomiciliation.getActivitePrincipaleSecondaire());
        existingImageDepotDomiciliation.setCodeSecteurActivite(imageDepotDomiciliation.getCodeSecteurActivite());
        existingImageDepotDomiciliation.setCodeSecteurActiviteSec(imageDepotDomiciliation.getCodeSecteurActiviteSec());
        existingImageDepotDomiciliation.setCodeTitre(imageDepotDomiciliation.getCodeTitre());
        existingImageDepotDomiciliation.setNumDom(imageDepotDomiciliation.getNumDom());
        existingImageDepotDomiciliation.setDateDom(imageDepotDomiciliation.getDateDom());
        existingImageDepotDomiciliation.setNumDepot(imageDepotDomiciliation.getNumDepot());
        existingImageDepotDomiciliation.setDateDepot(imageDepotDomiciliation.getDateDepot());
        existingImageDepotDomiciliation.setNumeroDossier(imageDepotDomiciliation.getNumeroDossier());
        existingImageDepotDomiciliation.setNumeroDemande(imageDepotDomiciliation.getNumeroDemande());
        existingImageDepotDomiciliation.setNumContratCom(imageDepotDomiciliation.getNumContratCom());
        existingImageDepotDomiciliation.setDateContratCom(imageDepotDomiciliation.getDateContratCom());
        existingImageDepotDomiciliation.setCodeDevise(imageDepotDomiciliation.getCodeDevise());
        existingImageDepotDomiciliation.setMntDvsPtfnFact(imageDepotDomiciliation.getMntDvsPtfnFact());
        existingImageDepotDomiciliation.setMntDvsFobFact(imageDepotDomiciliation.getMntDvsFobFact());
        existingImageDepotDomiciliation.setMntTndFob(imageDepotDomiciliation.getMntTndFob());
        existingImageDepotDomiciliation.setMntTndPtfn(imageDepotDomiciliation.getMntTndPtfn());
        existingImageDepotDomiciliation.setAcompte(imageDepotDomiciliation.getAcompte());
        existingImageDepotDomiciliation.setNomFournisseur(imageDepotDomiciliation.getNomFournisseur());
        existingImageDepotDomiciliation.setAdrFournisseur(imageDepotDomiciliation.getAdrFournisseur());
        existingImageDepotDomiciliation.setNomClient(imageDepotDomiciliation.getNomClient());
        existingImageDepotDomiciliation.setAdrClient(imageDepotDomiciliation.getAdrClient());
        existingImageDepotDomiciliation.setCodPayAch(imageDepotDomiciliation.getCodPayAch());
        existingImageDepotDomiciliation.setCodPayProv(imageDepotDomiciliation.getCodPayProv());
        existingImageDepotDomiciliation.setCodPayOrig(imageDepotDomiciliation.getCodPayOrig());
        existingImageDepotDomiciliation.setCodePaysDestDef(imageDepotDomiciliation.getCodePaysDestDef());
        existingImageDepotDomiciliation.setCodeModLiv(imageDepotDomiciliation.getCodeModLiv());
        existingImageDepotDomiciliation.setCodeModReg(imageDepotDomiciliation.getCodeModReg());
        existingImageDepotDomiciliation.setCodeDelReg(imageDepotDomiciliation.getCodeDelReg());
        existingImageDepotDomiciliation.setRegimeStat(imageDepotDomiciliation.getRegimeStat());
        existingImageDepotDomiciliation.setNbrColis(imageDepotDomiciliation.getNbrColis());
        existingImageDepotDomiciliation.setTypeAccordBct(imageDepotDomiciliation.getTypeAccordBct());
        existingImageDepotDomiciliation.setNumAccordBct(imageDepotDomiciliation.getNumAccordBct());
        existingImageDepotDomiciliation.setDateAccordBct(imageDepotDomiciliation.getDateAccordBct());
        existingImageDepotDomiciliation.setNumCotunas(imageDepotDomiciliation.getNumCotunas());
        existingImageDepotDomiciliation.setDateCotunas(imageDepotDomiciliation.getDateCotunas());
        existingImageDepotDomiciliation.setDateValidite(imageDepotDomiciliation.getDateValidite());
        existingImageDepotDomiciliation.setDateApurement(imageDepotDomiciliation.getDateApurement());
        existingImageDepotDomiciliation.setObservation(imageDepotDomiciliation.getObservation());
        existingImageDepotDomiciliation.setCodeEnvoiSpecial(imageDepotDomiciliation.getCodeEnvoiSpecial());

        return imageDepotDomicliationRepository.save(existingImageDepotDomiciliation);
    }

    @Override
    public void deleteIMDD(int id) {
        imageDepotDomicliationRepository.deleteById(id);
    }

    @Override
    public ImageDepotDomiciliationEntity getByIdIMDD(int id) {
        return imageDepotDomicliationRepository.findById(id).orElse(null);
    }

    @Override
    public List<ImageDepotDomiciliationEntity> getAllIMDD() {
        return imageDepotDomicliationRepository.findAll();
    }
}
