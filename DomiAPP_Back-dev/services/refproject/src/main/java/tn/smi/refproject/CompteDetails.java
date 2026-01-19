package tn.smi.refproject;

import lombok.*;

import java.math.BigInteger;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CompteDetails {
    private BigInteger cleRib;
    private BigInteger codeAgenceBct;
    private String racineCompte;
}
