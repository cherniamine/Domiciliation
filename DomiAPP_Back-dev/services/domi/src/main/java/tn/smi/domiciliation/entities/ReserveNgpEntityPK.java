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
public class ReserveNgpEntityPK implements Serializable {

    @jakarta.persistence.Column(name = "CODE_NGP")
    private Long codeNgp;

    @jakarta.persistence.Column(name = "CODE_RESERVE")
    private byte codeReserve;

    @jakarta.persistence.Column(name = "NATURE_OPE")
    private String natureOpe;
}
