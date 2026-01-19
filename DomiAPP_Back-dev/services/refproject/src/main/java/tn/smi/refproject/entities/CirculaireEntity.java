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
@Table(name = "CIRCULAIRE", schema = "REF", catalog = "")
public class CirculaireEntity {
   @EmbeddedId
   private CirculaireEntityPK circulaireEntityPK;
    @Basic
    @Column(name = "TEXTE")
    private String texte;
    @Basic
    @Column(name = "DATE_DEBUT_APPLICATION")
    private LocalDate dateDebutApplication;
    @Basic
    @Column(name = "DATE_FIN_APPLICATION")
    private LocalDate dateFinApplication;






}
