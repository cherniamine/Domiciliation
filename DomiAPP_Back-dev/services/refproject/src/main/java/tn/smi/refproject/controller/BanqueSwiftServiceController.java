package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.BanqueSwiftServiceEntity;
import tn.smi.refproject.entities.BanqueSwiftServiceEntityPK;
import tn.smi.refproject.services.Interface.IBanqueSwiftService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/BanqueSwiftService")
public class BanqueSwiftServiceController {
    private IBanqueSwiftService iBanqueSwiftService;
@GetMapping("/get/{codeBanque}/{codeService}")
    public BanqueSwiftServiceEntity getBanqueSwiftServiceById(@PathVariable Byte codeBanque,@PathVariable Byte codeService) {
    BanqueSwiftServiceEntityPK id=new BanqueSwiftServiceEntityPK(codeBanque,codeService);
        return iBanqueSwiftService.getBanqueSwiftServiceById(id);
    }
@GetMapping("/all")
    public List<BanqueSwiftServiceEntity> getBanqueSwiftServices() {
        return iBanqueSwiftService.getBanqueSwiftServices();
    }
}
