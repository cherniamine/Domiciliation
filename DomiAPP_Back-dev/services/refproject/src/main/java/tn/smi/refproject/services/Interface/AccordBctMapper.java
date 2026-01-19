package tn.smi.refproject.services.Interface;

import tn.smi.refproject.DTO.AccordBctRequest;
import tn.smi.refproject.entities.AccordBctEntity;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface AccordBctMapper {

    // Entité -> DTO
    AccordBctRequest toDto(AccordBctEntity entity);

    // DTO -> Entité
    AccordBctEntity toEntity(AccordBctRequest dto);
}
