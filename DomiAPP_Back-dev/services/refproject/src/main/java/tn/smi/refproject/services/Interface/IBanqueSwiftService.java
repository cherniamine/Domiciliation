package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.BanqueSwiftServiceEntity;
import tn.smi.refproject.entities.BanqueSwiftServiceEntityPK;

import java.util.List;

public interface IBanqueSwiftService {
    BanqueSwiftServiceEntity getBanqueSwiftServiceById(BanqueSwiftServiceEntityPK id);
    List<BanqueSwiftServiceEntity>getBanqueSwiftServices();
}
