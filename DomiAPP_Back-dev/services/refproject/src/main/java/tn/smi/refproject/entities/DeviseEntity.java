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
@Table(name = "DEVISE", schema = "REF", catalog = "")
public class DeviseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODE_DEVISE")
    private Long codeDevise;

    @Basic
    @Column(name = "SIGLE_DEVISE", nullable = false)
    private String sigleDevise;

    @Basic
    @Column(name = "LIB_DEVISE")
    private String libDevise;

    @Basic
    @Column(name = "UNITE_DEVISE")
    private Short uniteDevise;

    @Basic
    @Column(name = "DECIMAL_DEVISE")
    private Integer decimalDevise;

    @Basic
    @Column(name = "QUOTE")
    private String quote;

    @Basic
    @Column(name = "CODE_ISO")
    private String codeIso;
}
