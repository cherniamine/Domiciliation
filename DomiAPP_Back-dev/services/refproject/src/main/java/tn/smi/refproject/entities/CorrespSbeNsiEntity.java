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
@Table(name = "CORRESP_SBE_NSI", schema = "REF", catalog = "")
public class CorrespSbeNsiEntity {
    @EmbeddedId
    private CorrespSbeNsiEntityPK correspSbeNsiEntityPK;


}
