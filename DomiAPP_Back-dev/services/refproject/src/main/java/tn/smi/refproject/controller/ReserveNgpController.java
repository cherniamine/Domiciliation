package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.ReserveNgpEntity;
import tn.smi.refproject.entities.ReserveNgpEntityPK;
import tn.smi.refproject.services.Interface.IReserveNgpService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/ReserveNgp")
public class ReserveNgpController {
    private IReserveNgpService iReserveNgpService;
@GetMapping("/get/{codeNgp}/{codeReserve}/{natureOpe}")
    public ReserveNgpEntity getReserveNgpById(@PathVariable long codeNgp,@PathVariable byte codeReserve,@PathVariable String natureOpe) {
        ReserveNgpEntityPK id=new ReserveNgpEntityPK(codeNgp,codeReserve,natureOpe);
        return iReserveNgpService.getReserveNgpById(id);
    }
@GetMapping("/all")
    public List<ReserveNgpEntity> getReserveNgps() {
        return iReserveNgpService.getReserveNgps();
    }
}
