package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "MODE_PAIEMENT", schema = "REF", catalog = "")
public class ModePaiementEntity implements Serializable {
    @Id
    @Column(name = "CODE_MODE_PAIEMENT")
    private String codeModePaiement;
    @Basic
    @Column(name = "LIB_MODE_PAIEMENT")
    private String libModePaiement;


}
