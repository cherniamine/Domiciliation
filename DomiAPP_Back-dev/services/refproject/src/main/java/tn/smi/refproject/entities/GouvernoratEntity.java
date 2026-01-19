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
@Table(name = "GOUVERNORAT", schema = "REF", catalog = "")
public class GouvernoratEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CODE_GOUV")
    private byte codeGouv;
    @Basic
    @Column(name = "LIBELLE_GOUV")
    private String libelleGouv;


}
