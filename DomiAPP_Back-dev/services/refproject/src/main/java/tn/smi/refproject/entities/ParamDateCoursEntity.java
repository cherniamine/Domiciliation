package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.smi.refproject.entities.enumeration.Ssens;
import tn.smi.refproject.entities.enumeration.Type;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PARAM_DATE_COURS", schema = "REF", catalog = "")
public class ParamDateCoursEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    @Column(name = "TYPE")
    @Enumerated(EnumType.STRING)
    private Type type;
    @Basic
    @Column(name = "SENS")
    @Enumerated(EnumType.STRING)
    private Ssens sens;
    @Basic
    @Column(name = "J_X")
    private Byte jX;


}
