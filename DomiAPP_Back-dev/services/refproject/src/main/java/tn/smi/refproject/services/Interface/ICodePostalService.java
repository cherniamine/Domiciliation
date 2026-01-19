package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.CodePostalEntity;
import tn.smi.refproject.entities.CodePostalEntityPK;

import java.util.List;

public interface ICodePostalService {
    CodePostalEntity getCodePostalByid(CodePostalEntityPK id);
    List<CodePostalEntity> getCodePostals();
}
