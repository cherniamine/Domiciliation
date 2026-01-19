package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.ParamDateCoursEntity;
import tn.smi.refproject.repository.ParamDateCoursRepository;
import tn.smi.refproject.services.Interface.IParamDateCoursService;

import java.util.List;

@Service
@AllArgsConstructor
public class ParamDateCoursService implements IParamDateCoursService {
    private ParamDateCoursRepository paramDateCoursRepository;
    @Override
    public ParamDateCoursEntity getParamDateCoursById(Long id) {
        return paramDateCoursRepository.findById(id).orElse(null);
    }

    @Override
    public List<ParamDateCoursEntity> getParamDateCourss() {
        return paramDateCoursRepository.findAll();
    }
}
