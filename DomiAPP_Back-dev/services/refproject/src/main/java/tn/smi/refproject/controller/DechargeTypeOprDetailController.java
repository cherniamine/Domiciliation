package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.DechargeTypeOprDetailEntity;
import tn.smi.refproject.services.Interface.IDechargeTypeOprDetailService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/DechargeTypeOpr")
public class DechargeTypeOprDetailController {
    private IDechargeTypeOprDetailService iDechargeTypeOprDetailService;
@GetMapping("/get/{id}")
    public DechargeTypeOprDetailEntity getDechargeTypeOprDetail(@PathVariable Long id) {
        return iDechargeTypeOprDetailService.getDechargeTypeOprDetail(id);
    }
@GetMapping("/all")
    public List<DechargeTypeOprDetailEntity> getDechargeTypeOprDetails() {
        return iDechargeTypeOprDetailService.getDechargeTypeOprDetails();
    }
}
