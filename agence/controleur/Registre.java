package controleur;

import modele.Rapport;
import stockage.BaseDeDonnees;

/**
 * Classe qui gère les opérations de l'application
 * @author GANSONRE ISMAEL
 */
public class Registre {
   //attributs
    private static ControleurRapport controleurRapport;
    private ControleurRetour controleurRetour;
    private ControleurFacturation controleurFacturation;
//
    public Registre() {
        controleurRapport = new ControleurRapport();
        controleurRetour = new ControleurRetour();
        controleurFacturation = new ControleurFacturation();
    }

    //private static Registre instance = new Registre();
    public static void _saisirRapport(String l, String p) {
        boolean connexion;
        connexion = controleurRapport.connecter(l, p);
        if (connexion) {
            controleurRapport.saisirRapport();
        } else {
            controleurRapport.notAuth();
        }
    }

    public void enregistrerRapport(String t, String d, String des) {

        controleurRapport.saveRapport(t, d, des);
    }

    public static void afficherRapport() {
       BaseDeDonnees.affichageRapport();
    }
}


