package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.CompteInt2Entity;

import java.util.List;

public interface ICompteInt2Service {
    CompteInt2Entity getCompteInt2ById(Long id);
    List<CompteInt2Entity> getCompteInt2s();
}
