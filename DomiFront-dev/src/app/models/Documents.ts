export interface DocumentsEntity {
    codeProduitService: number;    
    codeOperation: number;       
    refOperation: number;         
    dateOperation: string;         
    uniteOperation: number | null; 
    typeDossier: string | null;   
    numDossier: number | null;    
    dateDossier: string | null;    
    numLigne: number;              
    referenceFichierJoint: string | null; 
    pathAnnee: string | null;      
    pathMois: string | null;       
    extension: string | null;      
}
export interface DocumentsEntityPK {
    codeProduitService: number;  
    codeOperation: number;        
    refOperation: number;        
    dateOperation: string;       
}
