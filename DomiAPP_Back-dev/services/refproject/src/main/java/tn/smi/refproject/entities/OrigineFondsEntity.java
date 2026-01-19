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
@Table(name = "ORIGINE_FONDS", schema = "REF", catalog = "")
public class OrigineFondsEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CODE_ORIGINE")
    private byte codeOrigine;
    @Basic
    @Column(name = "LIB_ORIGINE")
    private String libOrigine;


}
