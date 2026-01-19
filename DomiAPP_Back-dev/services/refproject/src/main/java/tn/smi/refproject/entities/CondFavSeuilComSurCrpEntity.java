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
@Table(name = "COND_FAV_SEUIL_COM_SUR_CRP", schema = "REF", catalog = "")
public class CondFavSeuilComSurCrpEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    @Column(name = "CODE_COMMISSION")
    private Short codeCommission;
    @Basic
    @Column(name = "CODE_DEVISE")
    private Byte codeDevise;
    @Basic
    @Column(name = "CODE_CORRESPONDANT")
    private Short codeCorrespondant;
    @Basic
    @Column(name = "SEUIL_MINIMUM")
    private Integer seuilMinimum;
    @Basic
    @Column(name = "SEUIL_MAXIMUM")
    private Integer seuilMaximum;
    @Basic
    @Column(name = "MNT_COMMISSION")
    private Integer mntCommission;


}
