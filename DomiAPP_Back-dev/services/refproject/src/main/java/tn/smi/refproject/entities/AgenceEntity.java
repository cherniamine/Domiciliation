package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "AGENCE", schema = "REF", catalog = "")
public class AgenceEntity {

    @EmbeddedId
    private AgenceEntityPK agenceEntityPK;

    @Basic
    @Column(name = "LIB_AGENCE", nullable = true)
    private String libAgence;

    @Basic
    @Column(name = "TYPE_AGENCE", nullable = true)
    private String typeAgence;

    @Basic
    @Column(name = "CODE_LOCALITE", nullable = true)
    private Integer codeLocalite;

    @Basic
    @Column(name = "ADRESSE_AGENCE", nullable = true)
    private String adresseAgence;

    @Basic
    @Column(name = "INDICATIF_TEL", nullable = true)
    private Short indicatifTel;

    @Basic
    @Column(name = "NUMERO_TEL", nullable = true)
    private Integer numeroTel;

    @Basic
    @Column(name = "CODE_AGENCE_BNA", nullable = true)
    private Short codeAgenceBna;

    @Basic
    @Column(name = "CODE_BCT", nullable = true)
    private String codeBct;

    @Basic
    @Column(name = "EMAIL", nullable = true)
    private String email;

    @Basic
    @Column(name = "CODE_ZONE_AGENCE", nullable = true)
    private Short codeZoneAgence;
}
