package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.ParamDateCoursEntity;

import java.util.List;

public interface IParamDateCoursService {
    ParamDateCoursEntity getParamDateCoursById(Long id);
    List<ParamDateCoursEntity>getParamDateCourss();
}
