package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "COM_SUR_CRP_PALLIER", schema = "REF", catalog = "")
public class ComSurCrpPallierEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    @Column(name = "CODE_COMMISSION")
    private Short codeCommission;
    @Basic
    @Column(name = "SEUIL_MINIMUM")
    private BigDecimal seuilMinimum;
    @Basic
    @Column(name = "SEUIL_MAXIMUM")
    private BigDecimal seuilMaximum;
    @Basic
    @Column(name = "MNT_COMMISSION")
    private Long mntCommission;
    @Basic
    @Column(name = "TAUX_COMMISSION")
    private Integer tauxCommission;


}
