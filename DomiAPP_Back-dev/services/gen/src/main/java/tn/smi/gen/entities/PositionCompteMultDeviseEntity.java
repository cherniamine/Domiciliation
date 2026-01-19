package tn.smi.gen.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "POSITION_COMPTE_MULT_DEVISE", schema = "GEN", catalog = "")
public class PositionCompteMultDeviseEntity {

    @EmbeddedId
    private PositionCompteMultDeviseEntityPK id;

    @Basic
    @Column(name = "CODE_PRODUIT_SERVICE")
    private Short codeProduitService;

    @Basic
    @Column(name = "DATE_OPERATION")
    private Date dateOperation;
    @Basic
    @Column(name = "REF_OPERATION")
    private Integer refOperation;
    @Basic
    @Column(name = "UNITE_OPERATION")
    private Byte uniteOperation;
    @Basic
    @Column(name = "CODE_DEVISE")
    private Byte codeDevise;
    @Basic
    @Column(name = "MNT_DEVISE")
    private BigDecimal mntDevise;
    @Basic
    @Column(name = "TYPE_PIECE_CLIENT")
    private Boolean typePieceClient;
    @Basic
    @Column(name = "NO_PIECE_CLIENT")
    private String noPieceClient;
    @Basic
    @Column(name = "DATE_VALEUR")
    private Date dateValeur;
    @Basic
    @Column(name = "NUM_GENERATION")
    private Long numGeneration;
    @Basic
    @Column(name = "DATE_GENERATION")
    private Date dateGeneration;
    @Basic
    @Column(name = "CODE_SERVICE")
    private Byte codeService;
    @Basic
    @Column(name = "NUM_DOSSIER")
    private Integer numDossier;
    @Basic
    @Column(name = "DATE_DOSSIER")
    private Date dateDossier;
    @Basic
    @Column(name = "LIBELLE_MOUVEMENT")
    private String libelleMouvement;
    @Basic
    @Column(name = "CODE_AGENCE_BNA")
    private Long codeAgenceBna;
    @Basic
    @Column(name = "COMPTE_GENERAL")
    private Short compteGeneral;
    @Basic
    @Column(name = "SOUS_COMPTE")
    private Integer sousCompte;
    @Basic
    @Column(name = "CLE_COMPTE")
    private String cleCompte;
    @Basic
    @Column(name = "DEVISE_COMPTE")
    private Byte deviseCompte;
    @Basic
    @Column(name = "SENS")
    private String sens;
    @Basic
    @Column(name = "FLAG_TRAIT")
    private String flagTrait;
    @Basic
    @Column(name = "MOTIF_REJET")
    private String motifRejet;
    @Basic
    @Column(name = "NOM_RELATION")
    private String nomRelation;
    @Basic
    @Column(name = "PRENOM_RELATION")
    private String prenomRelation;
    @Basic
    @Column(name = "TYPE_DOSSIER")
    private String typeDossier;
    @Basic
    @Column(name = "CODE_PRODUIT_SERVICE_ORIG")
    private Short codeProduitServiceOrig;
    @Basic
    @Column(name = "CODE_OPERATION_ORIG")
    private Integer codeOperationOrig;
    @Basic
    @Column(name = "CODE_COMMISSION")
    private Short codeCommission;
    @Basic
    @Column(name = "ORIG_MVT_CPT")
    private String origMvtCpt;
    @Basic
    @Column(name = "REF_INTERSIEGE")
    private String refIntersiege;
    @Basic
    @Column(name = "NUM_OPER_OMP")
    private String numOperOmp;
    @Basic
    @Column(name = "NUM_ID_CRO")
    private Integer numIdCro;
    @Basic
    @Column(name = "DATE_JOURNEE")
    private Date dateJournee;

    public Short getCodeProduitService() {
        return codeProduitService;
    }

    public void setCodeProduitService(Short codeProduitService) {
        this.codeProduitService = codeProduitService;
    }



    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public Integer getRefOperation() {
        return refOperation;
    }

    public void setRefOperation(Integer refOperation) {
        this.refOperation = refOperation;
    }

    public Byte getUniteOperation() {
        return uniteOperation;
    }

    public void setUniteOperation(Byte uniteOperation) {
        this.uniteOperation = uniteOperation;
    }

    public Byte getCodeDevise() {
        return codeDevise;
    }

    public void setCodeDevise(Byte codeDevise) {
        this.codeDevise = codeDevise;
    }

    public BigDecimal getMntDevise() {
        return mntDevise;
    }

    public void setMntDevise(BigDecimal mntDevise) {
        this.mntDevise = mntDevise;
    }

    public Boolean getTypePieceClient() {
        return typePieceClient;
    }

    public void setTypePieceClient(Boolean typePieceClient) {
        this.typePieceClient = typePieceClient;
    }

    public String getNoPieceClient() {
        return noPieceClient;
    }

    public void setNoPieceClient(String noPieceClient) {
        this.noPieceClient = noPieceClient;
    }

    public Date getDateValeur() {
        return dateValeur;
    }

    public void setDateValeur(Date dateValeur) {
        this.dateValeur = dateValeur;
    }

    public Long getNumGeneration() {
        return numGeneration;
    }

    public void setNumGeneration(Long numGeneration) {
        this.numGeneration = numGeneration;
    }

    public Date getDateGeneration() {
        return dateGeneration;
    }

    public void setDateGeneration(Date dateGeneration) {
        this.dateGeneration = dateGeneration;
    }

    public Byte getCodeService() {
        return codeService;
    }

    public void setCodeService(Byte codeService) {
        this.codeService = codeService;
    }

    public Integer getNumDossier() {
        return numDossier;
    }

    public void setNumDossier(Integer numDossier) {
        this.numDossier = numDossier;
    }

    public Date getDateDossier() {
        return dateDossier;
    }

    public void setDateDossier(Date dateDossier) {
        this.dateDossier = dateDossier;
    }

    public String getLibelleMouvement() {
        return libelleMouvement;
    }

    public void setLibelleMouvement(String libelleMouvement) {
        this.libelleMouvement = libelleMouvement;
    }

    public Long getCodeAgenceBna() {
        return codeAgenceBna;
    }

    public void setCodeAgenceBna(Long codeAgenceBna) {
        this.codeAgenceBna = codeAgenceBna;
    }

    public Short getCompteGeneral() {
        return compteGeneral;
    }

    public void setCompteGeneral(Short compteGeneral) {
        this.compteGeneral = compteGeneral;
    }

    public Integer getSousCompte() {
        return sousCompte;
    }

    public void setSousCompte(Integer sousCompte) {
        this.sousCompte = sousCompte;
    }

    public String getCleCompte() {
        return cleCompte;
    }

    public void setCleCompte(String cleCompte) {
        this.cleCompte = cleCompte;
    }

    public Byte getDeviseCompte() {
        return deviseCompte;
    }

    public void setDeviseCompte(Byte deviseCompte) {
        this.deviseCompte = deviseCompte;
    }

    public String getSens() {
        return sens;
    }

    public void setSens(String sens) {
        this.sens = sens;
    }

    public String getFlagTrait() {
        return flagTrait;
    }

    public void setFlagTrait(String flagTrait) {
        this.flagTrait = flagTrait;
    }

    public String getMotifRejet() {
        return motifRejet;
    }

    public void setMotifRejet(String motifRejet) {
        this.motifRejet = motifRejet;
    }

    public String getNomRelation() {
        return nomRelation;
    }

    public void setNomRelation(String nomRelation) {
        this.nomRelation = nomRelation;
    }

    public String getPrenomRelation() {
        return prenomRelation;
    }

    public void setPrenomRelation(String prenomRelation) {
        this.prenomRelation = prenomRelation;
    }



    public String getTypeDossier() {
        return typeDossier;
    }

    public void setTypeDossier(String typeDossier) {
        this.typeDossier = typeDossier;
    }

    public Short getCodeProduitServiceOrig() {
        return codeProduitServiceOrig;
    }

    public void setCodeProduitServiceOrig(Short codeProduitServiceOrig) {
        this.codeProduitServiceOrig = codeProduitServiceOrig;
    }

    public Integer getCodeOperationOrig() {
        return codeOperationOrig;
    }

    public void setCodeOperationOrig(Integer codeOperationOrig) {
        this.codeOperationOrig = codeOperationOrig;
    }

    public Short getCodeCommission() {
        return codeCommission;
    }

    public void setCodeCommission(Short codeCommission) {
        this.codeCommission = codeCommission;
    }

    public String getOrigMvtCpt() {
        return origMvtCpt;
    }

    public void setOrigMvtCpt(String origMvtCpt) {
        this.origMvtCpt = origMvtCpt;
    }

    public String getRefIntersiege() {
        return refIntersiege;
    }

    public void setRefIntersiege(String refIntersiege) {
        this.refIntersiege = refIntersiege;
    }

    public String getNumOperOmp() {
        return numOperOmp;
    }

    public void setNumOperOmp(String numOperOmp) {
        this.numOperOmp = numOperOmp;
    }

    public Integer getNumIdCro() {
        return numIdCro;
    }

    public void setNumIdCro(Integer numIdCro) {
        this.numIdCro = numIdCro;
    }

    public Date getDateJournee() {
        return dateJournee;
    }

    public void setDateJournee(Date dateJournee) {
        this.dateJournee = dateJournee;
    }

    public PositionCompteMultDeviseEntityPK getId() {
        return id;
    }

    public void setId(PositionCompteMultDeviseEntityPK id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PositionCompteMultDeviseEntity that = (PositionCompteMultDeviseEntity) o;

        return Objects.equals(codeProduitService, that.codeProduitService) &&
                Objects.equals(id, that.id) &&
                Objects.equals(dateOperation, that.dateOperation) &&
                Objects.equals(refOperation, that.refOperation) &&
                Objects.equals(uniteOperation, that.uniteOperation) &&
                Objects.equals(codeDevise, that.codeDevise) &&
                Objects.equals(mntDevise, that.mntDevise) &&
                Objects.equals(typePieceClient, that.typePieceClient) &&
                Objects.equals(noPieceClient, that.noPieceClient) &&
                Objects.equals(dateValeur, that.dateValeur) &&
                Objects.equals(numGeneration, that.numGeneration) &&
                Objects.equals(dateGeneration, that.dateGeneration) &&
                Objects.equals(codeService, that.codeService) &&
                Objects.equals(numDossier, that.numDossier) &&
                Objects.equals(dateDossier, that.dateDossier) &&
                Objects.equals(libelleMouvement, that.libelleMouvement) &&
                Objects.equals(codeAgenceBna, that.codeAgenceBna) &&
                Objects.equals(compteGeneral, that.compteGeneral) &&
                Objects.equals(sousCompte, that.sousCompte) &&
                Objects.equals(cleCompte, that.cleCompte) &&
                Objects.equals(deviseCompte, that.deviseCompte) &&
                Objects.equals(sens, that.sens) &&
                Objects.equals(flagTrait, that.flagTrait) &&
                Objects.equals(motifRejet, that.motifRejet) &&
                Objects.equals(nomRelation, that.nomRelation) &&
                Objects.equals(prenomRelation, that.prenomRelation) &&
                Objects.equals(typeDossier, that.typeDossier) &&
                Objects.equals(codeProduitServiceOrig, that.codeProduitServiceOrig) &&
                Objects.equals(codeOperationOrig, that.codeOperationOrig) &&
                Objects.equals(codeCommission, that.codeCommission) &&
                Objects.equals(origMvtCpt, that.origMvtCpt) &&
                Objects.equals(refIntersiege, that.refIntersiege) &&
                Objects.equals(numOperOmp, that.numOperOmp) &&
                Objects.equals(numIdCro, that.numIdCro) &&
                Objects.equals(dateJournee, that.dateJournee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                codeProduitService, id, dateOperation, refOperation, uniteOperation,
                codeDevise, mntDevise, typePieceClient, noPieceClient, dateValeur, numGeneration,
                dateGeneration, codeService, numDossier, dateDossier, libelleMouvement, codeAgenceBna,
                compteGeneral, sousCompte, cleCompte, deviseCompte, sens, flagTrait, motifRejet,
                nomRelation, prenomRelation, typeDossier, codeProduitServiceOrig,
                codeOperationOrig, codeCommission, origMvtCpt, refIntersiege, numOperOmp,
                numIdCro, dateJournee);
    }
}
