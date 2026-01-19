package tn.smi.domiciliation.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class DepotDomiciliationTitreEntityPK implements Serializable {

    @Column(name = "CODE_PRODUIT_SERVICE")
    private short codeProduitService;
    @Column(name = "CODE_OPERATION")
    private byte codeOperation;
    @Column(name = "DATE_OPERATION")
    private LocalDate dateOperation=LocalDate.now();
    @Column(name = "REF_OPERATION")
    private int refOperation;

}
