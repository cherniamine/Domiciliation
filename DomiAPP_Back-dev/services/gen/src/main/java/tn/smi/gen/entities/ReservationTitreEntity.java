package tn.smi.gen.entities;

import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "RESERVATION_TITRE", schema = "GEN", catalog = "")
public class ReservationTitreEntity {
    @EmbeddedId
    private ReservationTitreEntityPK id;

    @Basic
    @Column(name = "DATE_DOSSIER")
    private Date dateDossier;

    @Basic
    @Column(name = "TYPE_DOSSIER")
    private String typeDossier;

    @Basic
    @Column(name = "CODE_TITRE")
    private Byte codeTitre;

    @Basic
    @Column(name = "NUM_DOM")
    private Integer numDom;

    @Basic
    @Column(name = "DATE_DOM")
    private Date dateDom;

    @Basic
    @Column(name = "CODE_DEVISE")
    private Byte codeDevise;

    @Basic
    @Column(name = "MNT_DEVISE")
    private Long mntDevise;

    @Basic
    @Column(name = "MNT_DINAR")
    private Long mntDinar;

    @Basic
    @Column(name = "CODE_OPERATION")
    private Short codeOperation;

    public ReservationTitreEntityPK getId() {
        return id;
    }

    public void setId(ReservationTitreEntityPK id) {
        this.id = id;
    }

    public Date getDateDossier() {
        return dateDossier;
    }

    public void setDateDossier(Date dateDossier) {
        this.dateDossier = dateDossier;
    }

    public String getTypeDossier() {
        return typeDossier;
    }

    public void setTypeDossier(String typeDossier) {
        this.typeDossier = typeDossier;
    }

    public Byte getCodeTitre() {
        return codeTitre;
    }

    public void setCodeTitre(Byte codeTitre) {
        this.codeTitre = codeTitre;
    }

    public Integer getNumDom() {
        return numDom;
    }

    public void setNumDom(Integer numDom) {
        this.numDom = numDom;
    }

    public Date getDateDom() {
        return dateDom;
    }

    public void setDateDom(Date dateDom) {
        this.dateDom = dateDom;
    }

    public Byte getCodeDevise() {
        return codeDevise;
    }

    public void setCodeDevise(Byte codeDevise) {
        this.codeDevise = codeDevise;
    }

    public Long getMntDevise() {
        return mntDevise;
    }

    public void setMntDevise(Long mntDevise) {
        this.mntDevise = mntDevise;
    }

    public Long getMntDinar() {
        return mntDinar;
    }

    public void setMntDinar(Long mntDinar) {
        this.mntDinar = mntDinar;
    }

    public Short getCodeOperation() {
        return codeOperation;
    }

    public void setCodeOperation(Short codeOperation) {
        this.codeOperation = codeOperation;
    }

    // equals and hashCode based on id field
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReservationTitreEntity that = (ReservationTitreEntity) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
