import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, map, Observable, of, throwError } from 'rxjs';
import { TypeAccordBct } from 'src/app/models/AccordBct';
import { ActiviteClasse } from 'src/app/models/activity-data.model';
import { Agence } from 'src/app/models/Agence';
import { Devise } from 'src/app/models/Devise';
import { DonneeNgp } from 'src/app/models/DonneeNgp';
import { ModeDeLivraison } from 'src/app/models/ModeDeLivraison';
import { RegimeStat } from 'src/app/models/RegimeStat';

@Injectable({
  providedIn: 'root'
})
export class RefService {

  private baseUrl = 'http://localhost:8092/api/v1/ref'; 

  constructor(private http: HttpClient) {}
  getAgence(): Observable<Agence[]> {
    const url = `${this.baseUrl}/Agence/all`;
    return this.http.get<Agence[]>(url).pipe(
      map((agences: Agence[]) => agences),
      catchError((error) => {
        console.error('Erreur lors de la récupération des agences :', error);
        return throwError(() => new Error('Erreur lors de la récupération des agences.'));
      })
    );
  }
  getAgenceSummary(): Observable<Agence[]> {
    const url = `${this.baseUrl}/Agence/summary`;
    return this.http.get<Agence[]>(url).pipe(
        map((agences: Agence[]) => agences),
        catchError((error) => {
            console.error('Erreur lors de la récupération des résumés des agences :', error);
            return throwError(() => new Error('Erreur lors de la récupération des résumés des agences.'));
        })
    );
}

  getAllNgp(): Observable<DonneeNgp[]> {
    return this.http.get<DonneeNgp[]>(`${this.baseUrl}/DonneeNgp/all`);
  }
  // Fetch all country codes
  getAllCodePays(): Observable<number[]> {
    return this.http.get<number[]>(`${this.baseUrl}/Pays/allcodepays`);
  }

  // Fetch all currency codes

  getAllDevises(): Observable<Devise[]> {
    return this.http.get<Devise[]>(`${this.baseUrl}/Devise/all`).pipe(
      map((devises: Devise[]) => devises.sort((a, b) => a.codeDevise - b.codeDevise)) // Sorting by codeDevise
    );
  }
  
  getConversionRate(date: string, codeDevise: number): Observable<number | null> {
    return this.http.get<any>(`${this.baseUrl}/CoursJoursDevise/get/${date}/${codeDevise}`).pipe(
      map(response => {
        if (response && response.coursAchat) {
          return response.coursAchat; // Assuming coursAchat is the required rate
        } else {
          throw new Error('Conversion rate not found in response.');
        }
      }),
      catchError(error => {
        console.error('Error fetching conversion rate:', error);
        return of(null); // Return null or a default value on error
      })
    );
  }

  // Fetch all client numbers
  getAllNoPieceClient(): Observable<number[]> {
    return this.http.get<number[]>(`${this.baseUrl}/Compte/allNoPiecesClients`);
  }

  // Fetch all unit codes
  getAllCodeUnite(): Observable<number[]> {
    return this.http.get<number[]>(`${this.baseUrl}/Unite/allcodeunite`);
  }

  // Fetch all NGP codes
  getAllCodeNgp(): Observable<number[]> {
    return this.http.get<number[]>(`${this.baseUrl}/DonneeNgp/allcodengp`);
  }

  // Fetch all delivery mode codes
  getAllCodeModLiv(): Observable<ModeDeLivraison[]> {
    return this.http.get<ModeDeLivraison[]>(`${this.baseUrl}/ModeDeLivraison/all`);
}

  getAllModReg(): Observable<any[]> {
    return this.http.get<any[]>(`${this.baseUrl}/ModeDeReglement/all`).pipe(
      map(response => response.filter(mode => mode.dom === 'O')),
      catchError(error => {
        console.error('Error fetching mode de règlement:', error);
        return throwError(error); // Propagate the error for the component to handle
      })
    );
  }

  // Fetch all payment deadline codes
  getAllDelaisReglement(): Observable<any> {
    return this.http.get<any[]>(`${this.baseUrl}/DelaisReglement/all`)
  }
  

 // Fetch all tax regime codes
 getAllRegimeStat(): Observable<RegimeStat[]> {
  return this.http.get<RegimeStat[]>(`${this.baseUrl}/RegimeStat/all`);
}

  // Fetch all BCT agreement numbers
  getAllTypeAccord(): Observable<string[]> {
    return this.http.get<string[]>(`${this.baseUrl}/AccordBct/all`);
  }

  // Fetch all BCT agreement numbers
  getAllNumAccordBct(typeAccordBct: string): Observable<number[]> {
    return this.http.get<number[]>(`${this.baseUrl}/AccordBct/allnumaccordbct/${typeAccordBct}`);
  }

  // Fetch all BCT agreement dates
  getAllDateAccordBct(typeAccordBct: string): Observable<Date[]> {
    return this.http.get<Date[]>(`${this.baseUrl}/AccordBct/alldateaccordbct/${typeAccordBct}`);
  }
  createAccord(request: any): Observable<any> {
    return this.http.post(`${this.baseUrl}/AccordBct/create`, request, {
      headers: { 'Content-Type': 'application/json' }
    });
  }
  getDetailAccord(typeAccordBct: string, numAccordBct: number, dateAccordBct: string): Observable<any> {
    const url = `${this.baseUrl}/AccordBct/detailaccordbct/${typeAccordBct}/${numAccordBct}/${dateAccordBct}`;
    console.log('Fetching accord details from URL:', url); 
    return this.http.get<any>(url); 
  }
  
  
  getAccordBct(typeAccordBct: string, numAccordBct: number): Observable<any> {
    return this.http.get<any>(
      `${this.baseUrl}/AccordBct/get/${typeAccordBct}/${numAccordBct}`
    );
  }

  // Fetch full name based on client number
  getNomEtPrenom(noPiecePersonne: string): Observable<string> {
    return this.http.get<string>(`${this.baseUrl}/Personne/nomPrenom/${noPiecePersonne}`);
  }

  // Fetch account RIB based on client number
  getCompteRib(noPiecePersonne: string): Observable<string[]> {
    return this.http.get<string[]>(`${this.baseUrl}/Compte/getCompteRib/${noPiecePersonne}`);
  }

  // Fetch the "totalement exportatrice" status based on client number
  getTotalementExportatrice(noPieceClient: string): Observable<string> {
    return this.http.get<string>(`${this.baseUrl}/Client/totalement-exportatrice/${noPieceClient}`).pipe(
      catchError(err => {
        console.error('Error fetching totalement exportatrice', err);
        return throwError(err); 
      })
    );
  }

  // Fetch activity data based on client number
  getActivities(noPieceClient: string): Observable<any[]> {
    return this.http.get<any[]>(`${this.baseUrl}/Client/activities/${noPieceClient}`).pipe(
        catchError(err => {
            console.error('Error fetching activity data', err);
            return throwError(err);
        })
    );
}


getPaysList(): Observable<{ codePays: number, siglePays: string, libPays: string }[]> {
  return this.http.get<{ codePays: number, siglePays: string, libPays: string }[]>(`${this.baseUrl}/Pays/all`)
    .pipe(
      catchError(err => {
        console.error('Error fetching countries', err);
        return throwError(err); 
      })
    );
}


   // Fetch all activity classes
   getAllActiviteClasses(): Observable<any[]> {
    return this.http.get<any[]>(`${this.baseUrl}/ActiviteClasse/all`).pipe(
      catchError(err => {
        console.error('Error fetching activity data', err);
        return throwError(err);
      })
    );
  }

  // Upload a file
  uploadFile(file: File): Observable<any> {
    const apiUrl = 'http://localhost:8091/file/upload';

    const formData: FormData = new FormData();
    formData.append('file', file, file.name);

    return this.http.post<any>(apiUrl, formData).pipe(
      catchError(err => {
        console.error('Error uploading file', err);
        return throwError(err);
      })
    );
  }
}
