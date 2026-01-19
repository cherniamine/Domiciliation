package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CONDITION_PAR_OPERATION", schema = "REF", catalog = "")
public class ConditionParOperationEntity {
    @EmbeddedId
    private ConditionParOperationEntityPK conditionParOperationEntityPK;
    @Basic
    @Column(name = "TAUX_1")
    private Short taux1;
    @Basic
    @Column(name = "AUTRES")
    private Long autres;
    @Basic
    @Column(name = "VALEUR_MIN")
    private Long valeurMin;
    @Basic
    @Column(name = "VALEUR_MAX")
    private Long valeurMax;
    @Basic
    @Column(name = "MARGE")
    private String marge;
    @Basic
    @Column(name = "MAT_EMP")
    private Integer matEmp;
    @Basic
    @Column(name = "DATE_CREATION")
    private LocalDate dateCreation;
    @Basic
    @Column(name = "CODE_SERVICE")
    private Byte codeService;
    @Basic
    @Column(name = "CODE_CORRESPONDANT")
    private Short codeCorrespondant;


}
