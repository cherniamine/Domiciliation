package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class CoursJoursDeviseEntityPK implements Serializable {

    @Column(name = "DATE_COURS")
    private LocalDate dateCours=LocalDate.now();

    @Column(name = "CODE_DEVISE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codeDevise;


}
