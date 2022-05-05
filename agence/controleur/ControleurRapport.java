package controleur;

import modele.Employe.Gestionnaire;
import modele.Rapport;
import stockage.BaseDeDonnees;
import vue.ObtenirRapport;

public class ControleurRapport {

  // Gestionnaire gestionnaire = new Gestionnaire();
  BaseDeDonnees baseDeDonnees =  BaseDeDonnees.getInstance();

  public boolean connecter(String login, String password) {
    return baseDeDonnees.isGestionnaireLogin(login,password);
  }

  void saisirRapport(){
    System.out.println("Veuillez saisir votre rapport");
    ObtenirRapport obtenirRapport = new ObtenirRapport();
    obtenirRapport.saisie();
  }
  void notAuth(){
    System.out.println("Ce compte n'est pas un compte de gestionnaire.");
  }

  public void saveRapport(String t, String d, String des){
    System.out.println("Rapport sauvegarde avec succes/n Retour au menu principal");

    Rapport rapport = new Rapport(t,d,des);
    baseDeDonnees.saveRapport(rapport);


  }
}


