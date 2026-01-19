package tn.smi.domiciliation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.domiciliation.entities.TitreEntity;

public interface TitreRepository extends JpaRepository<TitreEntity,Byte> {
}
