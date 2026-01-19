package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.smi.refproject.entities.enumeration.CentrePerception;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PRELEVER", schema = "REF", catalog = "")
public class PreleverEntity  {
    @EmbeddedId
    private PreleverEntityPK preleverEntityPK;
    @Basic
    @Column(name = "CENTRE_PERCEPTION")
    @Enumerated(EnumType.STRING)
    private CentrePerception centrePerception;


}
