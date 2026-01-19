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
@Table(name = "PAYS", schema = "REF", catalog = "")
public class PaysEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CODE_PAYS")
    private long codePays;
    @Basic
    @Column(name = "SIGLE_PAYS")
    private String siglePays;
    @Basic
    @Column(name = "LIB_PAYS")
    private String libPays;
    @Basic
    @Column(name = "NATIONALITE")
    private String nationalite;
    @Basic
    @Column(name = "CODE_CONTINENT")
    private String codeContinent;
    @Basic
    @Column(name = "CODE_ZONE")
    private Byte codeZone;
    @Basic
    @Column(name = "CONVENTION")
    private String convention;
    @Basic
    @Column(name = "LISTE")
    private String liste;
    @Basic
    @Column(name = "LUN")
    private String lun;
    @Basic
    @Column(name = "MAR")
    private String mar;
    @Basic
    @Column(name = "MER")
    private String mer;
    @Basic
    @Column(name = "JEU")
    private String jeu;
    @Basic
    @Column(name = "VEN")
    private String ven;
    @Basic
    @Column(name = "SAM")
    private String sam;
    @Basic
    @Column(name = "DIM")
    private String dim;
    @Basic
    @Column(name = "LANGUE")
    private String langue;
    @Basic
    @Column(name = "CODE_PAYS_ISO")
    private String codePaysIso;
    @Basic
    @Column(name = "CODE_ISO")
    private String codeIso;


}
