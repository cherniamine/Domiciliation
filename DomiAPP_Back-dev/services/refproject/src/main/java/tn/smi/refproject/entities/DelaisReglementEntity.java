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
@Table(name = "DELAIS_REGLEMENT", schema = "REF", catalog = "")
public class DelaisReglementEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CODE_DEL_REG")
    private long codeDelReg;
    @Basic
    @Column(name = "LIB_DEL_REG")
    private String libDelReg;
    @Basic
    @Column(name = "DELAIS")
    private long delais;
    @Basic
    @Column(name = "PERIODE")
    private String periode;
    @Basic
    @Column(name = "MODE_REG")
    private String modeReg;
    @Basic
    @Column(name = "ORDRE")
    private Byte ordre;


}
