package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.HierarchieContactEntity;

import java.util.List;

public interface IHierarchieContactService {
    HierarchieContactEntity getHierarchieContactById(Long id);
    List<HierarchieContactEntity>getHierarchieContacts();
}
