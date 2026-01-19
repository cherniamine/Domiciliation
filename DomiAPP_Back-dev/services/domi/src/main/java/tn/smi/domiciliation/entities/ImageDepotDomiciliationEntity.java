package tn.smi.domiciliation.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Date;

@Getter
@Entity
@Setter
@NoArgsConstructor
@AllArgsConstructor
@jakarta.persistence.Table(name = "IMAGE_DEPOT_DOMICILIATION", schema = "DOMI", catalog = "")
public class ImageDepotDomiciliationEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "ID_TCE")
    private int idTce;

    @Basic
    @Column(name = "CODE_AGENCE")
    private Byte codeAgence;

    @Basic
    @Column(name = "TYPE_PIECE_CLIENT")
    private Boolean typePieceClient;


    @Basic
    @Column(name = "NO_PIECE_CLIENT")
    private String noPieceClient;


    @Basic
    @Column(name = "NUM_COMPTE")
    private String numCompte;


    @Basic
    @Column(name = "REGIME_SECTEUR_ACTIVITE")
    private String regimeSecteurActivite;



    @Basic
    @Column(name = "ACTIVITE_PRINCIPALE_SECONDAIRE")
    private String activitePrincipaleSecondaire;



    @Basic
    @Column(name = "CODE_SECTEUR_ACTIVITE")
    private String codeSecteurActivite;


    @Basic
    @Column(name = "CODE_SECTEUR_ACTIVITE_SEC")
    private String codeSecteurActiviteSec;



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
    @Column(name = "NUM_DEPOT")
    private Integer numDepot;


    @Basic
    @Column(name = "DATE_DEPOT")
    private Date dateDepot;


    @Basic
    @Column(name = "NUMERO_DOSSIER")
    private String numeroDossier;


    @Basic
    @Column(name = "NUMERO_DEMANDE")
    private String numeroDemande;


    @Basic
    @Column(name = "NUM_CONTRAT_COM")
    private String numContratCom;


    @Basic
    @Column(name = "DATE_CONTRAT_COM")
    private Date dateContratCom;


    @Basic
    @Column(name = "CODE_DEVISE")
    private Byte codeDevise;


    @Basic
    @Column(name = "MNT_DVS_PTFN_FACT")
    private Long mntDvsPtfnFact;


    @Basic
    @Column(name = "MNT_DVS_FOB_FACT")
    private Long mntDvsFobFact;


    @Basic
    @Column(name = "MNT_TND_FOB")
    private Long mntTndFob;


    @Basic
    @Column(name = "MNT_TND_PTFN")
    private Long mntTndPtfn;


    @Basic
    @Column(name = "ACOMPTE")
    private Byte acompte;


    @Basic
    @Column(name = "NOM_FOURNISSEUR")
    private String nomFournisseur;


    @Basic
    @Column(name = "ADR_FOURNISSEUR")
    private String adrFournisseur;


    @Basic
    @Column(name = "NOM_CLIENT")
    private String nomClient;



    @Basic
    @Column(name = "ADR_CLIENT")
    private String adrClient;


    @Basic
    @Column(name = "COD_PAY_ACH")
    private Byte codPayAch;


    @Basic
    @Column(name = "COD_PAY_PROV")
    private Byte codPayProv;


    @Basic
    @Column(name = "COD_PAY_ORIG")
    private Byte codPayOrig;


    @Basic
    @Column(name = "CODE_PAYS_DEST_DEF")
    private Byte codePaysDestDef;


    @Basic
    @Column(name = "CODE_MOD_LIV")
    private Byte codeModLiv;


    @Basic
    @Column(name = "CODE_MOD_REG")
    private Byte codeModReg;


    @Basic
    @Column(name = "CODE_DEL_REG")
    private Byte codeDelReg;


    @Basic
    @Column(name = "REGIME_STAT")
    private Byte regimeStat;


    @Basic
    @Column(name = "NBR_COLIS")
    private Short nbrColis;


    @Basic
    @Column(name = "TYPE_ACCORD_BCT")
    private String typeAccordBct;


    @Basic
    @Column(name = "NUM_ACCORD_BCT")
    private String numAccordBct;


    @Basic
    @Column(name = "DATE_ACCORD_BCT")
    private Date dateAccordBct;


    @Basic
    @Column(name = "NUM_COTUNAS")
    private Integer numCotunas;


    @Basic
    @Column(name = "DATE_COTUNAS")
    private Date dateCotunas;


    @Basic
    @Column(name = "DATE_VALIDITE")
    private Date dateValidite;


    @Basic
    @Column(name = "DATE_APUREMENT")
    private Date dateApurement;


    @Basic
    @Column(name = "OBSERVATION")
    private String observation;


    @Basic
    @Column(name = "CODE_ENVOI_SPECIAL")
    private String codeEnvoiSpecial;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImageDepotDomiciliationEntity that = (ImageDepotDomiciliationEntity) o;

        if (idTce != that.idTce) return false;
        if (codeAgence != null ? !codeAgence.equals(that.codeAgence) : that.codeAgence != null) return false;
        if (typePieceClient != null ? !typePieceClient.equals(that.typePieceClient) : that.typePieceClient != null)
            return false;
        if (noPieceClient != null ? !noPieceClient.equals(that.noPieceClient) : that.noPieceClient != null)
            return false;
        if (numCompte != null ? !numCompte.equals(that.numCompte) : that.numCompte != null) return false;
        if (regimeSecteurActivite != null ? !regimeSecteurActivite.equals(that.regimeSecteurActivite) : that.regimeSecteurActivite != null)
            return false;
        if (activitePrincipaleSecondaire != null ? !activitePrincipaleSecondaire.equals(that.activitePrincipaleSecondaire) : that.activitePrincipaleSecondaire != null)
            return false;
        if (codeSecteurActivite != null ? !codeSecteurActivite.equals(that.codeSecteurActivite) : that.codeSecteurActivite != null)
            return false;
        if (codeSecteurActiviteSec != null ? !codeSecteurActiviteSec.equals(that.codeSecteurActiviteSec) : that.codeSecteurActiviteSec != null)
            return false;
        if (codeTitre != null ? !codeTitre.equals(that.codeTitre) : that.codeTitre != null) return false;
        if (numDom != null ? !numDom.equals(that.numDom) : that.numDom != null) return false;
        if (dateDom != null ? !dateDom.equals(that.dateDom) : that.dateDom != null) return false;
        if (numDepot != null ? !numDepot.equals(that.numDepot) : that.numDepot != null) return false;
        if (dateDepot != null ? !dateDepot.equals(that.dateDepot) : that.dateDepot != null) return false;
        if (numeroDossier != null ? !numeroDossier.equals(that.numeroDossier) : that.numeroDossier != null)
            return false;
        if (numeroDemande != null ? !numeroDemande.equals(that.numeroDemande) : that.numeroDemande != null)
            return false;
        if (numContratCom != null ? !numContratCom.equals(that.numContratCom) : that.numContratCom != null)
            return false;
        if (dateContratCom != null ? !dateContratCom.equals(that.dateContratCom) : that.dateContratCom != null)
            return false;
        if (codeDevise != null ? !codeDevise.equals(that.codeDevise) : that.codeDevise != null) return false;
        if (mntDvsPtfnFact != null ? !mntDvsPtfnFact.equals(that.mntDvsPtfnFact) : that.mntDvsPtfnFact != null)
            return false;
        if (mntDvsFobFact != null ? !mntDvsFobFact.equals(that.mntDvsFobFact) : that.mntDvsFobFact != null)
            return false;
        if (mntTndFob != null ? !mntTndFob.equals(that.mntTndFob) : that.mntTndFob != null) return false;
        if (mntTndPtfn != null ? !mntTndPtfn.equals(that.mntTndPtfn) : that.mntTndPtfn != null) return false;
        if (acompte != null ? !acompte.equals(that.acompte) : that.acompte != null) return false;
        if (nomFournisseur != null ? !nomFournisseur.equals(that.nomFournisseur) : that.nomFournisseur != null)
            return false;
        if (adrFournisseur != null ? !adrFournisseur.equals(that.adrFournisseur) : that.adrFournisseur != null)
            return false;
        if (nomClient != null ? !nomClient.equals(that.nomClient) : that.nomClient != null) return false;
        if (adrClient != null ? !adrClient.equals(that.adrClient) : that.adrClient != null) return false;
        if (codPayAch != null ? !codPayAch.equals(that.codPayAch) : that.codPayAch != null) return false;
        if (codPayProv != null ? !codPayProv.equals(that.codPayProv) : that.codPayProv != null) return false;
        if (codPayOrig != null ? !codPayOrig.equals(that.codPayOrig) : that.codPayOrig != null) return false;
        if (codePaysDestDef != null ? !codePaysDestDef.equals(that.codePaysDestDef) : that.codePaysDestDef != null)
            return false;
        if (codeModLiv != null ? !codeModLiv.equals(that.codeModLiv) : that.codeModLiv != null) return false;
        if (codeModReg != null ? !codeModReg.equals(that.codeModReg) : that.codeModReg != null) return false;
        if (codeDelReg != null ? !codeDelReg.equals(that.codeDelReg) : that.codeDelReg != null) return false;
        if (regimeStat != null ? !regimeStat.equals(that.regimeStat) : that.regimeStat != null) return false;
        if (nbrColis != null ? !nbrColis.equals(that.nbrColis) : that.nbrColis != null) return false;
        if (typeAccordBct != null ? !typeAccordBct.equals(that.typeAccordBct) : that.typeAccordBct != null)
            return false;
        if (numAccordBct != null ? !numAccordBct.equals(that.numAccordBct) : that.numAccordBct != null) return false;
        if (dateAccordBct != null ? !dateAccordBct.equals(that.dateAccordBct) : that.dateAccordBct != null)
            return false;
        if (numCotunas != null ? !numCotunas.equals(that.numCotunas) : that.numCotunas != null) return false;
        if (dateCotunas != null ? !dateCotunas.equals(that.dateCotunas) : that.dateCotunas != null) return false;
        if (dateValidite != null ? !dateValidite.equals(that.dateValidite) : that.dateValidite != null) return false;
        if (dateApurement != null ? !dateApurement.equals(that.dateApurement) : that.dateApurement != null)
            return false;
        if (observation != null ? !observation.equals(that.observation) : that.observation != null) return false;
        if (codeEnvoiSpecial != null ? !codeEnvoiSpecial.equals(that.codeEnvoiSpecial) : that.codeEnvoiSpecial != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTce;
        result = 31 * result + (codeAgence != null ? codeAgence.hashCode() : 0);
        result = 31 * result + (typePieceClient != null ? typePieceClient.hashCode() : 0);
        result = 31 * result + (noPieceClient != null ? noPieceClient.hashCode() : 0);
        result = 31 * result + (numCompte != null ? numCompte.hashCode() : 0);
        result = 31 * result + (regimeSecteurActivite != null ? regimeSecteurActivite.hashCode() : 0);
        result = 31 * result + (activitePrincipaleSecondaire != null ? activitePrincipaleSecondaire.hashCode() : 0);
        result = 31 * result + (codeSecteurActivite != null ? codeSecteurActivite.hashCode() : 0);
        result = 31 * result + (codeSecteurActiviteSec != null ? codeSecteurActiviteSec.hashCode() : 0);
        result = 31 * result + (codeTitre != null ? codeTitre.hashCode() : 0);
        result = 31 * result + (numDom != null ? numDom.hashCode() : 0);
        result = 31 * result + (dateDom != null ? dateDom.hashCode() : 0);
        result = 31 * result + (numDepot != null ? numDepot.hashCode() : 0);
        result = 31 * result + (dateDepot != null ? dateDepot.hashCode() : 0);
        result = 31 * result + (numeroDossier != null ? numeroDossier.hashCode() : 0);
        result = 31 * result + (numeroDemande != null ? numeroDemande.hashCode() : 0);
        result = 31 * result + (numContratCom != null ? numContratCom.hashCode() : 0);
        result = 31 * result + (dateContratCom != null ? dateContratCom.hashCode() : 0);
        result = 31 * result + (codeDevise != null ? codeDevise.hashCode() : 0);
        result = 31 * result + (mntDvsPtfnFact != null ? mntDvsPtfnFact.hashCode() : 0);
        result = 31 * result + (mntDvsFobFact != null ? mntDvsFobFact.hashCode() : 0);
        result = 31 * result + (mntTndFob != null ? mntTndFob.hashCode() : 0);
        result = 31 * result + (mntTndPtfn != null ? mntTndPtfn.hashCode() : 0);
        result = 31 * result + (acompte != null ? acompte.hashCode() : 0);
        result = 31 * result + (nomFournisseur != null ? nomFournisseur.hashCode() : 0);
        result = 31 * result + (adrFournisseur != null ? adrFournisseur.hashCode() : 0);
        result = 31 * result + (nomClient != null ? nomClient.hashCode() : 0);
        result = 31 * result + (adrClient != null ? adrClient.hashCode() : 0);
        result = 31 * result + (codPayAch != null ? codPayAch.hashCode() : 0);
        result = 31 * result + (codPayProv != null ? codPayProv.hashCode() : 0);
        result = 31 * result + (codPayOrig != null ? codPayOrig.hashCode() : 0);
        result = 31 * result + (codePaysDestDef != null ? codePaysDestDef.hashCode() : 0);
        result = 31 * result + (codeModLiv != null ? codeModLiv.hashCode() : 0);
        result = 31 * result + (codeModReg != null ? codeModReg.hashCode() : 0);
        result = 31 * result + (codeDelReg != null ? codeDelReg.hashCode() : 0);
        result = 31 * result + (regimeStat != null ? regimeStat.hashCode() : 0);
        result = 31 * result + (nbrColis != null ? nbrColis.hashCode() : 0);
        result = 31 * result + (typeAccordBct != null ? typeAccordBct.hashCode() : 0);
        result = 31 * result + (numAccordBct != null ? numAccordBct.hashCode() : 0);
        result = 31 * result + (dateAccordBct != null ? dateAccordBct.hashCode() : 0);
        result = 31 * result + (numCotunas != null ? numCotunas.hashCode() : 0);
        result = 31 * result + (dateCotunas != null ? dateCotunas.hashCode() : 0);
        result = 31 * result + (dateValidite != null ? dateValidite.hashCode() : 0);
        result = 31 * result + (dateApurement != null ? dateApurement.hashCode() : 0);
        result = 31 * result + (observation != null ? observation.hashCode() : 0);
        result = 31 * result + (codeEnvoiSpecial != null ? codeEnvoiSpecial.hashCode() : 0);
        return result;
    }
}
