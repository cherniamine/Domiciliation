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
public class PaysNgpEntityPK implements Serializable {

    @Column(name = "CODE_NGP")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codeNgp;

    @Column(name = "CODE_PAYS")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private byte codePays;


}
