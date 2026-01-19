package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CONDITION_PAR_CORRESPONDANT", schema = "REF", catalog = "")
public class ConditionParCorrespondantEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    @Column(name = "CODE_CORRESPONDANT")
    private Short codeCorrespondant;
    @Basic
    @Column(name = "CODE_COMMISSION")
    private Integer codeCommission;
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
    private Date dateCreation;
    @Basic
    @Column(name = "CODE_SERVICE")
    private Byte codeService;


}
