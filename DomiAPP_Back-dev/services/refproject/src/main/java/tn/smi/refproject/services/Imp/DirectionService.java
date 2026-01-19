package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.smi.refproject.entities.DirectionEntity;
import tn.smi.refproject.repository.DirectionRepository;
import tn.smi.refproject.services.Interface.IDirectionService;

import java.util.List;

@Service
@AllArgsConstructor
public class DirectionService implements IDirectionService {
    private DirectionRepository directionRepository;
    @Override
    public DirectionEntity getDirectionById(Byte id) {
        return directionRepository.findById(id).orElse(null);
    }

    @Override
    public List<DirectionEntity> getDirections() {
        return directionRepository.findAll();
    }
}
