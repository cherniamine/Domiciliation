import { Component } from '@angular/core';
import { KeycloakService } from '../../services/keycloak/keycloak.service';
import { Router } from '@angular/router';
import { ToastNotificationService } from 'src/app/services/toast/toast-notification.service';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  email: string = '';
  password: string = '';

  constructor(
    private keycloakService: KeycloakService,
    private router: Router,
    private toastService: ToastNotificationService
  ) {}

  async ngOnInit(): Promise<void> {
    if (this.keycloakService.isAuthenticated()) {
      this.router.navigate(['/home']);
    }
  }

  async onLogin(): Promise<void> {
    try {
      const isAuthenticated = await this.keycloakService.login(this.email, this.password);
      if (isAuthenticated) {
        this.router.navigate(['/home']);
      } else {
        this.toastService.show('Invalid email or password. Please try again.', 'Close');
      }
    } catch (error) {
      this.toastService.show('An error occurred during login. Please try again.', 'Close');
    }
  }
}
