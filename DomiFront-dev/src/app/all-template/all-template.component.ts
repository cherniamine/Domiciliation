import { Component } from '@angular/core';
import { KeycloakService } from '../services/keycloak/keycloak.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-all-template',
  templateUrl: './all-template.component.html',
  styleUrls: ['./all-template.component.css']
})
export class AllTemplateComponent {

  constructor(private keycloakService: KeycloakService, private router: Router) {}

  onLogout(): void {
    this.keycloakService.logout(); 
  }

}
