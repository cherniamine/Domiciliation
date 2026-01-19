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
@Table(name = "TYPE_OPERATION_COMMISSION", schema = "REF", catalog = "")
public class TypeOperationCommissionEntity {
    @EmbeddedId
    private TypeOperationCommissionEntityPK typeOperationCommissionEntityPK;
    @Basic
    @Column(name = "LIB_TYPE_OPERATION")
    private String libTypeOperation;
}
