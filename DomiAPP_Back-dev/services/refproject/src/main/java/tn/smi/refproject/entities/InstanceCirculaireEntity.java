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
@Table(name = "INSTANCE_CIRCULAIRE", schema = "REF", catalog = "")
public class InstanceCirculaireEntity implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CODE_INSTANCE")
    private short codeInstance;

    @Basic
    @Column(name = "LIB_INSTANCE")
    private String libInstance;


}
