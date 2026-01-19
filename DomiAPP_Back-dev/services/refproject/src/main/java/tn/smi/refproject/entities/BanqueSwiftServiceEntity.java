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
@Table(name = "BANQUE_SWIFT_SERVICE", schema = "REF", catalog = "")
public class BanqueSwiftServiceEntity {
    @EmbeddedId
    private BanqueSwiftServiceEntityPK banqueSwiftServiceEntityPK;
    @Basic
    @Column(name = "LIBELLE_SERVICE")
    private String libelleService;
    @Basic
    @Column(name = "NUM_SWIFT")
    private String numSwift;
}
