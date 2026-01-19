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
@Table(name = "UNITE", schema = "REF", catalog = "")
public class UniteEntity implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CODE_UNITE")
    private long codeUnite;
    @Basic
    @Column(name = "LIB_UNITE")
    private String libUnite;
    @Basic
    @Column(name = "NOM_FORME")
    private String nomForme;


}
