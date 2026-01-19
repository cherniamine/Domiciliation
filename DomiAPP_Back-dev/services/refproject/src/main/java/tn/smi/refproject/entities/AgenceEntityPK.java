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
public class AgenceEntityPK implements Serializable {

    @Column(name = "CODE_BANQUE")
    private Short codeBanque;

    @Column(name = "CODE_AGENCE_BCT")
    private Short codeAgenceBct;


}
