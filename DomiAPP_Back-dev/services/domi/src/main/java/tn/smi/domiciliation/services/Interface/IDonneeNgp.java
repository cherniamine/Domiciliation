package tn.smi.domiciliation.services.Interface;

import tn.smi.domiciliation.entities.DonneeNgpEntity;

import java.util.List;

public interface IDonneeNgp {
    DonneeNgpEntity createDNGP(DonneeNgpEntity donneeNgp);
    DonneeNgpEntity updateDNGP(DonneeNgpEntity donneeNgp, Long id);
    void deleteNGP(Long id);
    DonneeNgpEntity getByIdDNGP(Long id);
    List<DonneeNgpEntity> getAllDNGP();
    
}
