package tn.smi.domiciliation.services.Interface;

import tn.smi.domiciliation.entities.TitreEntity;

import java.util.List;

public interface ITitre {
    TitreEntity createT(TitreEntity titre);
    TitreEntity updateT(TitreEntity titre,Byte id);
    void deleteT(Byte id);
    TitreEntity getByIdT(Byte id);
    List<TitreEntity> getAllT();

}
