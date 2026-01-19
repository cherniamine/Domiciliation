package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ACTIVITE_GROUPE", schema = "REF", catalog = "")
public class ActiviteGroupeEntity {
    @EmbeddedId
    private ActiviteGroupeEntityPK activiteGroupeEntityPK;
    @Basic
    @Column(name = "LIB_GROUPE")
    private String libGroupe;


}
