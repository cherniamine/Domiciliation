package tn.smi.domiciliation.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TITRE", schema = "DOMI", catalog = "")
public class TitreEntity implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CODE_TITRE")
    private byte codeTitre;
    @Basic
    @Column(name = "LIB_TITRE")
    private String libTitre;
    @Basic
    @Column(name = "DUREE_VAL_TIT")
    private Byte dureeValTit;
    @Basic
    @Column(name = "DUREE_APUREMENT")
    private Byte dureeApurement;
    @Basic
    @Column(name = "NATURE_TITRE")
    private Boolean natureTitre;
    @Basic
    @Column(name = "AUTRE")
    private String autre;
    @Basic
    @Column(name = "TYPE_DATE")
    private String typeDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TitreEntity that = (TitreEntity) o;

        if (codeTitre != that.codeTitre) return false;
        if (libTitre != null ? !libTitre.equals(that.libTitre) : that.libTitre != null) return false;
        if (dureeValTit != null ? !dureeValTit.equals(that.dureeValTit) : that.dureeValTit != null) return false;
        if (dureeApurement != null ? !dureeApurement.equals(that.dureeApurement) : that.dureeApurement != null)
            return false;
        if (natureTitre != null ? !natureTitre.equals(that.natureTitre) : that.natureTitre != null) return false;
        if (autre != null ? !autre.equals(that.autre) : that.autre != null) return false;
        if (typeDate != null ? !typeDate.equals(that.typeDate) : that.typeDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) codeTitre;
        result = 31 * result + (libTitre != null ? libTitre.hashCode() : 0);
        result = 31 * result + (dureeValTit != null ? dureeValTit.hashCode() : 0);
        result = 31 * result + (dureeApurement != null ? dureeApurement.hashCode() : 0);
        result = 31 * result + (natureTitre != null ? natureTitre.hashCode() : 0);
        result = 31 * result + (autre != null ? autre.hashCode() : 0);
        result = 31 * result + (typeDate != null ? typeDate.hashCode() : 0);
        return result;
    }
}
