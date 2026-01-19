import {ChangeDetectorRef, Component, OnInit, TemplateRef, ViewChild} from '@angular/core';
import {Router} from '@angular/router';
import * as jQuery from 'jquery';
import {DepotDomiciliationTitreService} from "../../services/depot-domiciliation-titre.service";
import {
    ActivitePrincipaleSecondaire,
    CodeTitre,
    DepotDomiciliationTitre,
    EtatVerif,
    NatureDemande,
    RegimeSecteurActivite,
    
} from "../../models/depotDomiciliationTitre";
import {RefService} from "../../services/ref/ref.service";
import {AccordBctEntity, TypeAccordBct} from "../../models/AccordBct";
import { Agence } from 'src/app/models/Agence';
import {MatDialog} from '@angular/material/dialog';
import {PersonDetailsComponent} from "../../DetailPersonne/person-details/person-details.component";
import {forkJoin, Observable} from 'rxjs';
import {FileEntity} from "../../models/FileEntity";
import { AlertDialogComponent } from 'src/app/alert-dialog/alert-dialog.component';
import { ActiviteClasse } from "../../models/activity-data.model";
import { ModeDeLivraison } from 'src/app/models/ModeDeLivraison';
import { Devise } from 'src/app/models/Devise';
import { RegimeStat } from 'src/app/models/RegimeStat';
import { DonneeNgp } from 'src/app/models/DonneeNgp';
import { GenService } from 'src/app/services/gen/gen.service';


@Component({
  selector: 'app-depotdomiciliation',
  templateUrl: './depotdomiciliation.component.html',
  styleUrls: ['./depotdomiciliation.component.css']
})

  export class DepotdomiciliationComponent implements OnInit {

    depotDomiTitre: DepotDomiciliationTitre = {
      natureDemande: NatureDemande.dd,
      codeAgence: null,
      codeagencelibele: '',
      typePieceClient: NaN,
      noPieceClient: '',
      numCompte: '',
      regimeSecteurActivite: RegimeSecteurActivite.non,
      activitePrincipaleSecondaire: ActivitePrincipaleSecondaire.PRINCIPALE,
      codeSecteurActivite: '',
      codeSecteurActiviteSec: '',
      activiteType: 'primaire',
      codeTitre: CodeTitre.aa,
      numDom: NaN,
      dateDom: null,
      numDepot: NaN,
      dateDepot: null,
      numeroDossier: '',
      numeroDemande: '',
      numContratCom: '',
      dateContratCom: null,
      codeDevise:'',
      mntDvsPtfnFact: NaN,
      mntDvsFobFact: NaN,
      mntTndFob: NaN,
      mntTndPtfn: NaN,
      acompte: NaN,
      nomFournisseur: '',
      adrFournisseur: '',
      nomClient: '',
      adrClient: '',
      codPayAch: '',
      codePaysDestDef: '',
      codPayProv: '',
      codPayOrig: '',
      libPaysOrig: '',
      libPaysAch:'',
      libPaysProv:'',
      libPaysDestDef:'',
      codeModLiv: NaN,
      codeModReg: '',
      libModReg: '',
      codeDelReg: '',
      libDelReg: '',
      codeRegimeStat: '',
      libRegimeStat: '',
      nbrColis: NaN,
      typeAccordBct: '',
      numAccordBct: '',
      dateAccordBct: null,
      observationAccordBct: '',
      numAssurance: '',
      dateAssurance: null,
      numCotunas: NaN,
      dateCotunas: null,
      dateValidite: null,
      dateApurement: null,
      observation: '',
      matEmp: '',
      status: '',
      dateValidation: null,
      codeEnvoiSpecial: '',
      detailPDepotEntitys: [
        {
          codeNgp: NaN,
          montantDvsNgp: NaN,
          codePaysOrigNgp: NaN,
          codeUnite: NaN,
          testReserve: '',
          qteNgp: NaN,
        }
      ],
      fileEntity: [
        {
          fileName: '',
          fileType: '',
          data: new Uint8Array(0),
        }
      ],

      etatVerif: EtatVerif.En_Attente_De_Verification,
      codeSecteurActiviteCode: '',
      codeSecteurActiviteLabel: '',
      codeSecteurActiviteSecCode: '',
      codeSecteurActiviteSecLabel: '',
      codeModLivCode: '',
      codeModLivLabel: '',
      sigleDevise: '',
      libDevise: ''
    };
    activiteClasse: ActiviteClasse[] = [];
  natureDemandeOptions = Object.values(NatureDemande);
  typeAccordBctOptions = Object.values(TypeAccordBct);
  public codePaysList: { codePays: number; libPays: string }[] = [];
  public allNoPieceClientList: number[] = [];
  public allCodeUniteList: number[] = [];
  public allCodeNgpList: number[] = [];
  isNgpDropdownVisible: boolean[] = [];
  filteredCodeNgpList: string[][] = [];
  public  allCodeModRegList: { codeModReg: string; libModReg: string }[] = [];
  public allCodeDelRegList: Array<{ codeDelReg: string, libDelReg: string, delais: number, periode: string, modeReg: string, ordre: number }> = [];
  public allCodeRegimeStatListe: Array<{ codeRegimeStat: string, libRegimeStat: string }> = [];
  public allNumAccordBctList: number[] = [];
  public allDateAccordBctList: Date[] = [];
  public formattedDateAccordBctList: string[] = [];
  public selectedOption: string = 'AccordBCT';
public assuranceType: string = 'Assurance'; 
public filteredPays: { codePays: number; libPays: string }[] = [];
    nomPrenom: string | undefined;
  errorMessage: string | undefined;
  activities: { code: string; label: string }[] = [];
  ribs: string[] = [];
    fileInputs: File[] = [];
  showMore = false;
  showMore1 = false;
  showMore2 = false;
  showMore3 = false;
  showMore4 = false;
  totallyExportatrice?: boolean;
  isTotalementExportatrice:boolean | null = null;
  regimeSecteurActivite?: RegimeSecteurActivite;
  allCodeModLivList: ModeDeLivraison[] = [];
  codeDeviseList: Devise[] = [];
  codeModLivCode: string = '';
  codeModLivLabel: string = '';
  isPaysOrigineModalOpen = false;
  isPaysAchatModalOpen: boolean = false;
  isPaysProvenanceModalOpen: boolean = false;
  isPaysDestinationModalOpen: boolean = false;
  paysOrigineList: { codePays: number, siglePays: string, libPays: string }[] = [];
  isModeReglementModalOpen = false;
  isDelRegModalOpen = false;
  isRegStatModalOpen = false;
  filteredDevises: Devise[] = [];
  accordDetails: AccordBctEntity | null = null; 
  showModal: boolean = false;
  searchPays: string = '';
  numberOfNgps: number = 1; 
  selectedFileNames: string[] = []; 
  selectedFiles: File[] = []; 
  isFileListVisible: boolean = false;
  ngpData: DonneeNgp[] = []; 
  isAgenceModalOpen: boolean = false;
  searchAgenceCode: string = '';
  filteredAgences: Agence[] = [];
  agences: Agence[] = [];
  currentDate: Date = new Date(); 
  constructor(
      private router: Router,
      private depotdomititreservice: DepotDomiciliationTitreService,
      private refservice: RefService,
      public dialog: MatDialog,
      private refService: RefService,
      private cdr: ChangeDetectorRef,
      private genService: GenService
  )
  {}
  isActivitePrincipaleSet: boolean = false;
  showSecondaryActivity: boolean = false;

  ngOnInit(): void {
    // Set default values for 'Totalement exportatrice'
    if (!this.depotDomiTitre.noPieceClient) {
        this.isTotalementExportatrice = false; // Set to false if no client number is available
        this.depotDomiTitre.regimeSecteurActivite = RegimeSecteurActivite.non; // Set to NON
    } else {
        // Check the status if 'noPieceClient' is available
        this.checkTotalementExportatrice(this.depotDomiTitre.noPieceClient);

        // Fetch activity data based on 'noPieceClient'
        this.fetchActivityData(this.depotDomiTitre.noPieceClient);
    }
   
    // Fetch all required data once
    this.loadAgences();
    this.loadModeReglements();
    this.getAllDevises();
    this.fetchAllNoPieceCleint();
    this.fetchAllCodeUnite();
    this.getAllCodeModLiv();
    this.fetchDelaisReglementList();
    this.fetchRegimeStatList();
    this.populateActivitiesList(); 
    this.fetchActivities(); 
    this.fetchPaysOrigineList();
    this.loadAccordBctData();
    this.fetchAllNgp();
    this.fetchNgpData();
    this.isNgpDropdownVisible = new Array(this.depotDomiTitre.detailPDepotEntitys.length).fill(false);
    this.filteredCodeNgpList = new Array(this.depotDomiTitre.detailPDepotEntitys.length).fill([]);
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

goToNextStep() {
  const parentFieldset = jQuery('.form-wizard').find('.wizard-fieldset.show');
  const currentActiveStep = jQuery('.form-wizard-steps .active');
  let allFieldsFilled = true;

  // Validate required fields
  parentFieldset.find('.wizard-required').each((index: number, element: any) => {
    const thisValue = jQuery(element).val();

    if (!thisValue) {
      jQuery(element).siblings(".wizard-form-error").slideDown();
      allFieldsFilled = false;
    } else {
      jQuery(element).siblings(".wizard-form-error").slideUp();
    }
  });
// Validate the Activité principale code to ensure it's not empty and is a string (not an integer)
if (!this.depotDomiTitre.codeSecteurActiviteCode || this.depotDomiTitre.codeSecteurActiviteCode.trim() === '') {
  allFieldsFilled = false;
  jQuery('#natureDemande').siblings(".wizard-form-error").text('Veuillez enter un code Activité').slideDown();
} else {
  jQuery('#natureDemande').siblings(".wizard-form-error").slideUp();

} 
  // Ensure 'Nature de la demande' is not 'Selectionnez le type de demande'
  const natureDemandeValue = this.depotDomiTitre.natureDemande;
  if (natureDemandeValue === NatureDemande.dd) {
    allFieldsFilled = false;
    jQuery('#natureDemande').siblings(".wizard-form-error").text('Veuillez sélectionner une nature de demande valide').slideDown();
  } else {
    jQuery('#natureDemande').siblings(".wizard-form-error").slideUp();
  }

  // Ensure 'Code du titre' is not 'Selectionnez le code titre'
  const codeTitreValue = this.depotDomiTitre.codeTitre;
  if (codeTitreValue === CodeTitre.aa) {
    allFieldsFilled = false;
    jQuery('#codeTitre').siblings(".wizard-form-error").text('Veuillez sélectionner un code titre valide').slideDown();
  } else {
    jQuery('#codeTitre').siblings(".wizard-form-error").slideUp();
  }
// Check if codeAgenceValue is an empty string or not selected
const codeAgenceValue = this.depotDomiTitre.codeAgence;

// Convert to string and check if it's empty or not
if (!codeAgenceValue || codeAgenceValue.toString().trim() === '') {
    allFieldsFilled = false;
    // Show the error message if codeAgenceValue is empty
    jQuery('#codeAgence').siblings(".wizard-form-error").text('Veuillez sélectionner un code Agence valide').slideDown();
} else {
    // Hide the error message if codeAgenceValue is valid
    jQuery('#codeAgence').siblings(".wizard-form-error").slideUp();
}
  // Ensure 'Matricule Fiscale' is not empty
  const matriculeFiscaleValue = this.depotDomiTitre.noPieceClient;
  if (!matriculeFiscaleValue || matriculeFiscaleValue.trim() === '') {
    allFieldsFilled = false;
    jQuery('#noPieceClient').siblings(".wizard-form-error").text('Veuillez entrer un Matricule Fiscale').slideDown();
  } else {
    jQuery('#noPieceClient').siblings(".wizard-form-error").slideUp();
  }

  // Proceed to next step if all fields are filled and valid
  if (allFieldsFilled) {
    parentFieldset.removeClass("show");
    currentActiveStep.removeClass('active').addClass('activated').next().addClass('active');
    parentFieldset.next('.wizard-fieldset').addClass("show");

    // Update step indicators
    jQuery('.wizard-fieldset').each((index: number, element: any) => {
      if (jQuery(element).hasClass('show')) {
        const formAttr = jQuery(element).attr('data-tab-content');
        jQuery('.form-wizard-steps .form-wizard-step-item').each((index2: number, element2: any) => {
          if (jQuery(element2).attr('data-attr') === formAttr) {
            jQuery(element2).addClass('active');
            const innerWidth = jQuery(element2).innerWidth();
            const position = jQuery(element2).position();
            jQuery('.form-wizard-step-move').css({ left: position.left + 'px', width: innerWidth + 'px' });
          } else {
            jQuery(element2).removeClass('active');
          }
        });
      }
    });
  }
}

goToNextStep2() {
  const parentFieldset = jQuery('.form-wizard').find('.wizard-fieldset.show');
  const currentActiveStep = jQuery('.form-wizard-steps .active');
  let nextWizardStep = true;

  // Clear previous error messages
  parentFieldset.find('.wizard-form-error').slideUp();

  // Validate required fields with specific checks for grouped fields
  parentFieldset.find('.wizard-required').each((index: number, element: any) => {
      const thisValue = jQuery(element).val();
      const fieldName = jQuery(element).attr('placeholder'); // Get placeholder as field name
      
      // Ensure fieldName is defined
      if (fieldName === undefined) {
          return; // Skip if placeholder is not available
      }

      // Grouping similar fields for error messages
      if (thisValue === "") {
          if (fieldName.includes('Montant PTFN')) {
              // For Montant PTFN (DVS) and Montant PTFN (TND)
              jQuery('.wizard-form-error.montant-ptfn').text('Veuillez entrer Montant PTFN').slideDown();
          } else if (fieldName.includes('Montant FOB')) {
              // For Montant FOB (DVS) and Montant FOB (TND)
              jQuery('.wizard-form-error.montant-fob').text('Veuillez entrer Montant FOB').slideDown();
          } else if (fieldName.includes('Nom fournisseur')) {
              // For Nom fournisseur
              jQuery('.wizard-form-error.nom-fournisseur').text('Veuillez entrer les données fournisseur').slideDown();
          } else if (fieldName.includes('Nom client') || fieldName.includes('Adresse client')) {
              // For Nom client and Adresse client
              jQuery('.wizard-form-error.client').text('Veuillez entrer les données client').slideDown();
          } else {
              // For other fields
              jQuery(element).siblings(".wizard-form-error").text(`Veuillez entrer ${fieldName}`).slideDown();
          }
          nextWizardStep = false;
      } else {
          // Hide error if field is not empty
          if (fieldName.includes('Montant PTFN')) {
              jQuery('.wizard-form-error.montant-ptfn').slideUp();
          } else if (fieldName.includes('Montant FOB')) {
              jQuery('.wizard-form-error.montant-fob').slideUp();
          } else if (fieldName.includes('Nom fournisseur')) {
              jQuery('.wizard-form-error.nom-fournisseur').slideUp();
          } else if (fieldName.includes('Nom client') || fieldName.includes('Adresse client')) {
              jQuery('.wizard-form-error.client').slideUp();
          } else {
              jQuery(element).siblings(".wizard-form-error").slideUp();
          }
      }
  });

  // Check if date_facture is less than 3 months from today
  const dateFacture = this.depotDomiTitre.dateContratCom; // get the value of date_facture from your form
  const today = new Date();
  const threeMonthsAgo = new Date(today.getFullYear(), today.getMonth() - 3, today.getDate());

  if (dateFacture && new Date(dateFacture) < threeMonthsAgo) {
      // Date_facture is less than 3 months ago, skip to page 4
      nextWizardStep = true; // Ensure nextWizardStep is true
      parentFieldset.removeClass("show");
      currentActiveStep.removeClass('active').addClass('activated').next().next().addClass('active'); // Skip to next next page
      parentFieldset.next().next('.wizard-fieldset').addClass("show");

      this.updateWizardStepIndicator();
  } else {
      // Date_facture is not less than 3 months ago, proceed as usual
      if (nextWizardStep) {
          parentFieldset.removeClass("show");
          currentActiveStep.removeClass('active').addClass('activated').next().addClass('active');
          parentFieldset.next('.wizard-fieldset').addClass("show");

          this.updateWizardStepIndicator();
      }
  }
}

// Helper function to update the wizard step indicator
updateWizardStepIndicator() {
  jQuery('.wizard-fieldset').each((index: number, element: any) => {
      if (jQuery(element).hasClass('show')) {
          const formAttr = jQuery(element).attr('data-tab-content');
          jQuery('.form-wizard-steps .form-wizard-step-item').each((index2: number, element2: any) => {
              if (jQuery(element2).attr('data-attr') === formAttr) {
                  jQuery(element2).addClass('active');
                  const innerWidth = jQuery(element2).innerWidth();
                  const position = jQuery(element2).position();
                  jQuery('.form-wizard-step-move').css({ left: position.left + 'px', width: innerWidth + 'px' });
              } else {
                  jQuery(element2).removeClass('active');
              }
          });
      }
  });
}

goToNextStep3() {
  const parentFieldset = jQuery('.form-wizard').find('.wizard-fieldset.show');
  const currentActiveStep = jQuery('.form-wizard-steps .active');
  let nextWizardStep = true;
  parentFieldset.find('.wizard-form-error').slideUp();

  // Validate 'Accord BCT' section
  if (this.selectedOption === 'AccordBCT') {
    if (!this.depotDomiTitre.typeAccordBct) {
      this.displayError('#typeAccord', 'Veuillez sélectionner un type d\'accord BCT.');
      nextWizardStep = false;
    }
    if (!this.depotDomiTitre.numAccordBct) {
      this.displayError('#numeroAccordBCT', 'Veuillez fournir un numéro d\'accord BCT.');
      nextWizardStep = false;
    }
    if (!this.depotDomiTitre.dateAccordBct) {
      this.displayError('#dateAccordBCT', 'Veuillez sélectionner une date d\'accord BCT.');
      nextWizardStep = false;
    }
    if (!this.depotDomiTitre.observationAccordBct) {
      this.displayError('#observationAccordBCT', 'Veuillez fournir une observation pour l\'accord BCT.');
      nextWizardStep = false;
    }
  }

  // Validate 'Assurance' section
    if (!this.assuranceType) {
      jQuery('input[name="assuranceType"]')
        .closest('.form-group')
        .find('.wizard-form-error')
        .text('Veuillez sélectionner un type d\'assurance ou garantie bancaire.')
        .slideDown();
      nextWizardStep = false;
    }
    if (!this.depotDomiTitre.numAssurance) {
      this.displayError('#numeroAssurance', `Veuillez fournir un numéro pour ${this.assuranceType}.`);
      nextWizardStep = false;
    }
    if (!this.depotDomiTitre.dateAssurance) {
      this.displayError('#dateAssurance', `Veuillez fournir une date pour ${this.assuranceType}.`);
      nextWizardStep = false;
    }
  
  if (nextWizardStep) {
    this.moveToNextStep(parentFieldset, currentActiveStep);
  }
}

displayError(selector: string, message: string) {
  jQuery(selector).siblings('.wizard-form-error').text(message).slideDown();
}
moveToNextStep(parentFieldset: any, currentActiveStep: any) {
  parentFieldset.removeClass('show');
  currentActiveStep.removeClass('active').addClass('activated');
  const nextFieldset = parentFieldset.next('.wizard-fieldset');
  if (nextFieldset.length) {
    nextFieldset.addClass('show');
    currentActiveStep.next().addClass('active');
  }

  // Update wizard step indicators
  this.updateWizardStepIndicator();
}
goToNextStep4() {
  const parentFieldset = jQuery('.form-wizard').find('.wizard-fieldset.show');
  const currentActiveStep = jQuery('.form-wizard-steps .active');
  let allFieldsFilled = true;
  let totalMontantNGP = 0;

  // Clear previous error messages
  parentFieldset.find('.wizard-form-error').slideUp();

  // Validate required fields
  parentFieldset.find('.wizard-required').each((index: number, element: any) => {
    const thisValue = jQuery(element).val();
    const placeholder = 
      jQuery(element).attr('placeholder') || 
      jQuery(element).data('placeholder') || 
      'ce champ obligatoire'; // Valeur par défaut
  
    if (!thisValue) {
      const errorMessage = `Veuillez entrer ${placeholder}`;
      console.log('Placeholder:', placeholder);
  
      jQuery(element)
        .siblings(".wizard-form-error")
        .text(errorMessage)
        .slideDown();
  
      this.openDialog('Erreur', errorMessage);
      allFieldsFilled = false;
    }
  });
  
  

  // Calculate total Montant NGP
  this.depotDomiTitre.detailPDepotEntitys.forEach(detailPDepot => {
      if (detailPDepot.montantDvsNgp) {
          totalMontantNGP += detailPDepot.montantDvsNgp; // Directly add the number
      }
  });

  // Check conditions for Montant NGP
  const numberOfNgps = this.numberOfNgps; // Assuming this is the number of NGPs entered by the user
  if (numberOfNgps > 1) {
      // If number of NGPs is greater than 1, total Montant NGP must equal the total amount of PTFN in currency
      const totalMontantPTFN = this.depotDomiTitre.mntDvsPtfnFact || 0; // Use DVS amount
      if (totalMontantNGP !== totalMontantPTFN) {
          allFieldsFilled = false;
          jQuery('#montantNGP').siblings(".wizard-form-error").text('La somme des Montants NGP doit être équivalente au montant total PTFN en devise.').slideDown();
          this.openDialog('Erreur', 'La somme des Montants NGP doit être équivalente au montant total PTFN en devise.');
      }
  } else if (numberOfNgps === 1) {
      // If only one NGP, Montant NGP must equal Montant PTFN in currency
      const montantPTFN = this.depotDomiTitre.mntDvsPtfnFact || 0; // Use DVS amount
      if (totalMontantNGP !== montantPTFN) {
          allFieldsFilled = false;
          jQuery('#montantNGP').siblings(".wizard-form-error").text('Le Montant NGP doit être équivalent au Montant PTFN en devise.').slideDown();
          this.openDialog('Erreur', 'Le Montant NGP doit être équivalent au Montant PTFN en devise.');
      }
  }

  // Proceed to next step if all fields are filled and valid
  if (allFieldsFilled) {
      parentFieldset.removeClass("show");
      currentActiveStep.removeClass('active').addClass('activated').next().addClass('active');
      parentFieldset.next('.wizard-fieldset').addClass("show");

      // Update step indicators
      this.updateWizardStepIndicator();
  }
}
    goToPreviousStep() {
    const currentActiveStep = jQuery('.form-wizard-steps .active');

    jQuery('.form-wizard').find('.wizard-fieldset.show').removeClass("show").prev('.wizard-fieldset').addClass("show");
    currentActiveStep.removeClass('active').prev().removeClass('activated').addClass('active');

    jQuery('.wizard-fieldset').each((index: number, element: any) => {
      if (jQuery(element).hasClass('show')) {
        const formAttr = jQuery(element).attr('data-tab-content');
        jQuery('.form-wizard-steps .form-wizard-step-item').each((index2: number, element2: any) => {
          if (jQuery(element2).attr('data-attr') === formAttr) {
            jQuery(element2).addClass('active');
            const innerWidth = jQuery(element2).innerWidth();
            const position = jQuery(element2).position();
            jQuery('.form-wizard-step-move').css({ left: position.left + 'px', width: innerWidth + 'px' });
          } else {
            jQuery(element2).removeClass('active');
          }
        });
      }
    });
  }

  createDepotDomiciliationTitre() {
    // Check if files are selected
    if (this.selectedFiles.length > 0) {
      // Upload files first
      this.uploadFilesAndCreateDepot(this.selectedFiles);
    } else {
      // If no files are selected, just create the DepotDomiciliationTitre
      this.depotdomititreservice.createDepotDomiciliationTitre(this.depotDomiTitre).subscribe(response => {
        console.log('DepotDomiciliationTitre created', response);
        this.openDialog('Succès', 'Le dossier a été créé avec succès !'); 
        // Clear all fields
      this.resetForm();

      // Show the first fieldset
      this.showFirstFieldset();
      }, error => {
        console.error('Error creating DepotDomiciliationTitre:', error);
        this.openDialog('Erreur', 'Une erreur s\'est produite lors de la création du dossier.');
      });
    }
  }
  resetForm() {
    this.depotDomiTitre = {
      natureDemande: NatureDemande.dd,
      codeAgence: NaN,
      codeagencelibele:'',
      typePieceClient: NaN,
      noPieceClient: '',
      numCompte: '',
      regimeSecteurActivite: RegimeSecteurActivite.non,
      activitePrincipaleSecondaire: ActivitePrincipaleSecondaire.PRINCIPALE,
      codeSecteurActivite: '',
      codeSecteurActiviteSec: '',
      activiteType: 'primaire',
      codeTitre: CodeTitre.aa,
      numDom: NaN,
      dateDom: null,
      numDepot: NaN,
      dateDepot: null,
      numeroDossier: '',
      numeroDemande: '',
      numContratCom: '',
      dateContratCom: null,
      codeDevise: '',
      mntDvsPtfnFact: NaN,
      mntDvsFobFact: NaN,
      mntTndFob: NaN,
      mntTndPtfn: NaN,
      acompte: NaN,
      nomFournisseur: '',
      adrFournisseur: '',
      nomClient: '',
      adrClient: '',
      codPayAch: '',
      codePaysDestDef: '',
      codPayProv: '',
      codPayOrig: '',
      libPaysOrig: '',
      libPaysAch: '',
      libPaysProv: '',
      libPaysDestDef: '',
      codeModLiv: NaN,
      codeModReg: '',
      libModReg: '',
      codeDelReg: '',
      libDelReg: '',
      codeRegimeStat: '',
      libRegimeStat: '',
      nbrColis: NaN,
      typeAccordBct: '',
      numAccordBct: '',
      dateAccordBct: null,
      observationAccordBct: '',
      numAssurance: '',
      dateAssurance: null,
      numCotunas: NaN,
      dateCotunas: null,
      dateValidite: null,
      dateApurement: null,
      observation: '',
      matEmp: '',
      status: '',
      dateValidation: null,
      codeEnvoiSpecial: '',
      detailPDepotEntitys: [
        {
          codeNgp: NaN,
          montantDvsNgp: NaN,
          codePaysOrigNgp: NaN,
          codeUnite: NaN,
          testReserve: '',
          qteNgp: NaN,
        }
      ],
      fileEntity: [
        {
          fileName: '',
          fileType: '',
          data: new Uint8Array(0),
        }
      ],
      etatVerif: EtatVerif.En_Attente_De_Verification,
      codeSecteurActiviteCode: '',
      codeSecteurActiviteLabel: '',
      codeSecteurActiviteSecCode: '',
      codeSecteurActiviteSecLabel: '',
      codeModLivCode: '',
      codeModLivLabel: '',
      sigleDevise: '',
      libDevise: '',
     
    };
  
    // Reset other relevant variables if necessary
    this.selectedFiles = [];
    this.nomPrenom = undefined;
  }
  showFirstFieldset() {
    // Logic to show the first fieldset and hide others
    const fieldsets = document.querySelectorAll('fieldset.wizard-fieldset');
    fieldsets.forEach((fieldset, index) => {
      if (index === 0) {
        fieldset.classList.add('show'); // Show the first fieldset
      } else {
        fieldset.classList.remove('show'); // Hide other fieldsets
      }
    });
  }  
  showSecondFieldset() {
    // Logic to show the second fieldset and hide others
    const fieldsets = document.querySelectorAll('fieldset.wizard-fieldset');
    fieldsets.forEach((fieldset, index) => {
      if (index === 1) {
        fieldset.classList.add('show'); // Show the second fieldset
      } else {
        fieldset.classList.remove('show'); // Hide other fieldsets
      }
    });
  }
  
  showThirdFieldset() {
    // Logic to show the third fieldset and hide others
    const fieldsets = document.querySelectorAll('fieldset.wizard-fieldset');
    fieldsets.forEach((fieldset, index) => {
      if (index === 2) {
        fieldset.classList.add('show'); // Show the third fieldset
      } else {
        fieldset.classList.remove('show'); // Hide other fieldsets
      }
    });
  }
  
  showFourthFieldset() {
    // Logic to show the fourth fieldset and hide others
    const fieldsets = document.querySelectorAll('fieldset.wizard-fieldset');
    fieldsets.forEach((fieldset, index) => {
      if (index === 3) {
        fieldset.classList.add('show'); // Show the fourth fieldset
      } else {
        fieldset.classList.remove('show'); // Hide other fieldsets
      }
    });
  }
  
  showFifthFieldset() {
    // Logic to show the fifth fieldset and hide others
    const fieldsets = document.querySelectorAll('fieldset.wizard-fieldset');
    fieldsets.forEach((fieldset, index) => {
      if (index === 4) {
        fieldset.classList.add('show'); // Show the fifth fieldset
      } else {
        fieldset.classList.remove('show'); // Hide other fieldsets
      }
    });
  }
  
  getCodeTitreOptions(): string[] {
    if (this.depotDomiTitre.natureDemande === NatureDemande.DEPOT) {
      return [
          CodeTitre.aa,
        CodeTitre.AUTORISATION_IMPORTATION,
        CodeTitre.AUTORISATION_EXPORTATION
      ];
    } else if (
        this.depotDomiTitre.natureDemande === NatureDemande.DEROGATION 
      
    ) {
      return [
          CodeTitre.aa,
        CodeTitre.FACTURE_DEFINITIVE,
        CodeTitre.ADMISSION_TEMPORAIRE,
        CodeTitre.AUTORISATION_IMPORTATION,
        CodeTitre.AUTORISATION_EXPORTATION,
        CodeTitre.CERTIFICAT_D_IMPORTATION
      ];
    
  } else if (
    this.depotDomiTitre.natureDemande === NatureDemande.DOMICILIATION 
      ) {
        return [
            CodeTitre.aa,
          CodeTitre.FACTURE_DEFINITIVE,
          CodeTitre.ADMISSION_TEMPORAIRE,
          CodeTitre.CERTIFICAT_D_IMPORTATION
        ];
      }    
    else {
      return [CodeTitre.aa];
    }
  }
 
  loadAgences(): void {
    this.refService.getAgence().subscribe({
      next: (data) => {
        this.agences = data;
        this.filteredAgences = [...data];
        console.log('Agences chargées:', this.agences);
      },
      error: (err) => {
        console.error('Erreur lors du chargement des agences :', err);
      }
    });
  }
  
  getAllDevises(): void {
    this.refService.getAllDevises().subscribe((data: Devise[]) => {
      this.codeDeviseList = data;
      this.filteredDevises = [...data]; 
  });
}
// Show the modal for selecting a devise
isDeviseModalOpen = false;
showDeviseList(): void {
  console.log('Opening devise selection modal');
  this.isDeviseModalOpen = true; // Open the modal

}
closeDeviseModal(): void {
  this.isDeviseModalOpen = false;
  this.searchDevise = ''; 
  this.filteredDevises = [...this.codeDeviseList];; 
}
convertMntPTFNDvsToPTFNTnd(): void {
 // Ensure depotDomiTitre and codeDevise are defined
 if (!this.depotDomiTitre || !this.depotDomiTitre.codeDevise) {
  this.depotDomiTitre = this.depotDomiTitre ?? {}; // Initialize depotDomiTitre if it's null
  this.depotDomiTitre.mntDvsPtfnFact = null;
  this.dialog.open(AlertDialogComponent, {
    data: {title:'Error', message: 'Saisie Obligatoire de la Devise....!' }
  });
  return;

}

// Check if mntDvsPtfnFact is not 0 or null
if (this.depotDomiTitre.mntDvsPtfnFact != null && this.depotDomiTitre.mntDvsPtfnFact !== 0) {
  // Reset values
  this.depotDomiTitre.mntDvsFobFact = null;
  this.depotDomiTitre.mntTndPtfn = null;
  this.depotDomiTitre.mntTndFob = null;

  // If the devise code is 788, assign the value directly
  if (Number(this.depotDomiTitre.codeDevise) === 788) {
    this.depotDomiTitre.mntTndPtfn = this.depotDomiTitre.mntDvsPtfnFact;

    // Additional condition for codeModLiv (if needed)
    if ([9, 10].includes(this.depotDomiTitre.codeModLiv ?? 0)) {
      this.depotDomiTitre.mntDvsFobFact = this.depotDomiTitre.mntDvsPtfnFact;
      this.depotDomiTitre.mntTndFob = this.depotDomiTitre.mntDvsPtfnFact;
    }
  } else {
    // Convert to TND based on the current exchange rate if devise code is not 788
    const today = new Date().toISOString().split('T')[0];
    this.refService.getConversionRate(today, Number(this.depotDomiTitre.codeDevise)).subscribe(rate => {
      if (rate) {
        // Calculate TND amounts using the conversion rate
        this.depotDomiTitre.mntTndPtfn = (this.depotDomiTitre?.mntDvsPtfnFact ?? 0) * rate;

        // Additional condition for codeModLiv (if needed)
        if ([9, 10].includes(this.depotDomiTitre.codeModLiv ?? 0)) {
          this.depotDomiTitre.mntDvsFobFact = this.depotDomiTitre.mntDvsPtfnFact;
          this.depotDomiTitre.mntTndFob = (this.depotDomiTitre.mntDvsPtfnFact ?? 0) * rate;
        }
      } else {
        // Open an alert dialog if conversion rate is unavailable
        this.dialog.open(AlertDialogComponent, {
          data: {title:'Error', message: 'Taux de conversion non disponible pour la date et la devise sélectionnées.' }
        });
  }
}); 
}}
}
convertMntFOBDvsToFOBTnd(): void {
  // Check if depotDomiTitre or codeDevise is null
  if (!this.depotDomiTitre || !this.depotDomiTitre.codeDevise) {
    this.depotDomiTitre = this.depotDomiTitre ?? {}; // Initialize depotDomiTitre if it's null
    this.depotDomiTitre.mntDvsFobFact = null;
    this.dialog.open(AlertDialogComponent, {
      data: { title:'Error', message: 'Saisie Obligatoire de la Devise....!' }
    });
    return;
  }

  // Check if mntDvsFobFact is not 0 or null
  if (this.depotDomiTitre.mntDvsFobFact) {
    // Reset mntTndFob value initially
    this.depotDomiTitre.mntTndFob = null;

    // If devise code is 788, assign mntDvsFobFact directly to mntTndFob
    if (Number(this.depotDomiTitre.codeDevise) === 788) {
      this.depotDomiTitre.mntTndFob = this.depotDomiTitre.mntDvsFobFact;

      // Additional condition for specific codeModLiv values
      if ([9, 10].includes(this.depotDomiTitre.codeModLiv ?? 0)) {
        this.depotDomiTitre.mntDvsPtfnFact = this.depotDomiTitre.mntDvsFobFact;
        this.depotDomiTitre.mntTndFob = this.depotDomiTitre.mntDvsFobFact; // Ensure consistent values if necessary
      }
    } else {
      // Convert to TND using the exchange rate if devise code is not 788
      const currentDate = new Date().toISOString().split('T')[0]; // Format date to YYYY-MM-DD
      this.refService.getConversionRate(currentDate, Number(this.depotDomiTitre.codeDevise)).subscribe(rate => {
        if (rate !== null) {
          this.depotDomiTitre.mntTndFob = Number(this.depotDomiTitre.mntDvsFobFact) * rate;
        } else {
          // Open an alert dialog if conversion rate is unavailable
          this.dialog.open(AlertDialogComponent, {
            data: {title:'Error', message: 'Taux de conversion non disponible pour la date et la devise sélectionnées.' }
          });
        }
      });
    }
  }
}


onDeviseSelected(selectedDevise: Devise): void {
  this.depotDomiTitre.codeDevise = selectedDevise.codeDevise.toString(); 
  this.depotDomiTitre.sigleDevise = selectedDevise.sigleDevise;
  this.depotDomiTitre.libDevise = selectedDevise.libDevise;
  this.isDeviseModalOpen = false;
}


onDeviseEnter(): void {
  console.log('Devise code entered:', this.depotDomiTitre.codeDevise);

  // Check if codeDevise is not an empty string before converting
  const codeDeviseNumber = this.depotDomiTitre.codeDevise
    ? Number(this.depotDomiTitre.codeDevise)
    : null;

  const selectedDevise = this.codeDeviseList.find(
    devise => devise.codeDevise === codeDeviseNumber
  );

  if (selectedDevise) {
    this.depotDomiTitre.libDevise = selectedDevise.libDevise;
  } else {
    this.depotDomiTitre.libDevise = 'Libellé de la devise introuvable';
  }
}
filterDevises(): void {
    if (this.searchDevise) {
      const searchTerm = this.searchDevise.toLowerCase();
      console.log("Recherche : ", this.searchDevise);
      this.filteredDevises = this.codeDeviseList.filter(devise =>
        devise.codeDevise.toString().toLowerCase().includes(searchTerm) ||
        devise.libDevise.toLowerCase().includes(searchTerm) ||
        devise.sigleDevise.toLowerCase().includes(searchTerm)
      );
    } else {
      this.filteredDevises = [...this.codeDeviseList]; // Reset to show all if search is empty
    }
  }



  fetchAllNoPieceCleint(): void {
    this.refservice.getAllNoPieceClient().subscribe(
        (data: number[]) => {
          this.allNoPieceClientList = data;
        },
        (error) => {
          console.error('Error fetching codePays', error);
        }
    );
  }

  loadAccordBctData(typeAccordBct: string = 'L'): void {
    this.refService.getAllNumAccordBct(typeAccordBct).subscribe(
      (data) => {
        this.allNumAccordBctList = data;
      },
      (error) => {
        console.error('Erreur lors du chargement des numéros d’accord BCT:', error);
      }
    );
  
    this.refService.getAllDateAccordBct(typeAccordBct).subscribe(
      (data) => {
        this.allDateAccordBctList = data.map((date) => new Date(date)); // Stocker les dates brutes
        this.formattedDateAccordBctList = this.allDateAccordBctList.map((date) =>
          date.toLocaleDateString('fr-FR') // Formater les dates
        );
      },
      (error) => {
        console.error('Erreur lors du chargement des dates d’accord BCT:', error);
      }
    );
}

onTypeAccordBctChange(typeAccordBct: string): void {
  if (typeAccordBct) {
    this.loadAccordBctData(typeAccordBct);
    // Subscribe to the service response and set defaults
    this.refService.getAllNumAccordBct(typeAccordBct).subscribe(
      (data) => {
        this.allNumAccordBctList = data;
        if (data.length > 0) {
          this.depotDomiTitre.numAccordBct = data[0].toString(); // Select first numéro by default
        }
      },
      (error) => {
        console.error('Erreur lors du chargement des numéros d’accord BCT:', error);
      }
    );

    this.refService.getAllDateAccordBct(typeAccordBct).subscribe(
      (data) => {
        this.allDateAccordBctList = data.map((date) => new Date(date)); // Store raw dates
        this.formattedDateAccordBctList = this.allDateAccordBctList.map((date) =>
          date.toLocaleDateString('fr-FR') // Format dates
        );
        if (this.allDateAccordBctList.length > 0) {
          this.depotDomiTitre.dateAccordBct = this.allDateAccordBctList[0]; // Select first date by default
        }
      },
      (error) => {
        console.error('Erreur lors du chargement des dates d’accord BCT:', error);
      }
    );
  } else {
    this.allNumAccordBctList = [];
    this.allDateAccordBctList = [];
    this.formattedDateAccordBctList = [];
    this.depotDomiTitre.numAccordBct = '';
    this.depotDomiTitre.dateAccordBct = null; // Clear selection
  }
}

consultAccord(): void {
  const { typeAccordBct, numAccordBct, dateAccordBct } = this.depotDomiTitre;

  if (!typeAccordBct || !numAccordBct || !dateAccordBct) {
    console.error('Please ensure all fields (type, number, and date) are filled out.');
    return; // Stop further execution if validation fails
  }

  // Format the date to YYYY-MM-DD
  const formattedDate = this.formatDateToISO(dateAccordBct);

  // Convert numAccordBct to a number
  const numAccordBctValue = Number(numAccordBct);
  if (isNaN(numAccordBctValue)) {
    console.error('Invalid number for numAccordBct. Please provide a valid numeric value.');
    return;
  }

  // Fetch accord details
  this.refService.getDetailAccord(typeAccordBct, numAccordBctValue, formattedDate)
    .subscribe(
      (data) => {
        console.log('Accord details successfully fetched:', data);
        this.accordDetails = data;

        // Fetch documents related to this accord
        this.genService.getDocumentsByNumDossier(numAccordBctValue).subscribe(
          (documents) => {
            console.log('Documents retrieved successfully:', documents);
            if (this.accordDetails) {
              this.accordDetails.documents = documents;  // Add documents to accordDetails
            }
            this.openModal();  
          },
          (error) => {
            console.error('Error fetching documents:', error);
            this.openDialog('Error', 'Erreur lors de la récupération des documents');
          }
        );
      },
      (error) => {
        console.error('Error fetching accord details:', error);
        this.openDialog('Error', 'Erreur lors de la récupération des détails de l\'accord');
      }
    );
}

// Utility function for formatting date
private formatDateToISO(date: Date): string {
  return date.toISOString().split('T')[0]; // Convert Date to YYYY-MM-DD format
}
openModal() {
  this.showModal = true; // Exemple : Montre la modal
}

closeModale() {
  this.showModal = false; // Exemple : Ferme la modal
}

  fetchAllCodeUnite(): void {
    this.refservice.getAllCodeUnite().subscribe(
        (data: number[]) => {
          this.allCodeUniteList = data;
        },
        (error) => {
          console.error('Error fetching codePays', error);
        }
    );
  }
  fetchNgpData(): void {
    console.log('Fetching NGP data...'); // Message avant l'appel API
  
    this.refService.getAllNgp().subscribe(
      (data: DonneeNgp[]) => {
        this.ngpData = data;
        console.log('NGP data fetched successfully:', this.ngpData); // Afficher les données récupérées
      },
      (error) => {
        console.error('Error fetching NGP data:', error);
      }
    );
  }
  
  fetchAllNgp(): void {
    this.refservice.getAllCodeNgp().subscribe(
      (data: number[]) => {
        this.allCodeNgpList = data;
        console.log('Fetched NGP codes:', this.allCodeNgpList);
      },
      (error) => {
        console.error('Error fetching NGP codes:', error);
      }
    );
  }

  getAllCodeModLiv() {
    this.refservice.getAllCodeModLiv().subscribe((data: ModeDeLivraison[]) => {
      this.allCodeModLivList = data; 
    });
  }
  onModeLivEnter() {
    console.log('Mode of livraison code entered:', this.depotDomiTitre.codeModLivCode);
    const selectedMode = this.allCodeModLivList.find(
      mode => mode.codeModLiv === Number(this.depotDomiTitre.codeModLivCode)
    );
    if (selectedMode) {
      this.depotDomiTitre.codeModLivLabel = selectedMode.libModLiv;
    } else {
      this.depotDomiTitre.codeModLivLabel = ' Mode de livraison introuvable';
    }
  }
  
  showModeLivList(): void {
    console.log('Opening mode selection modal');
    this.isModalOpen = true; 
  }
  
  // Handle the selection from the modal
  onModeSelected(selectedMode: ModeDeLivraison): void {
    this.depotDomiTitre.codeModLivCode = selectedMode.codeModLiv.toString();
    this.depotDomiTitre.codeModLivLabel = selectedMode.libModLiv; 
    this.isModalOpen = false; 
  } 
  

  fetchDelaisReglementList() {
    this.refservice.getAllDelaisReglement()
      .subscribe(data => {
        this.allCodeDelRegList = data;
      });
    }
    fetchRegimeStatList() {
      this.refservice.getAllRegimeStat().subscribe(
        (data) => {
          this.allCodeRegimeStatListe = data;
          console.log('Fetched Regime Stat List:', this.allCodeRegimeStatListe);
        },
        (error) => {
          console.error('Error fetching regime stats:', error);
        }
      );
    }
 
  shouldShow(field: string): boolean {
    const codeTitre = this.depotDomiTitre.codeTitre;
    const natureDemande = this.depotDomiTitre.natureDemande;

    if (natureDemande === NatureDemande.DOMICILIATION) {
        switch (codeTitre) {
            case CodeTitre.FACTURE_DEFINITIVE: // Code Titre 22
                return field === 'paysProvenance' || field === 'paysDestination';

            case CodeTitre.CERTIFICAT_D_IMPORTATION: // Code Titre 33
            case CodeTitre.ADMISSION_TEMPORAIRE: // Code Titre 39
                return field === 'paysOrigine' || field === 'paysAchat';

            default:
                return true; 
        }
    }
    return true; 
}


  

  updateCodPaysValues(): void {
    const codeTitre = this.depotDomiTitre.codeTitre;
    const natureDemande = this.depotDomiTitre.natureDemande; 
    const paysMapping: { [key: string]: string } = {
      '788': 'TUNISIE',
     
    };

    // nature de demande DEPOT
    if (natureDemande === NatureDemande.DEPOT) {
        if (codeTitre === CodeTitre.AUTORISATION_EXPORTATION || codeTitre === CodeTitre.FACTURE_DEFINITIVE) {
            this.depotDomiTitre.codPayOrig = '788';
            this.depotDomiTitre.codPayAch = '788';
            this.depotDomiTitre.libPaysOrig = paysMapping['788'] || 'pay inconnu';
            this.depotDomiTitre.libPaysAch = paysMapping['788'] || 'pay inconnu';
        } else {
            this.depotDomiTitre.codPayOrig = '';
            this.depotDomiTitre.codPayAch = '';
            this.depotDomiTitre.libPaysOrig = '';
            this.depotDomiTitre.libPaysAch = '';
        }
  
        if (codeTitre === CodeTitre.AUTORISATION_IMPORTATION || codeTitre === CodeTitre.ADMISSION_TEMPORAIRE) {
            this.depotDomiTitre.codPayProv = '788';
            this.depotDomiTitre.codePaysDestDef = '788';
            this.depotDomiTitre.libPaysProv = paysMapping['788'] || 'pay inconnu';
            this.depotDomiTitre.libPaysDestDef = paysMapping['788'] || 'pay inconnu';
        } else {
            this.depotDomiTitre.codPayProv = '';
            this.depotDomiTitre.codePaysDestDef = '';
            this.depotDomiTitre.libPaysProv = '';
            this.depotDomiTitre.libPaysDestDef = '';
        }
    }

    // nature de demande DEROGATION
    if (natureDemande === NatureDemande.DEROGATION) {
        if (![CodeTitre.AUTORISATION_EXPORTATION, CodeTitre.FACTURE_DEFINITIVE, CodeTitre.AUTORISATION_IMPORTATION, CodeTitre.ADMISSION_TEMPORAIRE,CodeTitre.CERTIFICAT_D_IMPORTATION].includes(codeTitre)) {
          this.dialog.open(AlertDialogComponent, {
            data: { title:'Error', message: 'Code titre Erroné...' }
        });
    
      } else {
        // Mettre à jour le regime_stat
        if ([CodeTitre.AUTORISATION_IMPORTATION, CodeTitre.CERTIFICAT_D_IMPORTATION, CodeTitre.ADMISSION_TEMPORAIRE].includes(codeTitre)) {
            this.depotDomiTitre.codeRegimeStat = '10'; 
            this.depotDomiTitre.libRegimeStat = 'MISE A LA CONSOMMATION';
        } else if ([CodeTitre.AUTORISATION_EXPORTATION, CodeTitre.FACTURE_DEFINITIVE].includes(codeTitre)) {
            this.depotDomiTitre.codeRegimeStat = '55';  
            this.depotDomiTitre.libRegimeStat = 'EXPORTATION DEFINITIVE';
        } else {
            this.depotDomiTitre.codeRegimeStat = '';  
            this.depotDomiTitre.libRegimeStat = '';
        }
    
            if ([CodeTitre.AUTORISATION_IMPORTATION, CodeTitre.CERTIFICAT_D_IMPORTATION, CodeTitre.ADMISSION_TEMPORAIRE].includes(codeTitre)) {
                this.depotDomiTitre.codPayProv = '788';
                this.depotDomiTitre.codePaysDestDef = '788';
                this.depotDomiTitre.libPaysProv = paysMapping['788'] || 'pay inconnu';
                this.depotDomiTitre.libPaysDestDef = paysMapping['788'] || 'pay inconnu';
            } else {
                this.depotDomiTitre.codPayOrig = '788';
                this.depotDomiTitre.codPayAch = '788';
                this.depotDomiTitre.libPaysOrig = paysMapping['788'] || 'pay inconnu';
                this.depotDomiTitre.libPaysAch = paysMapping['788'] || 'pay inconnu';
            }
        }
    }
}


    protected readonly ActivitePrincipaleSecondaire = ActivitePrincipaleSecondaire;
    onRebriqueInput(event: Event): void {
      const input = (event.target as HTMLInputElement).value;
      this.numberOfNgps = parseInt(input, 10) || 1;
      this.cdr.detectChanges(); // Force Angular to detect changes
      console.log('Change detection triggered. Updated numberOfNgps:', this.numberOfNgps);
    }
    logNgpChange(event: any): void {
      console.log('ngModelChange event fired. Updated value:', event);
    }
    updateDetailPDepotEntities(): void {
      console.log('Updating DetailPDepotEntitys. Entered numberOfNgps:', this.numberOfNgps);
    
      if (this.numberOfNgps < 1 || isNaN(this.numberOfNgps)) {
        console.error('Invalid numberOfNgps:', this.numberOfNgps);
        return;
      }
    
      const currentCount = this.depotDomiTitre.detailPDepotEntitys.length;
      console.log('Current entity count:', currentCount);
    
      if (this.numberOfNgps > currentCount) {
        for (let i = currentCount; i < this.numberOfNgps; i++) {
          this.depotDomiTitre.detailPDepotEntitys.push({
            codeNgp: NaN,
            montantDvsNgp: NaN,
            codePaysOrigNgp: NaN,
            codeUnite: NaN,
            testReserve: "",
            qteNgp: NaN,
          });
        }
      } else if (this.numberOfNgps < currentCount) {
        this.depotDomiTitre.detailPDepotEntitys.splice(this.numberOfNgps, currentCount - this.numberOfNgps);
      }
    
      console.log('Updated detailPDepotEntitys:', this.depotDomiTitre.detailPDepotEntitys);
    }
    

    onRebriqueEnter(): void {
      console.log('Enter key pressed. Current numberOfNgps (before update):', this.numberOfNgps);
      this.updateDetailPDepotEntities();
      console.log('Number of NGPs after Enter key pressed:', this.numberOfNgps);
    }
    
    
onRebriqueChange(): void {
  console.log('Field changed. Current numberOfNgps:', this.numberOfNgps);
  this.updateDetailPDepotEntities();
}


removeDetailPDepotEntity(index: number): void {
  if (index >= 0 && index < this.depotDomiTitre.detailPDepotEntitys.length) {
    // Remove the NGP at the specified index
    this.depotDomiTitre.detailPDepotEntitys.splice(index, 1);
    console.log(`Removed NGP at index ${index}.`);

    // Update the 'Rébrique' field to match the new number of NGPs
    this.numberOfNgps = this.depotDomiTitre.detailPDepotEntitys.length;

    console.log('Updated numberOfNgps:', this.numberOfNgps);
  } else {
    console.error(`Invalid index: ${index}. Unable to remove NGP.`);
  }
}
toggleNgpDropdown(index: number): void {
  console.log(`Toggling dropdown for index: ${index}`);
  this.isNgpDropdownVisible[index] = !this.isNgpDropdownVisible[index];
  console.log(`Dropdown visibility for index ${index}:`, this.isNgpDropdownVisible[index]);
}

onNgpInput(event: Event, index: number): void {
  const inputValue = (event.target as HTMLInputElement).value.toLowerCase();
  console.log(`Filtering for input: ${inputValue} at index: ${index}`);

  this.filteredCodeNgpList[index] = this.allCodeNgpList
    .map(codeNgp => codeNgp.toString())
    .filter(codeNgp => codeNgp.toLowerCase().includes(inputValue));

  console.log(`Filtered NGP list at index ${index}:`, this.filteredCodeNgpList[index]);
}

selectNgp(selectedNgp: string, index: number): void {
  if (index >= 0 && index < this.depotDomiTitre.detailPDepotEntitys.length) {
    this.depotDomiTitre.detailPDepotEntitys[index].codeNgp = +selectedNgp; // Assign the selected value
    this.isNgpDropdownVisible[index] = false; // Close the dropdown
console.log(`Selected NGP: ${selectedNgp} for index ${index}`);
  } else {
    console.error(`Invalid index: ${index}. Unable to select NGP.`);
  }
}

afficherLibelle(codeNgp: number): void {
  console.log('AfficherLibelle called with codeNgp:', codeNgp);

  // Vérifier les types et valeurs
  console.log('Type of input codeNgp:', typeof codeNgp, 'Value:', codeNgp);
  console.log('Current NGP data:', this.ngpData);

  // Parcourir les données pour comparer
  this.ngpData.forEach((item, index) => {
    console.log(`Index ${index}: codeNgp = ${item.codeNgp}, Match = ${item.codeNgp === Number(codeNgp)}`);
  });

  // Forcer la conversion si nécessaire
  const ngp = this.ngpData.find(item => item.codeNgp === Number(codeNgp));
  console.log('NGP found:', ngp);

  const ngpLabel = ngp ? ngp.libNgp : 'Label not found';
  console.log('NGP label to display:', ngpLabel);

  this.openDialog(`Libellé pour le code ${codeNgp} :`, `${ngpLabel}`);

}

    checkTotalementExportatrice(noPieceClient: string): void {
      this.refService.getTotalementExportatrice(noPieceClient).subscribe(
          result => {
              this.isTotalementExportatrice = result ? true : false;
              this.depotDomiTitre.regimeSecteurActivite = result ? RegimeSecteurActivite.oui : RegimeSecteurActivite.non;
          },
          error => {
              console.error('Error checking "Totalement Exportatrice"', error);
              this.isTotalementExportatrice = null;  // Or handle error state
          }
      );
  }
  onNoPieceClientChange(): void {
      if (this.depotDomiTitre.noPieceClient) {
          this.nomPrenom = undefined; // Reset nomPrenom
          this.errorMessage = undefined; // Reset errorMessage
  
          // Retrieve name and surname
          this.refservice.getNomEtPrenom(this.depotDomiTitre.noPieceClient).subscribe(
              data => {
                  if (data) {
                      this.nomPrenom = data;
                      this.errorMessage = undefined; // Clear any previous error message
  
                      // Call the method to check if the client is totally exportative
                      this.checkTotalementExportatrice(this.depotDomiTitre.noPieceClient);
                      this.fetchActivityData(this.depotDomiTitre.noPieceClient);
                      // Fetch the RIBs after retrieving name and surname
                      this.refservice.getCompteRib(this.depotDomiTitre.noPieceClient).subscribe(
                          ribsData => {
                              this.ribs = ribsData; // Store the retrieved RIBs
                              if (this.ribs.length > 0) {
                                  this.depotDomiTitre.numCompte = this.ribs[0]; // Select the first RIB by default
                              }
                          },
                          error => {
                              console.error('Error fetching compte rib:', error);
                              this.ribs = [];
                          }
                      );
  
                  } else {
                      this.handleClientNotFound();
                  }
              },
              error => {
                  console.error('Erreur lors de la récupération du nom et prénom', error);
                  this.nomPrenom = undefined;
                  this.errorMessage = 'Erreur lors de la récupération du nom et prénom';
                  this.ribs = []; // Reset RIBs on error
                  this.depotDomiTitre.regimeSecteurActivite = RegimeSecteurActivite.non; // Set to NON on error
              }
          );
      }
  }
  
  handleClientNotFound(): void {
      this.nomPrenom = undefined;
      this.errorMessage = 'RNE inexistant';
      this.ribs = []; // Reset RIBs if name and surname are not found
      this.depotDomiTitre.regimeSecteurActivite = RegimeSecteurActivite.non; // Set to NON if no data found
  
      // Open a dialog for the nonexistent noPieceClient
      const dialogRef = this.dialog.open(AlertDialogComponent, {
          width: '400px',
          data: {title:'Error', message: 'Le numéro de pièce client n\'existe pas.' },
          panelClass: 'custom-dialog-container',
          hasBackdrop: true,
          backdropClass: 'custom-backdrop'
      });
  
      dialogRef.afterClosed().subscribe(result => {
          console.log('Le modal a été fermé');
      });
  }
  
    

  onFileSelected(event: Event): void {
    const inputElement = event.target as HTMLInputElement;
  
    if (inputElement.files && inputElement.files.length > 0) {
      // Remplace les fichiers sélectionnés
      const files: File[] = Array.from(inputElement.files);
      this.selectedFiles = files;
      this.selectedFileNames = files.map(file => file.name);
  
      console.log('Liste des fichiers mise à jour :', this.selectedFileNames);
    } else {
      console.warn('Aucun fichier sélectionné.');
      this.selectedFiles = [];
      this.selectedFileNames = [];
    }
  }
  
  toggleFileList(): void {
    this.isFileListVisible = !this.isFileListVisible;
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
  removeFile(fileName: string): void {
    const index = this.selectedFileNames.indexOf(fileName);
  
    if (index !== -1) {
      // Remove the file from the selected files and filenames lists
      this.selectedFileNames.splice(index, 1);
      this.selectedFiles.splice(index, 1);
  
      // Update the file input field
      const fileInput = document.getElementById('fileUpload') as HTMLInputElement;
      if (fileInput) {
        const dataTransfer = new DataTransfer();
  
        // Add the remaining files back to the DataTransfer object
        this.selectedFiles.forEach(file => dataTransfer.items.add(file));
  
        // Update the file input field's files property
        fileInput.files = dataTransfer.files;
      }
  
      console.log('File removed successfully:', fileName);
    } else {
      console.warn('File not found in the list:', fileName);
    }
  }
  
  

  uploadFilesAndCreateDepot(files: File[]): void {
    const uploadObservables: Observable<any>[] = files.map(file => this.refservice.uploadFile(file));
  
    // Upload all files and process responses
    forkJoin(uploadObservables).subscribe(
      (responses: any[]) => {
        console.log('Files uploaded successfully:', responses);
  
        // Create FileEntity array
        const fileEntities: FileEntity[] = responses.map(response => ({
          fileName: response.fileName,
          fileType: response.fileType,
          data: response.data,
        }));
  
        // Associate files with DepotDomiciliationTitre
        this.depotDomiTitre.fileEntity = fileEntities;
  
        // Now create the DepotDomiciliationTitre after files are uploaded
        this.depotdomititreservice.createDepotDomiciliationTitre(this.depotDomiTitre).subscribe(response => {
          console.log('DepotDomiciliationTitre created after file upload', response);
          this.openDialog('Succès', 'Le dossier a été créé avec succès !');
          // Clear all fields
      this.resetForm();

      // Show the first fieldset
      this.showFirstFieldset();
        }, error => {
          console.error('Error creating DepotDomiciliationTitre after file upload:', error);
          this.openDialog('Erreur', 'Une erreur s\'est produite lors de la création du dossier.');
        });
      },
      (error) => {
        console.error('Error uploading files:', error);
        this.openDialog('Erreur', 'Une erreur s\'est produite lors du téléchargement des fichiers.');
      }
    );
  }
  
  isDateFactureRecent(): boolean {
    const currentDate = new Date();
    const threeMonthsAgo = new Date();
    threeMonthsAgo.setMonth(threeMonthsAgo.getMonth() - 3);

    // Vérifie que dateContratCom est définie et n'est pas null
    if (this.depotDomiTitre.dateContratCom && this.depotDomiTitre.dateContratCom instanceof Date) {
      // Comparaison pour vérifier si dateContratCom est dans les 3 derniers mois
      if (this.depotDomiTitre.dateContratCom > threeMonthsAgo) {
        console.log("La date de contrat est récente.");
        return true;
      } else {
        console.log("La date de contrat n'est pas récente.");
        return false;
      }
    } else {
      console.log("Date de contrat non valide ou non définie.");
      return false;
    }
  }

  fetchActivityData(noPieceClient: string): void {
    this.refService.getActivities(noPieceClient).subscribe(
        (data: any) => {
            console.log('Fetched activity data:', data);
            
            // Set the primary activity code and label
            const primaryActivity = data.primaryActivity?.replace(/^Activité principale\s*:\s*/, '');
            this.depotDomiTitre.codeSecteurActivite = primaryActivity || 'Activité principale non trouvée';
            this.updateActivityLabel('codeSecteurActivite');
  
            // Set the secondary activity code and label
            const secondaryActivity = data.secondaryActivity?.replace(/^Activité secondaire\s*:\s*/, '');
            this.depotDomiTitre.codeSecteurActiviteSec = secondaryActivity || 'Activité secondaire non trouvée';
            this.updateActivityLabel('codeSecteurActiviteSec');
        },
        (error) => {
            console.error('Error fetching activity data', error);
        }
    );
  }
  
getActivityLabel(code: string): string {
  const activity = this.activities.find(act => act.code === code);
  return activity ? activity.label : 'Activité non trouvée';
}

onActiviteChange(): void {
    // Determine if the primary activity is set based on conditions
    this.isActivitePrincipaleSet = 
        this.depotDomiTitre.activitePrincipaleSecondaire === ActivitePrincipaleSecondaire.PRINCIPALE &&
        !!this.depotDomiTitre.codeSecteurActivite;
}

isModalOpen = false;
selectedField: 'codeSecteurActivite' | 'codeSecteurActiviteSec' = 'codeSecteurActivite';
filteredActivities = [...this.activities];
searchCode: string = '';
searchDevise:string='';

showActivityList(field: 'codeSecteurActivite' | 'codeSecteurActiviteSec'): void {
  this.selectedField = field;
  this.isModalOpen = true;
  this.filteredActivities = [...this.activities];
}

fetchActivities(): void {
  this.refService.getAllActiviteClasses().subscribe(
      (data) => {
          console.log('Raw data fetched:', data); // Afficher les données brutes
          this.activities = data.map(activity => ({
              code: `${activity.activiteClasseEntityPK.codeSection}${activity.activiteClasseEntityPK.codeDivision}${activity.activiteClasseEntityPK.codeGroupe}${activity.activiteClasseEntityPK.codeClasse}`,
              label: activity.libClasse
          }));
          console.log('Formatted activities:', this.activities); // Afficher les données formatées
      },
      (error) => {
          console.error('Error fetching activities', error); // Afficher les erreurs
      }
  );
}


// Method to filter activities based on the search input
filterActivities(): void {
  const searchTerm = this.searchCode.toLowerCase();

  if (searchTerm) {
    this.filteredActivities = this.activities.filter(activity =>
      activity.code.toLowerCase().includes(searchTerm) ||
      activity.label.toLowerCase().includes(searchTerm)
    );
  } else {
    // Afficher toutes les activités si la barre de recherche est vide
    this.filteredActivities = [...this.activities];
  }
}
onActivityEnter(): void {
  const enteredCode = this.depotDomiTitre.codeSecteurActiviteCode;
  if (enteredCode) {
      // Attempt to retrieve the activity label based on the entered code
      const activityLabel = this.getActivityLabel(enteredCode);
      
      if (activityLabel !== 'Activité non trouvée') {
          this.depotDomiTitre.codeSecteurActiviteLabel = activityLabel;
      } else {
          // Display an alert if the activity is not found
          this.depotDomiTitre.codeSecteurActiviteLabel = 'Activité inexistante. Veuillez vérifier le code.';
      }
  }
}

onSecondaryActivityEnter(): void {
  const enteredCode = this.depotDomiTitre.codeSecteurActiviteSecCode;
  if (enteredCode) {
      // Attempt to retrieve the secondary activity label based on the entered code
      const activityLabel = this.getActivityLabel(enteredCode);
      
      if (activityLabel !== 'Activité non trouvée') {
          this.depotDomiTitre.codeSecteurActiviteSecLabel = activityLabel;
      } else {
          // Display an alert if the activity is not found
          this.depotDomiTitre.codeSecteurActiviteSecLabel = 'Activité inexistante. Veuillez vérifier le code.';
      }
  }
}


closeModal() {
    this.isModalOpen = false; 
    this.searchCode = ''; 
    this.filteredActivities = [...this.activities]; 
}

selectActivity(field: 'codeSecteurActivite' | 'codeSecteurActiviteSec', activityCode: string): void {
  const selectedActivity = this.activities.find(activity => activity.code === activityCode);

  if (field === 'codeSecteurActivite') {
    this.depotDomiTitre.codeSecteurActiviteCode = selectedActivity ? selectedActivity.code : '';
    this.depotDomiTitre.codeSecteurActiviteLabel = selectedActivity ? selectedActivity.label : '';
  } else if (field === 'codeSecteurActiviteSec') {
    this.depotDomiTitre.codeSecteurActiviteSecCode = selectedActivity ? selectedActivity.code : '';
    this.depotDomiTitre.codeSecteurActiviteSecLabel = selectedActivity ? selectedActivity.label : '';
  }
  this.closeModal();
}



// Function to get the label from code_secteur_activite
fetchActivity(codeSecteurActivite: string): string {
    if (codeSecteurActivite) {
        const vCodeSection = codeSecteurActivite.charAt(0);
        const vCodeDivision = parseInt(codeSecteurActivite.slice(1, 3), 10);
        const vCodeGroupe = parseInt(codeSecteurActivite.charAt(3), 10);
        const vCodeClasse = parseInt(codeSecteurActivite.charAt(4), 10);

        const result = this.activiteClasse.find(activity => 
            activity.codeSection === vCodeSection &&
            activity.codeDivision === vCodeDivision &&
            activity.codeGroupe === vCodeGroupe &&
            activity.codeClasse === vCodeClasse
        );

        return result ? result.label : 'Activité Principale Inexistante..!'; // Return label or error message
    }
    return ''; // Return empty if no code provided
}

// Trigger to populate activities list for dropdown based on input code
populateActivitiesList(): void {
  console.log('Populating activities list');
  this.activities = this.activiteClasse.map(activity => ({
      code: `${activity.codeSection}${activity.codeDivision}${activity.codeGroupe}${activity.codeClasse}`,
      label: activity.label
  }));
  console.log('Activities:', this.activities); // Check populated activities
}
updateActivityLabel(fieldName: 'codeSecteurActivite' | 'codeSecteurActiviteSec') {
  const activityCode = this.depotDomiTitre[fieldName];
  
  if (activityCode) {
      const parts = activityCode.split(/ - | /); 
      const activityCodeValue = parts[0]; 
      const activityLabel = parts.slice(1).join(' '); 
      
      if (fieldName === 'codeSecteurActivite') {
          this.depotDomiTitre.codeSecteurActiviteCode = activityCodeValue; 
          this.depotDomiTitre.codeSecteurActiviteLabel = activityLabel; 
      } else if (fieldName === 'codeSecteurActiviteSec') {
          this.depotDomiTitre.codeSecteurActiviteSecCode = activityCodeValue; 
          this.depotDomiTitre.codeSecteurActiviteSecLabel = activityLabel; 
      }
  }
  }

  showPaysOrigineList(): void {
    this.isPaysOrigineModalOpen = true;
  }
  closePaysOrigineModal(): void {
    this.isPaysOrigineModalOpen = false;
    this.searchPays = ''; 
    this.filteredPays = [...this.codePaysList];
  }
  filterPays(): void {
    if (this.searchPays) {
      const searchTerm = this.searchPays.toLowerCase();
      this.filteredPays = this.codePaysList.filter(pays =>
        pays.libPays.toLowerCase().includes(searchTerm) || 
        pays.codePays.toString().toLowerCase().includes(searchTerm)
      );
    } else {
       this.filteredPays = [...this.codePaysList]; // Reset to show all if search is empty
    }
  }
  fetchPaysOrigineList(): void {
    this.refService.getPaysList().subscribe(
      (data) => {
        this.codePaysList = data
          .map(pays => ({
            codePays: pays.codePays, 
            libPays: pays.libPays
          }))
          .sort((a, b) => a.codePays - b.codePays); 
        this.filteredPays = [...this.codePaysList];
      },
      (error) => {
        console.error('Erreur lors de la récupération des pays : ', error);
      }
    );
  }
  onPaysOrigineSelected(pays: { codePays: number,libPays: string }): void {
    this.depotDomiTitre.codPayOrig = pays.codePays.toString(); 
    this.depotDomiTitre.libPaysOrig = pays.libPays; 
    this.closePaysOrigineModal(); 

  }

  onPaysOrigineEnter(): void {
    console.log('Pays code entered:', this.depotDomiTitre.codPayOrig);
  
    // Check if codePays is not an empty string before converting
    const codePaysNumber = this.depotDomiTitre.codPayOrig
      ? Number(this.depotDomiTitre.codPayOrig)
      : null;
  
    // Find the selected country (Pays) in the pays list
    const selectedPays = this.codePaysList.find(
      pays => pays.codePays === codePaysNumber
    );
  
    if (selectedPays) {
      this.depotDomiTitre.libPaysOrig = selectedPays.libPays;
    } else {
      this.depotDomiTitre.libPaysOrig = 'Libellé du pays introuvable';
    }
  }
  
  onPaysAchatEnter(): void {
    console.log('Pays d\'achat code entered:', this.depotDomiTitre.codPayAch);
    const codePaysNumber = this.depotDomiTitre.codPayAch ? Number(this.depotDomiTitre.codPayAch) : null;
    const selectedPays = this.codePaysList.find(pays => pays.codePays === codePaysNumber);
  
    if (selectedPays) {
      this.depotDomiTitre.libPaysAch = selectedPays.libPays;
    } else {
      this.depotDomiTitre.libPaysAch = 'Libellé du pays introuvable';
    }
  }
  
  showPaysAchatList(): void {
    this.isPaysAchatModalOpen = true;
  }
  
  closePaysAchatModal(): void {
    this.isPaysAchatModalOpen = false;
    this.searchPays = '';
    this.filteredPays = [...this.codePaysList];
  }
  
  onPaysAchatSelected(pays: any): void {
    this.depotDomiTitre.codPayAch = pays.codePays;
    this.depotDomiTitre.libPaysAch = pays.libPays;
    this.closePaysAchatModal();
  }

  onPaysProvenanceEnter(): void {
    console.log('Pays de provenance code entered:', this.depotDomiTitre.codPayProv);
    const codePaysNumber = this.depotDomiTitre.codPayProv ? Number(this.depotDomiTitre.codPayProv) : null;
    const selectedPays = this.codePaysList.find(pays => pays.codePays === codePaysNumber);
  
    if (selectedPays) {
      this.depotDomiTitre.libPaysProv = selectedPays.libPays;
    } else {
      this.depotDomiTitre.libPaysProv = 'Libellé du pays introuvable';
    }
  }
  
  showPaysProvenanceList(): void {
    this.isPaysProvenanceModalOpen = true;
  }
  
  closePaysProvenanceModal(): void {
    this.isPaysProvenanceModalOpen = false;
    this.searchPays = '';
    this.filteredPays = [...this.codePaysList];
  }
  
  onPaysProvenanceSelected(pays: any): void {
    this.depotDomiTitre.codPayProv = pays.codePays;
    this.depotDomiTitre.libPaysProv = pays.libPays;
    this.closePaysProvenanceModal();
  }

  onPaysDestinationEnter(): void {
    console.log('Pays de destination code entered:', this.depotDomiTitre.codePaysDestDef);
    const codePaysNumber = this.depotDomiTitre.codePaysDestDef ? Number(this.depotDomiTitre.codePaysDestDef) : null;
    const selectedPays = this.codePaysList.find(pays => pays.codePays === codePaysNumber);
  
    if (selectedPays) {
      this.depotDomiTitre.libPaysDestDef = selectedPays.libPays;
    } else {
      this.depotDomiTitre.libPaysDestDef = 'Libellé du pays introuvable';
    }
  }
  
  showPaysDestinationList(): void {
    this.isPaysDestinationModalOpen = true;
  }
  
  closePaysDestinationModal(): void {
    this.isPaysDestinationModalOpen = false;
    this.searchPays = '';
    this.filteredPays = [...this.codePaysList];
  }
  
  onPaysDestinationSelected(pays: any): void {
    this.depotDomiTitre.codePaysDestDef = pays.codePays;
    this.depotDomiTitre.libPaysDestDef = pays.libPays;
    this.closePaysDestinationModal();
  }

  loadModeReglements() {
    this.refService.getAllModReg().subscribe({
      next: (data) => this.allCodeModRegList = data,
      error: (err) => console.error('Error loading modes of regulation', err)
    });
  }

  // Open the modal to select a mode of regulation
  showModeReglementList() {
    this.isModeReglementModalOpen = true;
  }

  // Close the mode of regulation modal
  closeModeReglementModal() {
    this.isModeReglementModalOpen = false;
  }

  // When the user selects a mode of regulation
  onModeReglementSelected(mode: any) {
    this.depotDomiTitre.codeModReg = mode.codeModReg;
    this.depotDomiTitre.libModReg = mode.libModReg;
    this.closeModeReglementModal();
  }

  onModeReglementEnter() {
    const code = this.depotDomiTitre.codeModReg.toString().trim(); // Ensure code is a string and trimmed
    console.log("Entered Code:", code);
  
    const selectedMode = this.allCodeModRegList.find(
      mode => mode.codeModReg.toString().trim() === code // Convert each codeModReg to string and trim
    );
  
    if (selectedMode) {
      this.depotDomiTitre.libModReg = selectedMode.libModReg;
    } else {
      this.depotDomiTitre.libModReg = 'Mode de régelement inconnu';
    }
  
    // Logging for debugging
    console.log("Selected Mode:", selectedMode);
    console.log("All Modes List:", this.allCodeModRegList); // To verify available modes
  }
  
  onDelRegEnter() {
    const enteredCode = this.depotDomiTitre.codeDelReg.toString().trim();
    const selectedDelReg = this.allCodeDelRegList.find(
      del => del.codeDelReg.toString() === enteredCode
    );
  
    if (selectedDelReg) {
      this.depotDomiTitre.libDelReg = selectedDelReg.libDelReg;
    } else {
      this.depotDomiTitre.libDelReg = 'Délais inexistant';
    }
  }
  showDelRegList() {
    this.isDelRegModalOpen = true;
  }
  
  closeDelRegModal() {
    this.isDelRegModalOpen = false;
  }
  
  onDelRegSelected(delai: { codeDelReg: string, libDelReg: string, delais: number, periode: string }) {
    this.depotDomiTitre.codeDelReg = delai.codeDelReg;
    this.depotDomiTitre.libDelReg = delai.libDelReg;
    this.isDelRegModalOpen = false;
  }
  

  showRegStatList() {
    this.isRegStatModalOpen = true;
  }

  closeRegStatModal() {
    this.isRegStatModalOpen = false;
  }

    onRegStatEnter() {
      const code = this.depotDomiTitre.codeRegimeStat.toString().trim();  
      const selectedRegime = this.allCodeRegimeStatListe.find(
        (regime) => regime.codeRegimeStat.toString() === code
      );
    
      if (selectedRegime) {
        this.depotDomiTitre.libRegimeStat = selectedRegime.libRegimeStat;
      } else {
        this.depotDomiTitre.libRegimeStat = 'Régime statistique inconnu';
      }
  }

  onRegStatSelected(regime: { codeRegimeStat: string, libRegimeStat: string }) {
    this.depotDomiTitre.codeRegimeStat = regime.codeRegimeStat;
    this.depotDomiTitre.libRegimeStat = regime.libRegimeStat;
    this.closeRegStatModal();
  }

  isDetailsModalOpen: boolean = false;
  openDetailsModal() {
    this.isDetailsModalOpen = true;
    console.log('Details Modal opened:', this.isDetailsModalOpen);
  }
  closeDetailsModal() {
    this.isDetailsModalOpen = false;
    console.log('Details Modal closed:', this.isDetailsModalOpen);
  }
  
  isFactureModalOpen: boolean = false;
  openFactureModal() {
    this.isFactureModalOpen = true;
    console.log('Facture Modal opened:', this.isFactureModalOpen);
  }
  closeFactureModal() {
    this.isFactureModalOpen = false;
    console.log('Facture Modal closed:', this.isFactureModalOpen);
  }
  
  isBCTModalOpen: boolean = false;
  openBCTModal() {
    this.isBCTModalOpen = true;
    console.log('BCT Modal opened:', this.isBCTModalOpen);
  }
  closeBCTModal() {
    this.isBCTModalOpen = false;
    console.log('BCT Modal closed:', this.isBCTModalOpen);
  }

  isNGPModalOpen: boolean = false;
  openNGPModal() {
    this.isNGPModalOpen = true;
    console.log('NGP Modal opened:', this.isNGPModalOpen);
  }
  closeNGPModal() {
    this.isNGPModalOpen = false;
    console.log('NGP Modal closed:', this.isNGPModalOpen);
  }


  isFileModalOpen: boolean = false;
  openFileModal() {
    this.isFileModalOpen = true;
    console.log('File Modal opened:', this.isFileModalOpen);
  }
  closeFileModal() {
    this.isFileModalOpen = false;
    console.log('File Modal closed:', this.isFileModalOpen);
  }
// Open agence modal
openAgenceModal(): void {
  this.isAgenceModalOpen = true;
  this.filteredAgences = [...this.agences];
  console.log('Modale pour sélection d\'agence ouverte');
}

// Close agence modal and reset search
closeAgenceModal(): void {
  this.isAgenceModalOpen = false;
  this.searchAgenceCode = '';
  this.filteredAgences = [...this.agences]; // Reset to show all agences
  console.log('Modale fermée');
}
// Génère la valeur affichée pour le champ "Code Agence"
// Génère la valeur affichée pour le champ "Code Agence"
getAgenceDisplayValue(): string {
  const codeAgence = this.depotDomiTitre.codeAgence;
  const libelleAgence = this.depotDomiTitre.codeagencelibele;

  if (codeAgence && libelleAgence) {
    return `${codeAgence} - ${libelleAgence}`;
  }
  return codeAgence ? codeAgence.toString() : '';
}




// Met à jour uniquement le code agence lors de la saisie manuelle, et met à jour le libellé lorsque le code dépasse 3 chiffres
onAgenceInputChange(event: Event): void {
  const inputElement = event.target as HTMLInputElement;
  const value = inputElement?.value || ''; // Récupérer la valeur comme chaîne
  const numericValue = value ? parseInt(value, 10) : null; // Convertir en nombre ou null

  this.depotDomiTitre.codeAgence = numericValue; // Affecter la valeur convertie

  // Mettre à jour le libellé seulement si le code dépasse 3 chiffres
  if (numericValue && value.length > 3) {
    const agence = this.agences.find(a => a.agenceEntityPK.codeAgenceBct === numericValue);
    if (agence) {
      this.depotDomiTitre.codeagencelibele = agence.libAgence;
      console.log('Libellé mis à jour :', agence.libAgence);
    } else {
      // Si aucun libellé trouvé, réinitialiser
      this.depotDomiTitre.codeagencelibele = '';
      console.warn('Aucune agence trouvée pour ce code');
    }
  }
}

// Sélectionne une agence depuis la liste
selectAgence(selectedField: string, codeAgence: number): void {
  const selectedAgence = this.agences.find(agence => agence.agenceEntityPK.codeAgenceBct === codeAgence);
  if (selectedAgence) {
    this.depotDomiTitre.codeAgence = codeAgence;
    this.depotDomiTitre.codeagencelibele = selectedAgence.libAgence;
    console.log('Agence sélectionnée:', selectedAgence);
  } else {
    console.error('Aucune agence trouvée pour le code:', codeAgence);
  }
  this.closeAgenceModal();
}

// Handle "Enter" key press for agence search and update the libellé
onAgenceEnter(): void {
  console.log('Touche "Enter" enfoncée');

  const selectedCodeAgence = this.depotDomiTitre.codeAgence;

  if (selectedCodeAgence !== null && selectedCodeAgence !== undefined && !isNaN(Number(selectedCodeAgence))) {
    const agence = this.agences.find(a => a.agenceEntityPK.codeAgenceBct === Number(selectedCodeAgence));

    if (agence) {
      this.depotDomiTitre.codeagencelibele = agence.libAgence;
      console.log('Agence trouvée :', agence);
    } else {
      console.error('Agence non trouvée pour le code:', selectedCodeAgence);
      this.depotDomiTitre.codeagencelibele = '';
      this.openDialog('Erreur', 'Aucune agence trouvée pour le code saisi.');
    }
  } else {
    this.depotDomiTitre.codeagencelibele = ''; // Reset if invalid input
  }
}

filterAgences(): void {
  if (this.searchAgenceCode && this.searchAgenceCode.trim() !== '') {
    const searchTerm = this.searchAgenceCode.toLowerCase();
    console.log('Recherche : ', this.searchAgenceCode);

    this.filteredAgences = this.agences.filter(agence => {
      const codeMatches =
        agence.agenceEntityPK?.codeAgenceBct?.toString()?.toLowerCase().includes(searchTerm) || false;
      const libMatches =
        agence.libAgence?.toLowerCase().includes(searchTerm) || false;

      return codeMatches || libMatches;
    });
  } else {
    this.filteredAgences = [...this.agences]; 
  }

  console.log('Agences filtrées:', this.filteredAgences);
}


acompteInvalid = false; // To track invalid values

  onAcompteChange(): void {
    // Validate the 'acompte' value
    if (this.depotDomiTitre.acompte < 0 || this.depotDomiTitre.acompte > 100) {
      this.acompteInvalid = true; // Show the error message if out of range
    } else {
      this.acompteInvalid = false; // Hide error message if valid
    }
  }

  }