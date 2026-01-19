package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "COURS_JOURS_DEVISE", schema = "REF", catalog = "")
public class CoursJoursDeviseEntity {
    @EmbeddedId
    private CoursJoursDeviseEntityPK coursJoursDeviseEntityPK;
    @Basic
    @Column(name = "COURS_ACHAT")
    private BigDecimal coursAchat;
    @Basic
    @Column(name = "COURS_VENTE")
    private BigDecimal coursVente;
    @Basic
    @Column(name = "DATE_VALEUR")
    private LocalDate dateValeur;
    @Basic
    @Column(name = "DATE_MAJ")
    private LocalDate dateMaj;
    @Basic
    @Column(name = "COURS_VALIDE")
    private String coursValide;


}
