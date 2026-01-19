package tn.smi.domiciliation.services.Interface;

import tn.smi.domiciliation.entities.ImageDetailPDepotEntity;
import tn.smi.domiciliation.entities.ImageDetailPDepotEntityPK;

import java.util.List;

public interface IImageDetailPDepot {
    ImageDetailPDepotEntity create(ImageDetailPDepotEntity imageDetailPDepot);
    ImageDetailPDepotEntity update(ImageDetailPDepotEntity imageDetailPDepot, ImageDetailPDepotEntityPK imageDetailPDepotEntityPK);
    void delete(ImageDetailPDepotEntityPK imageDetailPDepotEntityPK);
    ImageDetailPDepotEntity getById(ImageDetailPDepotEntityPK imageDetailPDepotEntityPK);
    List<ImageDetailPDepotEntity> getAll();
}
