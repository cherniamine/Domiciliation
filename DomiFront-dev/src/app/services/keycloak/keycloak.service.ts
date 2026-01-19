import { Injectable } from '@angular/core';
import Keycloak from 'keycloak-js';
import { UserProfile } from "./user-profile";

@Injectable({
  providedIn: 'root'
})
export class KeycloakService {

  private _keycloak: Keycloak | undefined;
  private _profile: UserProfile | undefined;

 
  private clientSecret: string = '6iZyaPdB428Zwl1HkIpkBi16FoJP7B7X';  // Add your client secret here

  get keycloak() {
    if (!this._keycloak) {
      this._keycloak = new Keycloak({
        url: 'http://localhost:8080',
        realm: 'microservice',
        clientId: 'domiciliation'
      });
    }
    return this._keycloak;
  }

  get profile(): UserProfile | undefined {
    return this._profile;
  }

  constructor() { }

  async init(): Promise<void> {
    try {
      const authenticated = await this.keycloak.init({
        onLoad: 'check-sso',
        checkLoginIframe: false
      });
      if (authenticated) {
        this._profile = await this.keycloak.loadUserProfile() as UserProfile;
        this._profile.token = this.keycloak.token;
      } else {
        console.warn('User is not authenticated.');
      }
    } catch (error) {
      console.error('Keycloak initialization failed', error);
    }
  }


  async login(username: string, password: string): Promise<boolean> {
    if (username && password) {
      try {
        const tokenEndpoint = `${this.keycloak.authServerUrl}/realms/${this.keycloak.realm}/protocol/openid-connect/token`;

        const body = new URLSearchParams({
          grant_type: 'password',
          client_id: this.keycloak.clientId || '',  
          username: username,
          password: password
        });

        
        if (this.clientSecret) {
          body.append('client_secret', this.clientSecret);
        }

        const response = await fetch(tokenEndpoint, {
          method: 'POST',
          headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
          body: body.toString()
        });

        const data = await response.json();
        if (response.ok && data.access_token) {
          this.keycloak.token = data.access_token;
          await this.keycloak.loadUserProfile();
          console.log('Login successful with token:', data.access_token);
          return true; 
          throw new Error(data.error_description || 'Login failed');
        }
      } catch (error) {
        console.error('Login failed', error);
        return false;  
      }
    }
    return false;  
  }

  logout(): void {
    this.keycloak?.logout({ redirectUri: 'http://localhost:4200/login' });
  }

  isAuthenticated(): boolean {
    return !!this.keycloak.token;  
  }
}
