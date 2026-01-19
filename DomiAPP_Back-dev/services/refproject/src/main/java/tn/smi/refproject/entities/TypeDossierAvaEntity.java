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
@Table(name = "TYPE_DOSSIER_AVA", schema = "REF", catalog = "")
public class TypeDossierAvaEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    @Column(name = "CODE_TYPE_DOS_AVA")
    private Byte codeTypeDosAva;
    @Basic
    @Column(name = "LIB_TYPE_DOS_AVA")
    private String libTypeDosAva;
    @Basic
    @Column(name = "SEUIL_MINIMUM")
    private Long seuilMinimum;
    @Basic
    @Column(name = "SEUIL_MAXIMUM")
    private Long seuilMaximum;
    @Basic
    @Column(name = "DROIT_MINIMUM")
    private Long droitMinimum;
    @Basic
    @Column(name = "TAUX_AVA")
    private Integer tauxAva;
    @Basic
    @Column(name = "DROIT_MAXIMUM")
    private Long droitMaximum;
    @Basic
    @Column(name = "ANNEE_CIRCULAIRE")
    private Short anneeCirculaire;
    @Basic
    @Column(name = "NUMERO_CIRCULAIRE")
    private Short numeroCirculaire;
    @Basic
    @Column(name = "DATE_APPLICATION")
    private LocalDate dateApplication;
    @Basic
    @Column(name = "DATE_FIN_APPLICATION")
    private LocalDate dateFinApplication;
    @Basic
    @Column(name = "STATUS")
    private String status;
    @Basic
    @Column(name = "AVANCE_O_N")
    private String avanceON;
    @Basic
    @Column(name = "TAUX_AVANCE_MAX")
    private Integer tauxAvanceMax;
    @Basic
    @Column(name = "NBR_AVANCE")
    private Byte nbrAvance;
    @Basic
    @Column(name = "DATE_AVANCE_MAX")
    private LocalDate dateAvanceMax;
    @Basic
    @Column(name = "DATE_ANNIVERSAIRE")
    private LocalDate dateAnniversaire;
    @Basic
    @Column(name = "DATE_ULTIME_DECL_CA")
    private LocalDate dateUltimeDeclCa;
    @Basic
    @Column(name = "ANNUEL_O_N")
    private String annuelON;
    @Basic
    @Column(name = "RENOUVELLEMENT_AUTO_O_N")
    private String renouvellementAutoON;


}
