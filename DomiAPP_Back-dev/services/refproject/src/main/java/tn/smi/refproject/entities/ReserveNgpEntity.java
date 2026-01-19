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
@Table(name = "RESERVE_NGP", schema = "REF", catalog = "")
public class ReserveNgpEntity {
    @EmbeddedId
    private ReserveNgpEntityPK reserveNgpEntityPK;
    @Basic
    @Column(name = "DATE_INSERTION")
    private LocalDate dateInsertion;


}
