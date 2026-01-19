package tn.smi.domiciliation.services.Interface;

import tn.smi.domiciliation.entities.DerogationCirculaireEntity;
import tn.smi.domiciliation.entities.DerogationCirculaireEntityPK;

import java.util.List;

public interface IDerogationCirculaire {
    DerogationCirculaireEntity createDC(DerogationCirculaireEntity derogationCirculaire);
    DerogationCirculaireEntity updateDC(DerogationCirculaireEntity derogationCirculaire,DerogationCirculaireEntityPK id);
    void deleteDC(DerogationCirculaireEntityPK id);
    DerogationCirculaireEntity getByIdDC(DerogationCirculaireEntityPK id);
    List<DerogationCirculaireEntity>getAllDC();
}
