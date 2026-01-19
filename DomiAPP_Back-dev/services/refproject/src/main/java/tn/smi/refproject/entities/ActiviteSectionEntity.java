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
@Table(name = "ACTIVITE_SECTION", schema = "REF", catalog = "")
public class ActiviteSectionEntity implements Serializable {

    @Id
    @Column(name = "CODE_SECTION")
    private String codeSection;

    @Basic
    @Column(name = "LIBELLE_SECTION")
    private String libelleSection;

}
