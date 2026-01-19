package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "COMMISSION_PAR_TYPE", schema = "REF", catalog = "")
public class CommissionParTypeEntity implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CODE_COMMISSION")
    private short codeCommission;

    @Basic
    @Column(name = "CODE_TYPE_COM")
    private Boolean codeTypeCom;
    @Basic
    @Column(name = "CODE_COMMISSION_SOCKET")
    private String codeCommissionSocket;
    @Basic
    @Column(name = "CODE_COM_DAVE")
    private String codeComDave;


}
