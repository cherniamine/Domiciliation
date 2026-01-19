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
import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class DetailPDepotEntityPK implements Serializable {

    @jakarta.persistence.Column(name = "CODE_PRODUIT_SERVICE")
    private short codeProduitService;

    @jakarta.persistence.Column(name = "CODE_OPERATION")
    private byte codeOperation;

    @jakarta.persistence.Column(name = "DATE_OPERATION")
    private Date dateOperation;

    @jakarta.persistence.Column(name = "REF_OPERATION")
    private int refOperation;

    @jakarta.persistence.Column(name = "NUM_RBQ")
    private int numRbq;
}
