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
@Table(name = "MODE_DE_REGLEMENT", schema = "REF", catalog = "")
public class ModeDeReglementEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CODE_MOD_REG")
    private long codeModReg;
    @Basic
    @Column(name = "LIB_MOD_REG")
    private String libModReg;
    @Basic
    @Column(name = "DOM")
    private String dom;


}
