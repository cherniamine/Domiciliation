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
@Table(name = "HIERARCHIE_CONTACT", schema = "REF", catalog = "")
public class HierarchieContactEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    @Column(name = "CODE_DIRECTION_CENTRALE")
    private Short codeDirectionCentrale;
    @Basic
    @Column(name = "CODE_DORECTION")
    private Short codeDorection;
    @Basic
    @Column(name = "CODE_SOUS_DIRECTION")
    private Short codeSousDirection;
    @Basic
    @Column(name = "CODE_SERVICE")
    private Short codeService;
    @Basic
    @Column(name = "CONTACT_MAIL")
    private String contactMail;
    @Basic
    @Column(name = "CONTACT_TEL")
    private Integer contactTel;
    @Basic
    @Column(name = "LIB_DIRECTION_CENTRALE")
    private String libDirectionCentrale;
    @Basic
    @Column(name = "LIB_DIRECTION")
    private String libDirection;
    @Basic
    @Column(name = "LIB_SOUS_DIRECTION")
    private String libSousDirection;
    @Basic
    @Column(name = "LIB_SERVICE")
    private String libService;
    @Basic
    @Column(name = "MAT_RESPONSABLE_SERVICE")
    private Short matResponsableService;
    @Basic
    @Column(name = "LIB_DIRECTION_CENTRALE_ENG")
    private String libDirectionCentraleEng;
    @Basic
    @Column(name = "LIB_DIRECTION_ENG")
    private String libDirectionEng;
    @Basic
    @Column(name = "LIB_SOUS_DIRECTION_ENG")
    private String libSousDirectionEng;
    @Basic
    @Column(name = "LIB_SERVICE_ENG")
    private String libServiceEng;


}
