import { Routes } from '@angular/router';

const routes: Routes = [
  {
    path: 'authority',
    data: { pageTitle: 'tmp11App.adminAuthority.home.title' },
    loadChildren: () => import('./admin/authority/authority.routes'),
  },
  {
    path: 'demande-xrm',
    data: { pageTitle: 'tmp11App.demandeXRM.home.title' },
    loadChildren: () => import('./demande-xrm/demande-xrm.routes'),
  },
  {
    path: 'mise-en-gestion',
    data: { pageTitle: 'tmp11App.miseEnGestion.home.title' },
    loadChildren: () => import('./mise-en-gestion/mise-en-gestion.routes'),
  },
  {
    path: 'pm-entreprise',
    data: { pageTitle: 'tmp11App.pmEntreprise.home.title' },
    loadChildren: () => import('./pm-entreprise/pm-entreprise.routes'),
  },
  {
    path: 'adresse',
    data: { pageTitle: 'tmp11App.adresse.home.title' },
    loadChildren: () => import('./adresse/adresse.routes'),
  },
  {
    path: 'telephone',
    data: { pageTitle: 'tmp11App.telephone.home.title' },
    loadChildren: () => import('./telephone/telephone.routes'),
  },
  {
    path: 'email',
    data: { pageTitle: 'tmp11App.email.home.title' },
    loadChildren: () => import('./email/email.routes'),
  },
  {
    path: 'pm-etablissement',
    data: { pageTitle: 'tmp11App.pmEtablissement.home.title' },
    loadChildren: () => import('./pm-etablissement/pm-etablissement.routes'),
  },
  /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
];

export default routes;
