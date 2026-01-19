package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.GouvernoratEntity;

import java.util.List;

public interface IGouvernoratService {
    GouvernoratEntity getGouvernorat(Byte id);
    List<GouvernoratEntity>getGouvernorats();
}
