package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ACTIVITE_DIVISION", schema = "REF", catalog = "")
public class ActiviteDivisionEntity {

    @EmbeddedId
    private ActiviteDivisionEntityPK activiteDivisionEntityPK;

    @Basic
    @Column(name = "LIB_DIVISION")
    private String libDivision;




}
