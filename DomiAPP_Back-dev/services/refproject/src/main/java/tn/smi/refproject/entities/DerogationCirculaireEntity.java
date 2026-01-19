package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.smi.refproject.entities.enumeration.NatureDerogation;
import tn.smi.refproject.entities.enumeration.TypeDerogation;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "DEROGATION_CIRCULAIRE", schema = "REF", catalog = "")
public class DerogationCirculaireEntity implements Serializable {
    @Id
    @Column(name = "CODE_DEROGATION_CIRCULAIRE")
    private String codeDerogationCirculaire;
    @Basic
    @Column(name = "LIBELLE_DEROGATION_CIRCULAIRE")
    private String libelleDerogationCirculaire;
    @Basic
    @Column(name = "TYPE_DEROGATION")
    private TypeDerogation typeDerogation;
    @Basic
    @Column(name = "NATURE_DEROGATION")
    private NatureDerogation natureDerogation;


}
