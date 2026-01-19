package tn.smi.domiciliation.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

@jakarta.persistence.Table(name = "REGIME_STAT_TITRE", schema = "DOMI", catalog = "")
public class RegimeStatTitreEntity {
    @EmbeddedId
    private RegimeStatTitreEntityPK regimeStatTitreEntityPK;

    @Basic
    @Column(name = "DATE_FIN_APPLICATION")
    private Date dateFinApplication;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        RegimeStatTitreEntity that = (RegimeStatTitreEntity) o;
//
//        if (codeTitre != that.codeTitre) return false;
//        if (codeRegimeStat != that.codeRegimeStat) return false;
//        if (dateFinApplication != null ? !dateFinApplication.equals(that.dateFinApplication) : that.dateFinApplication != null)
//            return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = (int) codeTitre;
//        result = 31 * result + (int) codeRegimeStat;
//        result = 31 * result + (dateFinApplication != null ? dateFinApplication.hashCode() : 0);
//        return result;
//    }
}
