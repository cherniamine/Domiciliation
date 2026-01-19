package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class ActiviteDivisionEntityPK implements Serializable {

    @Column(name = "SECTION")
    private String section;

    @Column(name = "DIVISION")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private byte division;






}
