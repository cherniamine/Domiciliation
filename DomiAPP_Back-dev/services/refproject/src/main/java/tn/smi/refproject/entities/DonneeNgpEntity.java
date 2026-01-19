package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "DONNEE_NGP", schema = "REF", catalog = "")
public class DonneeNgpEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CODE_NGP")
    private long codeNgp;
    @Basic
    @Column(name = "LIB_NGP")
    private String libNgp;
    @Basic
    @Column(name = "CODE_PROH_IMP")
    private String codeProhImp;
    @Basic
    @Column(name = "CODE_PROH_EXP")
    private String codeProhExp;
    @Basic
    @Column(name = "DATE_FIN")
    private LocalDate dateFin;
    @Basic
    @Column(name = "RESTRICTION_IMPORTATEUR")
    private String restrictionImportateur;
    @Basic
    @Column(name = "FLAG_INSERT")
    private Boolean flagInsert;
    @Basic
    @Column(name = "DATE_DEBUT")
    private LocalDate dateDebut;


}
