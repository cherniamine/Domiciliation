import { Injectable } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';

@Injectable({
  providedIn: 'root',
})
export class ToastNotificationService {
  constructor(private snackBar: MatSnackBar) {}
  show(message: string, action: string = 'Close'): void {
    this.snackBar.open(message, action, {
      duration: 3000, // Duration in ms
      horizontalPosition: 'end', // Position horizontally to the right
      verticalPosition: 'top', // Position vertically at the top
      panelClass: ['toast-notification'], // Custom class for styling
    });
  }
  
}
