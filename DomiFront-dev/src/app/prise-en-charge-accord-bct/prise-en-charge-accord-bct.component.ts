import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { RefService } from '../services/ref/ref.service';
import { MatDialog } from '@angular/material/dialog';
import { AlertDialogComponent } from '../alert-dialog/alert-dialog.component';
import { error } from 'jquery';
import { GenService } from '../services/gen/gen.service';

@Component({
  selector: 'app-prise-en-charge-accord-bct',
  templateUrl: './prise-en-charge-accord-bct.component.html',
  styleUrls: ['./prise-en-charge-accord-bct.component.css']
})
export class PriseEnChargeAccordBctComponent implements OnInit {
  accordForm: FormGroup;
  currentStep: number = 1;
  typeAccordList: string[] = ['L', 'F1', 'F2'];
  depotDomiTitre: { noPieceClient?: string } = {};
  nomPrenom: string | null = null;
  errorMessage: string | null = null;
  public allNoPieceClientList: number[] = [];
  dateAccordError: string = '';
  dateDebutEffetError: string = '';
  dateFinEffetError: string = '';
  selectedFileNames: string[] = []; 
  selectedFiles: File[] = []; 
  isFileListVisible: boolean = false;

  constructor(
    private fb: FormBuilder,
    private refService: RefService,
    private genService: GenService,
    private dialog: MatDialog,
    private http: HttpClient 
  ) {
    this.accordForm = this.fb.group({
      typeAccord: ['', Validators.required],
      numAccord: ['', [Validators.required, Validators.pattern('^[0-9]+$')]],
      dateAccord: ['', Validators.required],
      dateDebutEffet: ['', Validators.required],
      dateFinEffet: ['', Validators.required],
      observation: ['', [Validators.required, Validators.maxLength(500)]],
      files: [null],
      noPieceClient: ['', Validators.required]
   } )
    
  }

  ngOnInit(): void {
    this.fetchAllNoPieceCleint();
    
  }

    validateDates(): boolean {
    const dateAccord = new Date(this.accordForm.get('dateAccord')?.value);
    const dateDebutEffet = new Date(this.accordForm.get('dateDebutEffet')?.value);
    const dateFinEffet = new Date(this.accordForm.get('dateFinEffet')?.value);

    // Validation for Date Début Effet
    if (dateDebutEffet < dateAccord) {
      this.openDialog('Erreur', 'Date Début Effet doit être >= Date Accord.');
      return false;
    }

    // Validation for Date Fin Effet
    if (dateFinEffet < dateDebutEffet) {
      this.openDialog('Erreur', 'Date Fin Effet doit être >= Date Début Effet.');
      return false;
    }

    return true;
  }

  openDialog(title: string, message: string): void {
    this.dialog.open(AlertDialogComponent, {
     width: '400px',
     data: {
      title: title,
      message: message,
    },
      panelClass: 'custom-dialog-container',
      hasBackdrop: true,
      backdropClass: 'custom-backdrop'
    });
  }


  getFieldName(field: string): string {
    // Return the user-friendly field name for the error message
    const fieldNames: { [key: string]: string } = {
      noPieceClient: 'Matricule Fiscale',
      typeAccord: 'Type Accord BCT',
      numAccord: 'Numéro Accord',
      dateAccord: 'Date Accord',
      dateDebutEffet: 'Date Début Effet',
      dateFinEffet: 'Date Fin Effet',
      observation: 'Observation',
    };
    return fieldNames[field] || field;
  }
 

  onSubmit(): void {
  if (this.accordForm.invalid) {
    this.handleFormErrors();
    return; 
  }

  const noPieceClientValue = this.accordForm.get('noPieceClient')?.value;
  if (!this.allNoPieceClientList.includes(noPieceClientValue)) {
    this.openDialog('Erreur', 'Veuillez entrer une Matricule Fiscale valide.');
    return;
  }

  if (!this.validateDates()) {
    this.openDialog('Erreur', 'Les dates saisies sont invalides.');
    return;
  }

    const files = this.accordForm.get('files')?.value; 
    console.log('Files in form:', files); 
    if (files && files.length > 0) {
        this.uploadAndCreateWithFile();
    } else {
        this.createAccordWithoutFile();
    }
}


private createAccordWithoutFile(): void {
  const requestBody = this.prepareRequestBody(); 

  this.refService.createAccord(requestBody).subscribe(
    (response) => {
      console.log('Accord créé sans fichier :', response);
       this.openDialog('Succès','Accord créé avec succès.');
      this.resetForm();
    },
    (error) => {
      console.error('Erreur lors de la création de l\'accord :', error);
      this.openDialog('Error','Erreur lors de la création de l\'accord.');
    }
  );
}
private uploadAndCreateWithFile(): void {
  const formData = this.prepareFormData(); 
  console.log('FormData prepared:', formData);
  this.genService.uploadAndSaveDocuments(formData).subscribe(
    (response) => {
        console.log('Accord créé avec succès :', response);
        this.openDialog('Succès', 'Accord créé avec succès.');
        this.resetForm();
    },
    (error) => {
        console.error('Erreur lors de la création de l\'accord :', error);
        if (error.status === 400) {
            this.openDialog('Erreur', 'Données invalides fournies.');
        } else if (error.status === 500) {
            this.openDialog('Erreur', 'Erreur serveur, veuillez réessayer plus tard.');
        } else {
            this.openDialog('Erreur', 'Erreur inattendue, veuillez vérifier votre connexion.');
        }
    }
);

}

private handleFormErrors(): void {
  this.accordForm.markAllAsTouched();

  Object.keys(this.accordForm.controls).forEach((field) => {
    const control = this.accordForm.get(field);

    if (control && control.invalid) {
      const fieldName = this.getFieldName(field);
      const element = document.querySelector(`[formControlName=${field}]`);

      if (element) {
        element.classList.add('error');

        $(element)
          .siblings('.wizard-form-error')
          .text(`Veuillez entrer ${fieldName}`)
          .slideDown();
      }
    }
  });
}

private resetForm(): void {
  this.accordForm.reset(); 
  this.nomPrenom = null;
  this.accordForm.get('file')?.setValue(null);

  const fileInput = document.querySelector('input[type="file"]') as HTMLInputElement;
  if (fileInput) {
    fileInput.value = ''; 
  }
  Object.keys(this.accordForm.controls).forEach((field) => {
    const element = document.querySelector(`[formControlName=${field}]`);
    if (element) {
      element.classList.remove('error');
      $(element).siblings('.wizard-form-error').slideUp();
    }
  });
}

private prepareRequestBody(): any {
  return {
    noPieceClient: this.accordForm.get('noPieceClient')?.value || '',
    typeAccordBct: this.accordForm.get('typeAccord')?.value || '',
    numAccordBct: this.accordForm.get('numAccord')?.value || '',
    dateAccordBct: this.accordForm.get('dateAccord')?.value || '',
    dateDebApplication: this.accordForm.get('dateDebutEffet')?.value || '',
    dateFinApplication: this.accordForm.get('dateFinEffet')?.value || '',
    observation: this.accordForm.get('observation')?.value || ''
  };
}
private prepareFormData(): FormData {
  const formData = new FormData();
  const accordData = {
    noPieceClient: this.accordForm.get('noPieceClient')?.value || '',
    typeAccordBct: this.accordForm.get('typeAccord')?.value || '',
    numAccordBct: this.accordForm.get('numAccord')?.value || '',
    dateAccordBct: this.accordForm.get('dateAccord')?.value || '',
    dateDebApplication: this.accordForm.get('dateDebutEffet')?.value || '',
    dateFinApplication: this.accordForm.get('dateFinEffet')?.value || '',
    observation: this.accordForm.get('observation')?.value || ''
  };

  formData.append('accordData', JSON.stringify(accordData));

  if (this.selectedFiles && this.selectedFiles.length > 0) {
    this.selectedFiles.forEach(file => {
      formData.append('files', file); 
    });
  }

  return formData;
}

    
onFileChange(event: Event): void {
  const input = event.target as HTMLInputElement;
  if (input?.files) {
      const files = Array.from(input.files);
      const maxSize = 10 * 1024 * 1024; // 10MB
      const oversizedFiles = files.filter(file => file.size > maxSize);

      if (oversizedFiles.length > 0) {
          this.openDialog('Error','Un ou plusieurs fichiers dépassent la taille maximale de 10MB.');
          return;
      }

      this.selectedFiles = files;
      this.selectedFileNames = files.map(file => file.name);
      this.accordForm.patchValue({ files: this.selectedFiles });
  } else {
      this.selectedFileNames = [];
      console.warn('No file selected.');
  }
}

  toggleFileList(): void {
    this.isFileListVisible = !this.isFileListVisible;
  }
  
  removeFile(fileName: string): void {
    const index = this.selectedFileNames.indexOf(fileName);
  
    if (index !== -1) {
      this.selectedFileNames.splice(index, 1);
      this.selectedFiles.splice(index, 1);
      this.accordForm.patchValue({ files: this.selectedFiles });

      const fileInput = document.getElementById('files') as HTMLInputElement;
      if (fileInput) {
        fileInput.value = ''; 
      }
  
      const dataTransfer = new DataTransfer();
      this.selectedFiles.forEach(file => dataTransfer.items.add(file));
      fileInput.files = dataTransfer.files;
    }
  }
  
  changeFile(index: number): void {
    const fileInput = document.createElement('input');
    fileInput.type = 'file';
    fileInput.accept = '*/*';
  
    fileInput.onchange = (event: Event) => {
      const target = event.target as HTMLInputElement;
      if (target?.files?.length) {
        const newFile = target.files[0];
        this.selectedFiles[index] = newFile; 
        this.selectedFileNames[index] = newFile.name; 
        this.accordForm.patchValue({ files: this.selectedFiles });
  
        const fileInputElement = document.getElementById('files') as HTMLInputElement;
        if (fileInputElement) {
          const dataTransfer = new DataTransfer();
          this.selectedFiles.forEach(file => dataTransfer.items.add(file));
          fileInputElement.files = dataTransfer.files; 
        }
      }
    };
    fileInput.click();
  }

  openFile(file: File): void {
    if (file) {
      const fileURL = URL.createObjectURL(file);
      window.open(fileURL, '_blank');
    } else {
      console.warn('Fichier introuvable ou invalide.');
      this.openDialog('Erreur', 'Le fichier n\'a pas pu être ouvert.');
    }
  } 
  
  fetchAllNoPieceCleint(): void {
    this.refService.getAllNoPieceClient().subscribe(
      (data: number[]) => {
        this.allNoPieceClientList = data;
      },
      (error) => {
        console.error('Error fetching codePays', error);
      }
    );
  }

  onNoPieceClientChange(): void {
    if (this.accordForm.get('noPieceClient')?.value) {
      this.nomPrenom = null;
      this.errorMessage = null;

      this.refService.getNomEtPrenom(this.accordForm.get('noPieceClient')?.value).subscribe(
        (data) => {
          if (data) {
            this.nomPrenom = data;
          } else {
            this.handleClientNotFound();
          }
        },
        (error) => {
          console.error('Erreur lors de la récupération du nom et prénom', error);
          this.errorMessage = 'Erreur lors de la récupération du nom et prénom.';
        }
      );
    } else {
      this.errorMessage = 'Veuillez entrer un numéro de pièce client.';
    }
  }

  handleClientNotFound(): void {
    this.nomPrenom = null;
    this.errorMessage = 'RNE inexistant';

    const dialogRef = this.dialog.open(AlertDialogComponent, {
      width: '400px',
      data: {title: 'Erreur', message: 'Le numéro de pièce client n\'existe pas.' },
      panelClass: 'custom-dialog-container',
      hasBackdrop: true,
      backdropClass: 'custom-backdrop'
    });

    dialogRef.afterClosed().subscribe(() => {
      console.log('Le modal a été fermé');
    });
  }
}