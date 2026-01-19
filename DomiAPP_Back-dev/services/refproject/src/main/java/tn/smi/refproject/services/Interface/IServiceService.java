package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.ServiceEntity;

import java.util.List;

public interface IServiceService {
    ServiceEntity getServiceById(Byte id);
    List<ServiceEntity>getAllServices();
}
