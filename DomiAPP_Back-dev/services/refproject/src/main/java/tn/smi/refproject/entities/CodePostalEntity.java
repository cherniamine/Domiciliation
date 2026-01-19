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
@Table(name = "CODE_POSTAL", schema = "REF", catalog = "")
public class CodePostalEntity {
    @EmbeddedId
    private CodePostalEntityPK codePostalEntityPK;
    @Basic
    @Column(name = "BUREAU")
    private String bureau;




}
