package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.ServiceEntity;
import tn.smi.refproject.repository.ServiceRepository;
import tn.smi.refproject.services.Interface.IServiceService;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceService implements IServiceService {
    private ServiceRepository serviceRepository;
    @Override
    public ServiceEntity getServiceById(Byte id) {
        return serviceRepository.findById(id).orElse(null);
    }

    @Override
    public List<ServiceEntity> getAllServices() {
        return serviceRepository.findAll();
    }
}
