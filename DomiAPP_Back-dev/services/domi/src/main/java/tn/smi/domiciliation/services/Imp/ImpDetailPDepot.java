package tn.smi.domiciliation.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.domiciliation.entities.DetailPDepotEntity;
import tn.smi.domiciliation.entities.DetailPDepotEntityPK;
import tn.smi.domiciliation.repositories.DetailPDepotRepository;
import tn.smi.domiciliation.services.Interface.IDetailPDepot;

import java.util.List;

@Service
@AllArgsConstructor
public class ImpDetailPDepot implements IDetailPDepot {
    private DetailPDepotRepository detailPDepotRepository;

    @Override
    public DetailPDepotEntity createDPD(DetailPDepotEntity detailPDepot) {
        return detailPDepotRepository.save(detailPDepot);
    }

    @Override
    public DetailPDepotEntity updateDPD(DetailPDepotEntity detailPDepot, DetailPDepotEntityPK detailPDepotEntityPK) {
        DetailPDepotEntity existingDetailPDepot = detailPDepotRepository.findById(detailPDepotEntityPK).orElse(null);

        existingDetailPDepot.setCodeNgp(detailPDepot.getCodeNgp());
        existingDetailPDepot.setMontantDvsNgp(detailPDepot.getMontantDvsNgp());
        existingDetailPDepot.setCodePaysOrigNgp(detailPDepot.getCodePaysOrigNgp());
        existingDetailPDepot.setCodeUnite(detailPDepot.getCodeUnite());
        existingDetailPDepot.setQteNgp(detailPDepot.getQteNgp());
        existingDetailPDepot.setTestReserve(detailPDepot.getTestReserve());
        existingDetailPDepot.setIdTce(detailPDepot.getIdTce());

        return detailPDepotRepository.save(existingDetailPDepot);


    }

    @Override
    public void deleteDPD(DetailPDepotEntityPK detailPDepotEntityPK) {
        detailPDepotRepository.deleteById(detailPDepotEntityPK);
    }

    @Override
    public DetailPDepotEntity getByIdDPD(DetailPDepotEntityPK detailPDepotEntityPK) {
        return detailPDepotRepository.findById(detailPDepotEntityPK).orElse(null);
    }

    @Override
    public List<DetailPDepotEntity> getAllDPD() {
        return detailPDepotRepository.findAll();
    }
}
