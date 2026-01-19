export interface Agence {
    agenceEntityPK: {
      codeBanque: number;
      codeAgenceBct: number;
    };
    libAgence: string;
    typeAgence: string | null;
    codeLocalite: string | null;
    adresseAgence: string | null;
    indicatifTel: string | null;
    numeroTel: string | null;
    codeAgenceBna: string | null;
    codeBct: string | null;
    email: string | null;
    codeZoneAgence: number | null;
  }
  