import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class GenService {

  private baseUrl = 'http://localhost:8093'; 

  constructor(private http: HttpClient) {}

  uploadAndSaveDocuments(formData: FormData): Observable<any> {
    return this.http.post(`${this.baseUrl}/documents/uploadAndSave`, formData, { responseType: 'text' });

  }
  getDocumentsByNumDossier(numDossier: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/documents/getDocumentsByNumDossier`, {
      params: { numDossier: numDossier.toString() }
    });
  }


}
