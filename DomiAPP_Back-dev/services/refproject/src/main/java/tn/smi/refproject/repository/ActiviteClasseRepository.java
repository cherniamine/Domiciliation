package tn.smi.refproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.refproject.entities.ActiviteClasseEntity;
import tn.smi.refproject.entities.ActiviteClasseEntityPK;

import java.util.Optional;

public interface ActiviteClasseRepository extends JpaRepository<ActiviteClasseEntity, ActiviteClasseEntityPK> {
    Optional<ActiviteClasseEntity> findByActiviteClasseEntityPK_CodeSectionAndActiviteClasseEntityPK_CodeDivisionAndActiviteClasseEntityPK_CodeGroupeAndActiviteClasseEntityPK_CodeClasse(
            String codeSection, Byte codeDivision, Integer codeGroupe, Integer codeClasse);



}


