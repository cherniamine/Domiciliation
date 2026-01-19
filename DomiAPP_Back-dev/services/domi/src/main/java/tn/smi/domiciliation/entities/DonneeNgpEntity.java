package tn.smi.domiciliation.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Date;

@Getter
@Setter
@Entity
@jakarta.persistence.Table(name = "DONNEE_NGP", schema = "DOMI", catalog = "")
public class DonneeNgpEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "CODE_NGP")
    private Long codeNgp;

    @Basic
    @Column(name = "LIB_NGP")
    private String libNgp;

    @Basic
    @Column(name = "CODE_PROH_IMP")
    private String codeProhImp;

    @Basic
    @Column(name = "CODE_PROH_EXP")
    private String codeProhExp;

    @Basic
    @Column(name = "DATE_DEBUT")
    private Date dateDebut;

    @Basic
    @Column(name = "DATE_FIN")
    private Date dateFin;

    @Basic
    @Column(name = "RESTRICTION_IMPORTATEUR")
    private String restrictionImportateur;


    @Basic
    @Column(name = "FLAG_INSERT")
    private Boolean flagInsert;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DonneeNgpEntity that = (DonneeNgpEntity) o;

        if (codeNgp != that.codeNgp) return false;
        if (libNgp != null ? !libNgp.equals(that.libNgp) : that.libNgp != null) return false;
        if (codeProhImp != null ? !codeProhImp.equals(that.codeProhImp) : that.codeProhImp != null) return false;
        if (codeProhExp != null ? !codeProhExp.equals(that.codeProhExp) : that.codeProhExp != null) return false;
        if (dateDebut != null ? !dateDebut.equals(that.dateDebut) : that.dateDebut != null) return false;
        if (dateFin != null ? !dateFin.equals(that.dateFin) : that.dateFin != null) return false;
        if (restrictionImportateur != null ? !restrictionImportateur.equals(that.restrictionImportateur) : that.restrictionImportateur != null)
            return false;
        if (flagInsert != null ? !flagInsert.equals(that.flagInsert) : that.flagInsert != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (codeNgp ^ (codeNgp >>> 32));
        result = 31 * result + (libNgp != null ? libNgp.hashCode() : 0);
        result = 31 * result + (codeProhImp != null ? codeProhImp.hashCode() : 0);
        result = 31 * result + (codeProhExp != null ? codeProhExp.hashCode() : 0);
        result = 31 * result + (dateDebut != null ? dateDebut.hashCode() : 0);
        result = 31 * result + (dateFin != null ? dateFin.hashCode() : 0);
        result = 31 * result + (restrictionImportateur != null ? restrictionImportateur.hashCode() : 0);
        result = 31 * result + (flagInsert != null ? flagInsert.hashCode() : 0);
        return result;
    }
}
