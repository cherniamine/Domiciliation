package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CLIENT", schema = "REF")
public class ClientEntity {
    @EmbeddedId
    private ClientEntityPK clientEntityPK;

    @Basic
    @Column(name = "TAXABLE")
    private String taxable;

    @Basic
    @Column(name = "TOTALEMENT_EXPORTATRICE")
    private String totalementExportatrice;

    @Basic
    @Column(name = "RESIDENT_O_N")
    private String residentON;

    @Basic
    @Column(name = "CLIENT_PROHIBE")
    private String clientProhibe;

    @Basic
    @Column(name = "ACTIVITE_SECTION")
    private String activiteSection;

    @Basic
    @Column(name = "ACTIVITE_DIVISION")
    private Byte activiteDivision;

    @Basic
    @Column(name = "ACTIVITE_GROUPE")
    private Byte activiteGroupe;

    @Basic
    @Column(name = "ACTIVITE_CLASSE")
    private Byte activiteClasse;

    @Basic
    @Column(name = "CODE_DOUANE")
    private String codeDouane;

    @Basic
    @Column(name = "ACTIVITE_SECTION_SEC")
    private String activiteSectionSec;

    @Basic
    @Column(name = "ACTIVITE_DIVISION_SEC")
    private Byte activiteDivisionSec;

    @Basic
    @Column(name = "ACTIVITE_GROUPE_SEC")
    private Byte activiteGroupeSec;

    @Basic
    @Column(name = "ACTIVITE_CLASSE_SEC")
    private Byte activiteClasseSec;

    @Basic
    @Column(name = "CODE_SECTEUR_ACTIVITE")
    private String codeSecteurActivite;

    // Set activite fields based on codeSecteurActivite format
    public void setActivitePrincipaleFromSecteur() {
        if (this.codeSecteurActivite != null && !this.codeSecteurActivite.isEmpty()) {
            try {
                this.activiteSection = this.codeSecteurActivite.substring(0, 1);
                this.activiteDivision = Byte.parseByte(this.codeSecteurActivite.substring(1, 3));
                this.activiteGroupe = Byte.parseByte(this.codeSecteurActivite.substring(3, 4));
                this.activiteClasse = Byte.parseByte(this.codeSecteurActivite.substring(4, 5));
            } catch (Exception e) {
                System.err.println("Erreur : Activité Principale Inexistante !");
            }
        }
    }
}
