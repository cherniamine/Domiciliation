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
@Table(name = "CLIENT_PROHIBE", schema = "REF", catalog = "")
public class ClientProhibeEntity {

    @EmbeddedId
    private ClientProhibeEntityPK clientProhibeEntityPK;

    @Basic
    @Column(name = "NOM_CLIENT")
    private String nomClient;


}
