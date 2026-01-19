package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CLT_STE_TOT_EXPORT", schema = "REF", catalog = "")
public class CltSteTotExportEntity {
    @EmbeddedId
    private CltSteTotExportEntityPK cltSteTotExportEntityPK;
    @Basic
    @Column(name = "DATE_DEBUT_EFFET")
    private LocalDate dateDebutEffet;
    @Basic
    @Column(name = "DATE_FIN_EFFET")
    private LocalDate dateFinEffet;


}
