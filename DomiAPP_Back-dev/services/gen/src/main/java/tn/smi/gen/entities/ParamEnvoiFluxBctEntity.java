package tn.smi.gen.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "PARAM_ENVOI_FLUX_BCT", schema = "GEN", catalog = "")
public class ParamEnvoiFluxBctEntity {
    @Basic
    @Column(name = "FREQUENCE")
    private String frequence;
    @Basic
    @Column(name = "HEURE")
    private String heure;
    @Basic
    @Column(name = "TYPE_PERIODICITE")
    private String typePeriodicite;
    @Basic
    @Column(name = "VALEUR_PERIODICITE")
    private Byte valeurPeriodicite;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "DOMAINE")
    private String domaine;

    public String getFrequence() {
        return frequence;
    }

    public void setFrequence(String frequence) {
        this.frequence = frequence;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public String getTypePeriodicite() {
        return typePeriodicite;
    }

    public void setTypePeriodicite(String typePeriodicite) {
        this.typePeriodicite = typePeriodicite;
    }

    public Byte getValeurPeriodicite() {
        return valeurPeriodicite;
    }

    public void setValeurPeriodicite(Byte valeurPeriodicite) {
        this.valeurPeriodicite = valeurPeriodicite;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ParamEnvoiFluxBctEntity that = (ParamEnvoiFluxBctEntity) o;

        if (frequence != null ? !frequence.equals(that.frequence) : that.frequence != null) return false;
        if (heure != null ? !heure.equals(that.heure) : that.heure != null) return false;
        if (typePeriodicite != null ? !typePeriodicite.equals(that.typePeriodicite) : that.typePeriodicite != null)
            return false;
        if (valeurPeriodicite != null ? !valeurPeriodicite.equals(that.valeurPeriodicite) : that.valeurPeriodicite != null)
            return false;
        if (domaine != null ? !domaine.equals(that.domaine) : that.domaine != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = frequence != null ? frequence.hashCode() : 0;
        result = 31 * result + (heure != null ? heure.hashCode() : 0);
        result = 31 * result + (typePeriodicite != null ? typePeriodicite.hashCode() : 0);
        result = 31 * result + (valeurPeriodicite != null ? valeurPeriodicite.hashCode() : 0);
        result = 31 * result + (domaine != null ? domaine.hashCode() : 0);
        return result;
    }
}
