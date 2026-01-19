package tn.smi.domiciliation.services.Interface;
import tn.smi.domiciliation.entities.ImageDepotDomiciliationEntity;

import java.util.List;

public interface IImageDepotDomiciliation {
    ImageDepotDomiciliationEntity createIMDD(ImageDepotDomiciliationEntity imageDepotDomiciliation);
    ImageDepotDomiciliationEntity updateIMDD(ImageDepotDomiciliationEntity imageDepotDomiciliation,int id);
    void deleteIMDD(int id);
    ImageDepotDomiciliationEntity getByIdIMDD(int id);
    List<ImageDepotDomiciliationEntity> getAllIMDD();


}
