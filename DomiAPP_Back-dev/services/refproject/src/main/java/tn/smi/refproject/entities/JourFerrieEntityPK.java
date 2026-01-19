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
public class JourFerrieEntityPK implements Serializable {

    @Column(name = "CODE_PAYS")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private byte codePays;

    @Column(name = "DATE_FERRIE")
    private LocalDate dateFerrie;


}
