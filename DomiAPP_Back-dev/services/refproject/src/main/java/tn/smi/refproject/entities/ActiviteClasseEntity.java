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
@Table(name = "ACTIVITE_CLASSE", schema = "REF", catalog = "")
public class ActiviteClasseEntity {
   @EmbeddedId
   private ActiviteClasseEntityPK activiteClasseEntityPK;
    @Basic
    @Column(name = "LIB_CLASSE")
    private String libClasse;


}
