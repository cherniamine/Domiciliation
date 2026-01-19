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
@Table(name = "TITRE", schema = "REF", catalog = "")
public class TitreEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CODE_TITRE")
    private byte codeTitre;
    @Basic
    @Column(name = "LIB_TITRE")
    private String libTitre;
    @Basic
    @Column(name = "DUREE_VAL_TIT")
    private Byte dureeValTit;
    @Basic
    @Column(name = "DUREE_APUREMENT")
    private Byte dureeApurement;
    @Basic
    @Column(name = "NATURE_TITRE")
    private Boolean natureTitre;
    @Basic
    @Column(name = "AUTRE")
    private String autre;
    @Basic
    @Column(name = "TYPE_DATE")
    private String typeDate;


}
