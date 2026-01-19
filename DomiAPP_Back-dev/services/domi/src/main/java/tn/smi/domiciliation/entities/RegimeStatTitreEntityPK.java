package tn.smi.domiciliation.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class RegimeStatTitreEntityPK implements Serializable {

    @jakarta.persistence.Column(name = "CODE_TITRE")
    private byte codeTitre;

    @jakarta.persistence.Column(name = "CODE_REGIME_STAT")
    private byte codeRegimeStat;
}
