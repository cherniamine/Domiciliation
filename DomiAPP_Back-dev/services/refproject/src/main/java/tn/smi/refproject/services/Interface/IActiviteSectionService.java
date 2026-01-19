package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.ActiviteSectionEntity;

import java.util.List;

public interface IActiviteSectionService {
    ActiviteSectionEntity getActiviteSectionById(String id);
    List<ActiviteSectionEntity> getActiviteSections();

}
