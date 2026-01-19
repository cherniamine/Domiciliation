package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PERSONNE", schema = "REF", catalog = "")
public class PersonneEntity {
    @EmbeddedId
    private PersonneEntityPK personneEntityPK;

    @Basic
    @Column(name = "DATE_DEL_PIECE")
    private Date dateDelPiece;
    @Basic
    @Column(name = "LIEU_DEL_PIECE")
    private String lieuDelPiece;
    @Basic
    @Column(name = "NOM")
    private String nom;
    @Basic
    @Column(name = "PRENOM")
    private String prenom;
    @Basic
    @Column(name = "ADR_RES_1")
    private String adrRes1;
    @Basic
    @Column(name = "ADR_RES_2")
    private String adrRes2;
    @Basic
    @Column(name = "ADR_RES_3")
    private String adrRes3;
    @Basic
    @Column(name = "ADR_RES_4")
    private String adrRes4;
    @Basic
    @Column(name = "NATIONALITE")
    private String nationalite;
    @Basic
    @Column(name = "TELEPHONE")
    private String telephone;
    @Basic
    @Column(name = "EMAIL")
    private String email;
    @Basic
    @Column(name = "DATE_CREATION")
    private Date dateCreation;
    @Basic
    @Column(name = "TYP_REF_CLT_INT")
    private String typRefCltInt;
    @Basic
    @Column(name = "NUM_REF_CLT_INT")
    private String numRefCltInt;


}
