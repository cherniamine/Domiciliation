package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "JOUR_FERRIE", schema = "REF", catalog = "")
public class JourFerrieEntity {
    @EmbeddedId
    private JourFerrieEntityPK jourFerrieEntityPK;
    @Basic
    @Column(name = "LIB_FETE")
    private String libFete;
    @Basic
    @Column(name = "SAMEDI")
    private Boolean samedi;
    @Basic
    @Column(name = "DIMANCHE")
    private Boolean dimanche;


}
