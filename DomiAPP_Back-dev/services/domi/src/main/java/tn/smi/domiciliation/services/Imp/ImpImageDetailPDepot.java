package tn.smi.domiciliation.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.domiciliation.entities.ImageDetailPDepotEntity;
import tn.smi.domiciliation.entities.ImageDetailPDepotEntityPK;
import tn.smi.domiciliation.repositories.ImageDetailPDepotRepository;
import tn.smi.domiciliation.services.Interface.IImageDetailPDepot;

import java.util.List;

@Service
@AllArgsConstructor
public class ImpImageDetailPDepot implements IImageDetailPDepot {
    private ImageDetailPDepotRepository imageDetailPDepotRepository;
    @Override
    public ImageDetailPDepotEntity create(ImageDetailPDepotEntity imageDetailPDepot) {
        return imageDetailPDepotRepository.save(imageDetailPDepot);
    }

    @Override
    public ImageDetailPDepotEntity update(ImageDetailPDepotEntity imageDetailPDepot, ImageDetailPDepotEntityPK imageDetailPDepotEntityPK) {
        ImageDetailPDepotEntity existingImageDetailPDepot = imageDetailPDepotRepository.findById(imageDetailPDepotEntityPK).orElse(null);

        existingImageDetailPDepot.setCodeNgp(imageDetailPDepot.getCodeNgp());
        existingImageDetailPDepot.setMontantDvsNgp(imageDetailPDepot.getMontantDvsNgp());
        existingImageDetailPDepot.setCodePaysOrigNgp(imageDetailPDepot.getCodePaysOrigNgp());
        existingImageDetailPDepot.setQteNgp(imageDetailPDepot.getQteNgp());
        existingImageDetailPDepot.setCodeUnite(imageDetailPDepot.getCodeUnite());
        existingImageDetailPDepot.setTestReserve(imageDetailPDepot.getTestReserve());

        return imageDetailPDepotRepository.save(existingImageDetailPDepot);
    }

    @Override
    public void delete(ImageDetailPDepotEntityPK imageDetailPDepotEntityPK) {
        imageDetailPDepotRepository.deleteById(imageDetailPDepotEntityPK);
    }

    @Override
    public ImageDetailPDepotEntity getById(ImageDetailPDepotEntityPK imageDetailPDepotEntityPK) {
        return imageDetailPDepotRepository.findById(imageDetailPDepotEntityPK).orElse(null);
    }

    @Override
    public List<ImageDetailPDepotEntity> getAll() {
        return imageDetailPDepotRepository.findAll();
    }
}
