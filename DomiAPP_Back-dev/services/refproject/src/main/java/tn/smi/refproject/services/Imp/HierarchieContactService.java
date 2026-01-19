package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.HierarchieContactEntity;
import tn.smi.refproject.repository.HierarchieContactRepository;
import tn.smi.refproject.services.Interface.IHierarchieContactService;

import java.util.List;

@Service
@AllArgsConstructor
public class HierarchieContactService implements IHierarchieContactService {
    private HierarchieContactRepository hierarchieContactRepository;
    @Override
    public HierarchieContactEntity getHierarchieContactById(Long id) {
        return hierarchieContactRepository.findById(id).orElse(null);
    }

    @Override
    public List<HierarchieContactEntity> getHierarchieContacts() {
        return hierarchieContactRepository.findAll();
    }
}
