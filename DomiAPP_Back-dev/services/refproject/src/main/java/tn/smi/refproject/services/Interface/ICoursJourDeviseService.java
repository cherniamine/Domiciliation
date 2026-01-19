package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.CoursJoursDeviseEntity;
import tn.smi.refproject.entities.CoursJoursDeviseEntityPK;

import java.util.List;

public interface ICoursJourDeviseService {
    CoursJoursDeviseEntity getCoursJourDeviseById(CoursJoursDeviseEntityPK id);
    List<CoursJoursDeviseEntity>getCoursJourDevises();
}
