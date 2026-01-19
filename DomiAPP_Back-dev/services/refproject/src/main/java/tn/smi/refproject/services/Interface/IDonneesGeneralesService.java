package tn.smi.refproject.services.Interface;

import tn.smi.refproject.entities.DonneesGeneralesEntity;

import java.util.List;

public interface IDonneesGeneralesService {
    DonneesGeneralesEntity getDonneesGeneralesByid(Byte id);
    List<DonneesGeneralesEntity>getDonneesGeneraless();
}
