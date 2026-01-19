package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.refproject.entities.DechargeDocumentsEntity;

public interface DechargeDocumentRepository extends JpaRepository<DechargeDocumentsEntity,Short> {
}
