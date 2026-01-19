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
@Table(name = "REGIME_STAT_TITRE", schema = "REF", catalog = "")
public class RegimeStatTitreEntity {
    @EmbeddedId
    private RegimeStatTitreEntityPK regimeStatTitreEntityPK;
    @Basic
    @Column(name = "DATE_FIN_APPLICATION")
    private LocalDate dateFinApplication;


}
