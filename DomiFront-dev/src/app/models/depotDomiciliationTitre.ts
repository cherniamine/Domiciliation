import {DetailPDepotEntity} from "./DetailPDepot";
import {FileEntity} from "./FileEntity";

export interface DepotDomiciliationTitre {
    codeSecteurActiviteCode: string ;   
    codeSecteurActiviteLabel: string ;
    codeSecteurActiviteSecCode: string ;   
    codeSecteurActiviteSecLabel: string ;
    natureDemande: NatureDemande;
    codeAgence: number | null;
    codeagencelibele: string;
    typePieceClient: number;
    noPieceClient: string;
    numCompte: string;
    regimeSecteurActivite: RegimeSecteurActivite;
    activitePrincipaleSecondaire: ActivitePrincipaleSecondaire;
    codeSecteurActivite: string;
    codeSecteurActiviteSec: string;
    activiteType: string;
    codeTitre: CodeTitre;
    numDom: number;
    dateDom: Date |null;
    numDepot: number;
    dateDepot: Date|null;
    numeroDossier: string;
    numeroDemande: string;
    numContratCom: string;
    dateContratCom: Date|null;
    codeDevise: string ;
    sigleDevise: string; 
    libDevise: string;
    mntDvsPtfnFact: number| null;
    mntDvsFobFact: number | null;
    mntTndFob: number| null;
    mntTndPtfn: number| null;
    acompte: number;
    nomFournisseur: string;
    adrFournisseur: string;
    nomClient: string;
    adrClient: string;
    codPayAch: string;
    codPayProv: string;
    codPayOrig: string;
    libPaysOrig: string;
    libPaysAch:string;
    libPaysProv:string;
    libPaysDestDef:string;
    codePaysDestDef: string;
    codeModLiv: number;
    codeModLivCode: string; 
    codeModLivLabel: string;
    codeModReg: string;
    libModReg: string;
    codeDelReg: string;
    libDelReg: string;
    codeRegimeStat: string;
    libRegimeStat:string;
    nbrColis: number;
    typeAccordBct: string;
    numAccordBct: string;
    dateAccordBct: Date|null;
    observationAccordBct:string;
    numAssurance:string;
    dateAssurance:Date|null;
    numCotunas: number;
    dateCotunas: Date|null;
    dateValidite: Date|null;
    dateApurement: Date|null;
    observation: string;
    matEmp: string;
    status: string;
    dateValidation: Date|null;
    codeEnvoiSpecial: string;
    idTce?: number;
    detailPDepotEntitys: DetailPDepotEntity[];
    fileEntity:FileEntity[];
    etatVerif: EtatVerif; 

}

export interface DepotDomiciliationTitrePK {
    codeProduitService: number;
    codeOperation: number;
    dateOperation: Date;
    refOperation: number;
    regimeSecteurActivite?: RegimeSecteurActivite;
}

export enum NatureDemande {
    dd="Selectionnez le type de demande",
    DEPOT = 'DEPOT',
    DEROGATION = 'DEROGATION',
    DOMICILIATION = 'DOMICILIATION'
}

export enum RegimeSecteurActivite {
    oui = 'oui',
    non = 'non'
}

export enum ActivitePrincipaleSecondaire {
    PRINCIPALE = 'principale',
    SECONDAIRE = 'secondaire'
}

export enum CodeTitre {
  aa="Selectionnez le code titre",
    AUTORISATION_EXPORTATION = 'AUTORISATION_EXPORTATION(21)',
    FACTURE_DEFINITIVE = 'FACTURE DEFINITIVE(22)',
    AUTORISATION_IMPORTATION = 'AUTORISATION_IMPORTATION(31)',
    ADMISSION_TEMPORAIRE = 'ADMISSION TEMPORAIRE(39)',
    CERTIFICAT_D_IMPORTATION="CERTIFICAT D'IMPORTATION(33)"
}
export enum EtatVerif {
    Verifier = "Vérifier",
    A_Modifier = "A_Modifier",
    En_Attente_De_Verification = "En_Attente_De_Vérification"
}

