package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.ServiceEntity;
import tn.smi.refproject.services.Interface.IServiceService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/Service")
public class ServiceController {
    private IServiceService iServiceService;
@GetMapping("/get/{id}")
    public ServiceEntity getServiceById(@PathVariable Byte id) {
        return iServiceService.getServiceById(id);
    }
@GetMapping("/all")
    public List<ServiceEntity> getAllServices() {
        return iServiceService.getAllServices();
    }
}
