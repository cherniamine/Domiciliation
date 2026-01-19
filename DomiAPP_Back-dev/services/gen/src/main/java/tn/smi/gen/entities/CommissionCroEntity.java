package tn.smi.gen.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "COMMISSION_CRO", schema = "GEN", catalog = "")
public class CommissionCroEntity {
    @EmbeddedId
    private CommissionCroEntityPK id;

    @Basic
    @Column(name = "UNITE_OPERATION")
    private Byte uniteOperation;


    @Basic
    @Column(name = "NUM_DOSSIER")
    private Integer numDossier;
    @Basic
    @Column(name = "DATE_DOSSIER")
    private Date dateDossier;
    @Basic
    @Column(name = "TYPE_DOSSIER")
    private String typeDossier;
    @Basic
    @Column(name = "CODE_SERVICE")
    private Byte codeService;
    @Basic
    @Column(name = "CODE_COMMISSION")
    private Integer codeCommission;
    @Basic
    @Column(name = "CODE_TYPE_COMMISSION")
    private Boolean codeTypeCommission;
    @Basic
    @Column(name = "CODE_TYPE_COM")
    private Boolean codeTypeCom;
    @Basic
    @Column(name = "ACHAT_VENTE")
    private String achatVente;
    @Basic
    @Column(name = "CODE_DEVISE")
    private Byte codeDevise;
    @Basic
    @Column(name = "MNT_COMMISSION")
    private BigDecimal mntCommission;
    @Basic
    @Column(name = "MNT_TVA")
    private BigDecimal mntTva;
    @Basic
    @Column(name = "MNT_COMMISSION_DVS")
    private BigDecimal mntCommissionDvs;
    @Basic
    @Column(name = "MNT_TVA_DVS")
    private BigDecimal mntTvaDvs;
    @Basic
    @Column(name = "CODE_TVA")
    private Byte codeTva;
    @Basic
    @Column(name = "TYPE_PIECE_CLIENT")
    private Boolean typePieceClient;
    @Basic
    @Column(name = "NO_PIECE_CLIENT")
    private String noPieceClient;
    @Basic
    @Column(name = "CODE_AGENCE_BCT")
    private Byte codeAgenceBct;
    @Basic
    @Column(name = "RACINE_COMPTE")
    private String racineCompte;
    @Basic
    @Column(name = "CLE_RIB")
    private Byte cleRib;
    @Basic
    @Column(name = "NUM_REF_BNA")
    private String numRefBna;
    @Basic
    @Column(name = "BENEF_DO_REF_BNA")
    private String benefDoRefBna;
    @Basic
    @Column(name = "CODE_TITRE_BCT")
    private Byte codeTitreBct;
    @Basic
    @Column(name = "NUM_ID_BCT")
    private String numIdBct;
    @Basic
    @Column(name = "DATE_BCT")
    private Date dateBct;
    @Basic
    @Column(name = "CODE_PAYS_BCT")
    private Byte codePaysBct;
    @Basic
    @Column(name = "NATURE_OPERATION_BCT")
    private Integer natureOperationBct;
    @Basic
    @Column(name = "ANNEE_BCT")
    private Short anneeBct;
    @Basic
    @Column(name = "CODE_OPERATEUR_BCT")
    private String codeOperateurBct;
    @Basic
    @Column(name = "CODE_CORRESPONDANT")
    private Short codeCorrespondant;
    @Basic
    @Column(name = "BNA_CRP")
    private String bnaCrp;
    @Basic
    @Column(name = "COMPTABILISATION")
    private String comptabilisation;
    @Basic
    @Column(name = "STATUS")
    private String status;
    @Basic
    @Column(name = "DATE_JOURNEE")
    private Date dateJournee;
    @Basic
    @Column(name = "DATE_PRELEVER")
    private Date datePrelever;
    @Basic
    @Column(name = "DATE_ORDRE_A_V")
    private Date dateOrdreAV;
    @Basic
    @Column(name = "DATE_A_V")
    private Date dateAV;
    @Basic
    @Column(name = "DATE_COMPTABILISATION")
    private Date dateComptabilisation;
    @Basic
    @Column(name = "DATE_A_COMPTABILISER")
    private Date dateAComptabiliser;
    @Basic
    @Column(name = "DATE_VALEUR")
    private Date dateValeur;
    @Basic
    @Column(name = "CODE_BNQ_NEGOC")
    private Byte codeBnqNegoc;
    @Basic
    @Column(name = "NUMERO_ORDRE")
    private Integer numeroOrdre;
    @Basic
    @Column(name = "DATE_DU")
    private Date dateDu;
    @Basic
    @Column(name = "DATE_AU")
    private Date dateAu;
    @Basic
    @Column(name = "PROCHAINE_MLEVEE")
    private Date prochaineMlevee;
    @Basic
    @Column(name = "NB_TRIM")
    private Byte nbTrim;
    @Basic
    @Column(name = "PHASE")
    private String phase;
    @Basic
    @Column(name = "CODE_PRODUIT_SERVICE_ORIG")
    private Short codeProduitServiceOrig;
    @Basic
    @Column(name = "CODE_OPERATION_ORIG")
    private Short codeOperationOrig;
    @Basic
    @Column(name = "REF_OPERATION_ORIG")
    private Integer refOperationOrig;
    @Basic
    @Column(name = "DATE_OPERATION_ORIG")
    private Date dateOperationOrig;
    @Basic
    @Column(name = "CODE_OPR_DAVE")
    private String codeOprDave;
    @Basic
    @Column(name = "COM_SUR_CLT_CRP")
    private String comSurCltCrp;
    @Basic
    @Column(name = "ANNEE_EXERCICE")
    private Short anneeExercice;
    @Basic
    @Column(name = "MOIS_EXERCICE")
    private Byte moisExercice;
    @Basic
    @Column(name = "ANC_MNT_COMMISSION")
    private BigDecimal ancMntCommission;
    @Basic
    @Column(name = "ANC_MNT_TVA")
    private BigDecimal ancMntTva;
    @Basic
    @Column(name = "ANC_MNT_COMMISSION_DVS")
    private BigDecimal ancMntCommissionDvs;
    @Basic
    @Column(name = "ANC_MNT_TVA_DVS")
    private BigDecimal ancMntTvaDvs;
    @Basic
    @Column(name = "COMPTE_INTERNE")
    private String compteInterne;
    @Basic
    @Column(name = "COMPTE_COMMISSION")
    private String compteCommission;
    @Basic
    @Column(name = "COMPTE_TVA")
    private String compteTva;
    @Basic
    @Column(name = "UNITE_OPERATION_ORIG")
    private Byte uniteOperationOrig;
    @Basic
    @Column(name = "TAUX")
    private Integer taux;
    @Basic
    @Column(name = "AUTRE")
    private Integer autre;
    @Basic
    @Column(name = "PERIODE_COM")
    private String periodeCom;
    @Basic
    @Column(name = "JOUR_NON_CALCUL")
    private Short jourNonCalcul;
    @Basic
    @Column(name = "MINIMUM")
    private Integer minimum;
    @Basic
    @Column(name = "MAXIMUM")
    private Integer maximum;
    @Basic
    @Column(name = "ASSIETTE")
    private BigDecimal assiette;
    @Basic
    @Column(name = "NUM_DOSSIER_ORIGINE")
    private Integer numDossierOrigine;
    @Basic
    @Column(name = "DATE_DOSSIER_ORIGINE")
    private Date dateDossierOrigine;
    @Basic
    @Column(name = "NUM_DOSSIER_ORIG")
    private Integer numDossierOrig;
    @Basic
    @Column(name = "DATE_DOSSIER_ORIG")
    private Date dateDossierOrig;
    @Basic
    @Column(name = "REF_TRAITEMENT")
    private Integer refTraitement;
    @Basic
    @Column(name = "DATE_TRAITEMENT")
    private Date dateTraitement;

    public CommissionCroEntityPK getId() {
        return id;
    }

    public void setId(CommissionCroEntityPK id) {
        this.id = id;
    }



    public Byte getUniteOperation() {
        return uniteOperation;
    }

    public void setUniteOperation(Byte uniteOperation) {
        this.uniteOperation = uniteOperation;
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

    public String getTypeDossier() {
        return typeDossier;
    }

    public void setTypeDossier(String typeDossier) {
        this.typeDossier = typeDossier;
    }

    public Byte getCodeService() {
        return codeService;
    }

    public void setCodeService(Byte codeService) {
        this.codeService = codeService;
    }

    public Integer getCodeCommission() {
        return codeCommission;
    }

    public void setCodeCommission(Integer codeCommission) {
        this.codeCommission = codeCommission;
    }

    public Boolean getCodeTypeCommission() {
        return codeTypeCommission;
    }

    public void setCodeTypeCommission(Boolean codeTypeCommission) {
        this.codeTypeCommission = codeTypeCommission;
    }

    public Boolean getCodeTypeCom() {
        return codeTypeCom;
    }

    public void setCodeTypeCom(Boolean codeTypeCom) {
        this.codeTypeCom = codeTypeCom;
    }

    public String getAchatVente() {
        return achatVente;
    }

    public void setAchatVente(String achatVente) {
        this.achatVente = achatVente;
    }

    public Byte getCodeDevise() {
        return codeDevise;
    }

    public void setCodeDevise(Byte codeDevise) {
        this.codeDevise = codeDevise;
    }

    public BigDecimal getMntCommission() {
        return mntCommission;
    }

    public void setMntCommission(BigDecimal mntCommission) {
        this.mntCommission = mntCommission;
    }

    public BigDecimal getMntTva() {
        return mntTva;
    }

    public void setMntTva(BigDecimal mntTva) {
        this.mntTva = mntTva;
    }

    public BigDecimal getMntCommissionDvs() {
        return mntCommissionDvs;
    }

    public void setMntCommissionDvs(BigDecimal mntCommissionDvs) {
        this.mntCommissionDvs = mntCommissionDvs;
    }

    public BigDecimal getMntTvaDvs() {
        return mntTvaDvs;
    }

    public void setMntTvaDvs(BigDecimal mntTvaDvs) {
        this.mntTvaDvs = mntTvaDvs;
    }

    public Byte getCodeTva() {
        return codeTva;
    }

    public void setCodeTva(Byte codeTva) {
        this.codeTva = codeTva;
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

    public Byte getCodeAgenceBct() {
        return codeAgenceBct;
    }

    public void setCodeAgenceBct(Byte codeAgenceBct) {
        this.codeAgenceBct = codeAgenceBct;
    }

    public String getRacineCompte() {
        return racineCompte;
    }

    public void setRacineCompte(String racineCompte) {
        this.racineCompte = racineCompte;
    }

    public Byte getCleRib() {
        return cleRib;
    }

    public void setCleRib(Byte cleRib) {
        this.cleRib = cleRib;
    }

    public String getNumRefBna() {
        return numRefBna;
    }

    public void setNumRefBna(String numRefBna) {
        this.numRefBna = numRefBna;
    }

    public String getBenefDoRefBna() {
        return benefDoRefBna;
    }

    public void setBenefDoRefBna(String benefDoRefBna) {
        this.benefDoRefBna = benefDoRefBna;
    }

    public Byte getCodeTitreBct() {
        return codeTitreBct;
    }

    public void setCodeTitreBct(Byte codeTitreBct) {
        this.codeTitreBct = codeTitreBct;
    }

    public String getNumIdBct() {
        return numIdBct;
    }

    public void setNumIdBct(String numIdBct) {
        this.numIdBct = numIdBct;
    }

    public Date getDateBct() {
        return dateBct;
    }

    public void setDateBct(Date dateBct) {
        this.dateBct = dateBct;
    }

    public Byte getCodePaysBct() {
        return codePaysBct;
    }

    public void setCodePaysBct(Byte codePaysBct) {
        this.codePaysBct = codePaysBct;
    }

    public Integer getNatureOperationBct() {
        return natureOperationBct;
    }

    public void setNatureOperationBct(Integer natureOperationBct) {
        this.natureOperationBct = natureOperationBct;
    }

    public Short getAnneeBct() {
        return anneeBct;
    }

    public void setAnneeBct(Short anneeBct) {
        this.anneeBct = anneeBct;
    }

    public String getCodeOperateurBct() {
        return codeOperateurBct;
    }

    public void setCodeOperateurBct(String codeOperateurBct) {
        this.codeOperateurBct = codeOperateurBct;
    }

    public Short getCodeCorrespondant() {
        return codeCorrespondant;
    }

    public void setCodeCorrespondant(Short codeCorrespondant) {
        this.codeCorrespondant = codeCorrespondant;
    }

    public String getBnaCrp() {
        return bnaCrp;
    }

    public void setBnaCrp(String bnaCrp) {
        this.bnaCrp = bnaCrp;
    }

    public String getComptabilisation() {
        return comptabilisation;
    }

    public void setComptabilisation(String comptabilisation) {
        this.comptabilisation = comptabilisation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDateJournee() {
        return dateJournee;
    }

    public void setDateJournee(Date dateJournee) {
        this.dateJournee = dateJournee;
    }

    public Date getDatePrelever() {
        return datePrelever;
    }

    public void setDatePrelever(Date datePrelever) {
        this.datePrelever = datePrelever;
    }

    public Date getDateOrdreAV() {
        return dateOrdreAV;
    }

    public void setDateOrdreAV(Date dateOrdreAV) {
        this.dateOrdreAV = dateOrdreAV;
    }

    public Date getDateAV() {
        return dateAV;
    }

    public void setDateAV(Date dateAV) {
        this.dateAV = dateAV;
    }

    public Date getDateComptabilisation() {
        return dateComptabilisation;
    }

    public void setDateComptabilisation(Date dateComptabilisation) {
        this.dateComptabilisation = dateComptabilisation;
    }

    public Date getDateAComptabiliser() {
        return dateAComptabiliser;
    }

    public void setDateAComptabiliser(Date dateAComptabiliser) {
        this.dateAComptabiliser = dateAComptabiliser;
    }

    public Date getDateValeur() {
        return dateValeur;
    }

    public void setDateValeur(Date dateValeur) {
        this.dateValeur = dateValeur;
    }

    public Byte getCodeBnqNegoc() {
        return codeBnqNegoc;
    }

    public void setCodeBnqNegoc(Byte codeBnqNegoc) {
        this.codeBnqNegoc = codeBnqNegoc;
    }

    public Integer getNumeroOrdre() {
        return numeroOrdre;
    }

    public void setNumeroOrdre(Integer numeroOrdre) {
        this.numeroOrdre = numeroOrdre;
    }

    public Date getDateDu() {
        return dateDu;
    }

    public void setDateDu(Date dateDu) {
        this.dateDu = dateDu;
    }

    public Date getDateAu() {
        return dateAu;
    }

    public void setDateAu(Date dateAu) {
        this.dateAu = dateAu;
    }

    public Date getProchaineMlevee() {
        return prochaineMlevee;
    }

    public void setProchaineMlevee(Date prochaineMlevee) {
        this.prochaineMlevee = prochaineMlevee;
    }

    public Byte getNbTrim() {
        return nbTrim;
    }

    public void setNbTrim(Byte nbTrim) {
        this.nbTrim = nbTrim;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public Short getCodeProduitServiceOrig() {
        return codeProduitServiceOrig;
    }

    public void setCodeProduitServiceOrig(Short codeProduitServiceOrig) {
        this.codeProduitServiceOrig = codeProduitServiceOrig;
    }

    public Short getCodeOperationOrig() {
        return codeOperationOrig;
    }

    public void setCodeOperationOrig(Short codeOperationOrig) {
        this.codeOperationOrig = codeOperationOrig;
    }

    public Integer getRefOperationOrig() {
        return refOperationOrig;
    }

    public void setRefOperationOrig(Integer refOperationOrig) {
        this.refOperationOrig = refOperationOrig;
    }

    public Date getDateOperationOrig() {
        return dateOperationOrig;
    }

    public void setDateOperationOrig(Date dateOperationOrig) {
        this.dateOperationOrig = dateOperationOrig;
    }

    public String getCodeOprDave() {
        return codeOprDave;
    }

    public void setCodeOprDave(String codeOprDave) {
        this.codeOprDave = codeOprDave;
    }

    public String getComSurCltCrp() {
        return comSurCltCrp;
    }

    public void setComSurCltCrp(String comSurCltCrp) {
        this.comSurCltCrp = comSurCltCrp;
    }

    public Short getAnneeExercice() {
        return anneeExercice;
    }

    public void setAnneeExercice(Short anneeExercice) {
        this.anneeExercice = anneeExercice;
    }

    public Byte getMoisExercice() {
        return moisExercice;
    }

    public void setMoisExercice(Byte moisExercice) {
        this.moisExercice = moisExercice;
    }

    public BigDecimal getAncMntCommission() {
        return ancMntCommission;
    }

    public void setAncMntCommission(BigDecimal ancMntCommission) {
        this.ancMntCommission = ancMntCommission;
    }

    public BigDecimal getAncMntTva() {
        return ancMntTva;
    }

    public void setAncMntTva(BigDecimal ancMntTva) {
        this.ancMntTva = ancMntTva;
    }

    public BigDecimal getAncMntCommissionDvs() {
        return ancMntCommissionDvs;
    }

    public void setAncMntCommissionDvs(BigDecimal ancMntCommissionDvs) {
        this.ancMntCommissionDvs = ancMntCommissionDvs;
    }

    public BigDecimal getAncMntTvaDvs() {
        return ancMntTvaDvs;
    }

    public void setAncMntTvaDvs(BigDecimal ancMntTvaDvs) {
        this.ancMntTvaDvs = ancMntTvaDvs;
    }

    public String getCompteInterne() {
        return compteInterne;
    }

    public void setCompteInterne(String compteInterne) {
        this.compteInterne = compteInterne;
    }

    public String getCompteCommission() {
        return compteCommission;
    }

    public void setCompteCommission(String compteCommission) {
        this.compteCommission = compteCommission;
    }

    public String getCompteTva() {
        return compteTva;
    }

    public void setCompteTva(String compteTva) {
        this.compteTva = compteTva;
    }

    public Byte getUniteOperationOrig() {
        return uniteOperationOrig;
    }

    public void setUniteOperationOrig(Byte uniteOperationOrig) {
        this.uniteOperationOrig = uniteOperationOrig;
    }

    public Integer getTaux() {
        return taux;
    }

    public void setTaux(Integer taux) {
        this.taux = taux;
    }

    public Integer getAutre() {
        return autre;
    }

    public void setAutre(Integer autre) {
        this.autre = autre;
    }

    public String getPeriodeCom() {
        return periodeCom;
    }

    public void setPeriodeCom(String periodeCom) {
        this.periodeCom = periodeCom;
    }

    public Short getJourNonCalcul() {
        return jourNonCalcul;
    }

    public void setJourNonCalcul(Short jourNonCalcul) {
        this.jourNonCalcul = jourNonCalcul;
    }

    public Integer getMinimum() {
        return minimum;
    }

    public void setMinimum(Integer minimum) {
        this.minimum = minimum;
    }

    public Integer getMaximum() {
        return maximum;
    }

    public void setMaximum(Integer maximum) {
        this.maximum = maximum;
    }

    public BigDecimal getAssiette() {
        return assiette;
    }

    public void setAssiette(BigDecimal assiette) {
        this.assiette = assiette;
    }

    public Integer getNumDossierOrigine() {
        return numDossierOrigine;
    }

    public void setNumDossierOrigine(Integer numDossierOrigine) {
        this.numDossierOrigine = numDossierOrigine;
    }

    public Date getDateDossierOrigine() {
        return dateDossierOrigine;
    }

    public void setDateDossierOrigine(Date dateDossierOrigine) {
        this.dateDossierOrigine = dateDossierOrigine;
    }

    public Integer getNumDossierOrig() {
        return numDossierOrig;
    }

    public void setNumDossierOrig(Integer numDossierOrig) {
        this.numDossierOrig = numDossierOrig;
    }

    public Date getDateDossierOrig() {
        return dateDossierOrig;
    }

    public void setDateDossierOrig(Date dateDossierOrig) {
        this.dateDossierOrig = dateDossierOrig;
    }

    public Integer getRefTraitement() {
        return refTraitement;
    }

    public void setRefTraitement(Integer refTraitement) {
        this.refTraitement = refTraitement;
    }

    public Date getDateTraitement() {
        return dateTraitement;
    }

    public void setDateTraitement(Date dateTraitement) {
        this.dateTraitement = dateTraitement;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CommissionCroEntity)) return false;
        CommissionCroEntity that = (CommissionCroEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(codeCommission, that.codeCommission)&&
                Objects.equals(uniteOperation, that.uniteOperation) &&
                Objects.equals(numDossier, that.numDossier) &&
                Objects.equals(dateDossier, that.dateDossier) &&
                Objects.equals(typeDossier, that.typeDossier) &&
                Objects.equals(codeService, that.codeService) &&
                Objects.equals(codeCommission, that.codeCommission) &&
                Objects.equals(codeTypeCommission, that.codeTypeCommission) &&
                Objects.equals(codeTypeCom, that.codeTypeCom) &&
                Objects.equals(achatVente, that.achatVente) &&
                Objects.equals(codeDevise, that.codeDevise) &&
                Objects.equals(mntCommission, that.mntCommission) &&
                Objects.equals(mntTva, that.mntTva) &&
                Objects.equals(mntCommissionDvs, that.mntCommissionDvs) &&
                Objects.equals(mntTvaDvs, that.mntTvaDvs) &&
                Objects.equals(codeTva, that.codeTva) &&
                Objects.equals(typePieceClient, that.typePieceClient) &&
                Objects.equals(noPieceClient, that.noPieceClient) &&
                Objects.equals(codeAgenceBct, that.codeAgenceBct) &&
                Objects.equals(racineCompte, that.racineCompte) &&
                Objects.equals(cleRib, that.cleRib) &&
                Objects.equals(numRefBna, that.numRefBna) &&
                Objects.equals(benefDoRefBna, that.benefDoRefBna) &&
                Objects.equals(codeTitreBct, that.codeTitreBct) &&
                Objects.equals(numIdBct, that.numIdBct) &&
                Objects.equals(dateBct, that.dateBct) &&
                Objects.equals(codePaysBct, that.codePaysBct) &&
                Objects.equals(natureOperationBct, that.natureOperationBct) &&
                Objects.equals(anneeBct, that.anneeBct) &&
                Objects.equals(codeOperateurBct, that.codeOperateurBct) &&
                Objects.equals(codeCorrespondant, that.codeCorrespondant) &&
                Objects.equals(bnaCrp, that.bnaCrp) &&
                Objects.equals(comptabilisation, that.comptabilisation) &&
                Objects.equals(status, that.status) &&
                Objects.equals(dateJournee, that.dateJournee) &&
                Objects.equals(datePrelever, that.datePrelever) &&
                Objects.equals(dateOrdreAV, that.dateOrdreAV) &&
                Objects.equals(dateAV, that.dateAV) &&
                Objects.equals(dateComptabilisation, that.dateComptabilisation) &&
                Objects.equals(dateAComptabiliser, that.dateAComptabiliser) &&
                Objects.equals(dateValeur, that.dateValeur) &&
                Objects.equals(codeBnqNegoc, that.codeBnqNegoc) &&
                Objects.equals(numeroOrdre, that.numeroOrdre) &&
                Objects.equals(dateDu, that.dateDu) &&
                Objects.equals(dateAu, that.dateAu) &&
                Objects.equals(prochaineMlevee, that.prochaineMlevee) &&
                Objects.equals(nbTrim, that.nbTrim) &&
                Objects.equals(phase, that.phase) &&
                Objects.equals(codeProduitServiceOrig, that.codeProduitServiceOrig) &&
                Objects.equals(codeOperationOrig, that.codeOperationOrig) &&
                Objects.equals(refOperationOrig, that.refOperationOrig) &&
                Objects.equals(dateOperationOrig, that.dateOperationOrig) &&
                Objects.equals(codeOprDave, that.codeOprDave) &&
                Objects.equals(comSurCltCrp, that.comSurCltCrp) &&
                Objects.equals(anneeExercice, that.anneeExercice) &&
                Objects.equals(moisExercice, that.moisExercice) &&
                Objects.equals(ancMntCommission, that.ancMntCommission) &&
                Objects.equals(ancMntTva, that.ancMntTva) &&
                Objects.equals(ancMntCommissionDvs, that.ancMntCommissionDvs) &&
                Objects.equals(ancMntTvaDvs, that.ancMntTvaDvs) &&
                Objects.equals(compteInterne, that.compteInterne) &&
                Objects.equals(compteCommission, that.compteCommission) &&
                Objects.equals(compteTva, that.compteTva) &&
                Objects.equals(uniteOperationOrig, that.uniteOperationOrig) &&
                Objects.equals(taux, that.taux) &&
                Objects.equals(autre, that.autre) &&
                Objects.equals(periodeCom, that.periodeCom) &&
                Objects.equals(jourNonCalcul, that.jourNonCalcul) &&
                Objects.equals(minimum, that.minimum) &&
                Objects.equals(maximum, that.maximum) &&
                Objects.equals(assiette, that.assiette) &&
                Objects.equals(numDossierOrigine, that.numDossierOrigine) &&
                Objects.equals(dateDossierOrigine, that.dateDossierOrigine) &&
                Objects.equals(numDossierOrig, that.numDossierOrig) &&
                Objects.equals(dateDossierOrig, that.dateDossierOrig) &&
                Objects.equals(refTraitement, that.refTraitement) &&
                Objects.equals(dateTraitement, that.dateTraitement);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, codeCommission, uniteOperation,
                numDossier, dateDossier, typeDossier, codeService, codeCommission,
                codeTypeCommission, codeTypeCom, achatVente, codeDevise, mntCommission,
                mntTva, mntCommissionDvs, mntTvaDvs, codeTva, typePieceClient,
                noPieceClient, codeAgenceBct, racineCompte, cleRib, numRefBna,
                benefDoRefBna, codeTitreBct, numIdBct, dateBct, codePaysBct,
                natureOperationBct, anneeBct, codeOperateurBct, codeCorrespondant,
                bnaCrp, comptabilisation, status, dateJournee, datePrelever,
                dateOrdreAV, dateAV, dateComptabilisation, dateAComptabiliser,
                dateValeur, codeBnqNegoc, numeroOrdre, dateDu, dateAu,
                prochaineMlevee, nbTrim, phase, codeProduitServiceOrig, codeOperationOrig,
                refOperationOrig, dateOperationOrig, codeOprDave, comSurCltCrp,
                anneeExercice, moisExercice, ancMntCommission, ancMntTva,
                ancMntCommissionDvs, ancMntTvaDvs, compteInterne, compteCommission,
                compteTva, uniteOperationOrig, taux, autre, periodeCom,
                jourNonCalcul, minimum, maximum, assiette, numDossierOrigine,
                dateDossierOrigine, numDossierOrig, dateDossierOrig, refTraitement,
                dateTraitement
        );
    }

}
