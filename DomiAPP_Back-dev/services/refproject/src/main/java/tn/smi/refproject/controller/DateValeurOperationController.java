package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.DateValeurParOperationEntity;
import tn.smi.refproject.services.Interface.IDateValeurParOperationService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/DateValeurOperation")
public class DateValeurOperationController {
    private IDateValeurParOperationService iDateValeurParOperationService;
@GetMapping("/get/{id}")
    public DateValeurParOperationEntity getDateValeurParOperationById(@PathVariable Long id) {
        return iDateValeurParOperationService.getDateValeurParOperationById(id);
    }
@GetMapping("/all")
    public List<DateValeurParOperationEntity> getDateValeurParOperations() {
        return iDateValeurParOperationService.getDateValeurParOperations();
    }
}
