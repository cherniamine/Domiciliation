package tn.smi.domiciliation.services.Interface;

import tn.smi.domiciliation.entities.DepotDomiciliationTitreEntity;
import tn.smi.domiciliation.entities.DepotDomiciliationTitreEntityPK;

import java.util.List;

public interface IDepotDomicliationTitre {
    DepotDomiciliationTitreEntity createDT(DepotDomiciliationTitreEntity depotDomiciliationTitre);
    DepotDomiciliationTitreEntity updateDT(DepotDomiciliationTitreEntity depotDomiciliationTitre, Long id);
    void deleteDT(Long id);
    DepotDomiciliationTitreEntity getByIdDT(Long id);
    List<DepotDomiciliationTitreEntity> getAllDT();
    void EtatVerifie(Long id);
    void EtatModif(Long id);
    void AjouterObservation(Long id,String msg);



}
