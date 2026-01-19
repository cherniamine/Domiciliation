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
@Table(name = "REGIME_STAT", schema = "REF", catalog = "")
public class RegimeStatEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CODE_REGIME_STAT")
    private Long codeRegimeStat;
    @Basic
    @Column(name = "LIB_REGIME_STAT")
    private String libRegimeStat;


}
