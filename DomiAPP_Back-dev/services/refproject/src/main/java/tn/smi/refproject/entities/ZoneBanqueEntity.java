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
@Table(name = "ZONE_BANQUE", schema = "REF", catalog = "")
public class ZoneBanqueEntity {

    @EmbeddedId
    private ZoneBanqueEntityPK zoneBanqueEntityPK;
    @Basic
    @Column(name = "LIB_ZONE")
    private String libZone;


}
