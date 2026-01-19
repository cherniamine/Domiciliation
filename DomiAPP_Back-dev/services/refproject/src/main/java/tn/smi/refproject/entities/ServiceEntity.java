package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigInteger;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "SERVICE", schema = "REF", catalog = "")
public class ServiceEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CODE_SERVICE")
    private byte codeService;
    @Basic
    @Column(name = "CODE_DIRECTION")
    private Byte codeDirection;
    @Basic
    @Column(name = "LIB_SERVICE")
    private String libService;
    @Basic
    @Column(name = "SIGLE")
    private String sigle;
    @Basic
    @Column(name = "LETTRE_REFINT")
    private String lettreRefint;
    @Basic
    @Column(name = "EXP_IMP")
    private String expImp;
    @Basic
    @Column(name = "DIRECTION_SBE")
    private BigInteger directionSbe;
    @Basic
    @Column(name = "BIC_SWIFT_EMETTEUR")
    private String bicSwiftEmetteur;
    @Basic
    @Column(name = "MAIL_SERVICE")
    private String mailService;


}
