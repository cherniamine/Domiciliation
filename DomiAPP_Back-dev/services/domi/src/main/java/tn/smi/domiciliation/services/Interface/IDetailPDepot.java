package tn.smi.domiciliation.services.Interface;

import tn.smi.domiciliation.entities.DetailPDepotEntity;
import tn.smi.domiciliation.entities.DetailPDepotEntityPK;

import java.util.List;

public interface IDetailPDepot {
    DetailPDepotEntity createDPD(DetailPDepotEntity detailPDepot);
    DetailPDepotEntity updateDPD(DetailPDepotEntity detailPDepot,DetailPDepotEntityPK detailPDepotEntityPK);
    void deleteDPD(DetailPDepotEntityPK detailPDepotEntityPK);
    DetailPDepotEntity getByIdDPD(DetailPDepotEntityPK detailPDepotEntityPK);
    List<DetailPDepotEntity> getAllDPD();



}
