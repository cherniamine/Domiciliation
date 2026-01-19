export interface AccordBctEntity {
    accordBctEntityPK: AccordBctEntityPK;
    typePieceClient: number;
    noPieceClient: string;
    dateDebApplication: Date;
    dateFinApplication: Date;
    observationAccordBct: string;
    numContratCom: string;
    dateContratCom: Date;
    sens: Sens;
    etat: Etat;
    documents: Document[]; 
}

export interface AccordBctEntityPK {
    typeAccordBct: TypeAccordBct;
    numAccordBct: number;
    dateAccordBct: Date;
}
export interface Document {
    referenceFichierJoint: string;
  }
export enum Etat {
    ACTIVE = "ACTIVE",
    DESACTIVE = "DESACTIVE"
}

export enum TypeAccordBct {
    L = "L",
    F1 = "F1",
    F2 = "F2"
}

export enum Sens {
    IMPORT = "IMPORT",
    EXPORT = "EXPORT"
}

