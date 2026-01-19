package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.HierarchieContactEntity;
import tn.smi.refproject.services.Interface.IHierarchieContactService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ref/HierarchieContact")
public class HierarchieContactController {
    private IHierarchieContactService iHierarchieContactService;
@GetMapping("/get/{id}")
    public HierarchieContactEntity getHierarchieContactById(@PathVariable Long id) {
        return iHierarchieContactService.getHierarchieContactById(id);
    }
@GetMapping("/all")
    public List<HierarchieContactEntity> getHierarchieContacts() {
        return iHierarchieContactService.getHierarchieContacts();
    }
}
