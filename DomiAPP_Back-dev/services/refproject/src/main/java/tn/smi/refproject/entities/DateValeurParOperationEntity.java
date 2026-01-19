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
@Table(name = "DATE_VALEUR_PAR_OPERATION", schema = "REF", catalog = "")
public class DateValeurParOperationEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    @Column(name = "TYPE_PIECE_CLIENT")
    private Boolean typePieceClient;
    @Basic
    @Column(name = "NO_PIECE_CLIENT")
    private String noPieceClient;
    @Basic
    @Column(name = "TYPE_DOSSIER")
    private String typeDossier;
    @Basic
    @Column(name = "NUM_DOSSIER")
    private Integer numDossier;
    @Basic
    @Column(name = "DATE_DOSSIER")
    private LocalDate dateDossier;
    @Basic
    @Column(name = "JOUR_VALEUR_DEBIT")
    private Byte jourValeurDebit;
    @Basic
    @Column(name = "JOUR_VALEUR_CREDIT")
    private Byte jourValeurCredit;


}
