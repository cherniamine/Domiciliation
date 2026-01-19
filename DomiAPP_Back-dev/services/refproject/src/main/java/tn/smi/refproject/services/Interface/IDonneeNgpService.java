package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.DonneeNgpEntity;

import java.util.List;

public interface IDonneeNgpService {
    DonneeNgpEntity getDonneeNgpById(Long id);
    List<DonneeNgpEntity> getDonneeNgps();
    List<Long> findAllCodeNgp();
}
