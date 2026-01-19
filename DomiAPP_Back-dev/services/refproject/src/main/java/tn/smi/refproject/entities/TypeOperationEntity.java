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
@Table(name = "TYPE_OPERATION", schema = "REF", catalog = "")
public class TypeOperationEntity {
    @EmbeddedId
    private TypeOperationEntityPK typeOperationEntityPK;
    @Basic
    @Column(name = "LIB_TYPE_OPERATION")
    private String libTypeOperation;
    @Basic
    @Column(name = "DECHARGE_O_N")
    private String dechargeON;


}
