import controleur.Registre;
import stockage.BaseDeDonnees;

import java.util.Scanner;

import static stockage.BaseDeDonnees.isGestionnaireLogin;

public class Main {

    public static void main(String[] args) {
        // TODO  Ecrire le menu principal
        // TODO  Ecrire le menu de gestion des employes
        // TODO  Ecrire le menu de gestion des clients
        // TODO  Ecrire le menu de gestion des vehicules
        // TODO  Ecrire le menu de gestion des reservations
        // TODO  Ecrire le menu de gestion des rapports et les faire passer dans le controleur
        // TODO  Ecrire le menu de gestion des facturations et les faire passer dans le controleur
        // Ecrire le menu de gestion des reservations et les faire passer dans le controleur
        Registre _registre = new Registre();

        menuPrincipal();
        menuChoix();

    }
    public static void menuPrincipal() {
        System.out.println("Menu principal");
        System.out.println("1. Gestion des employes");
        System.out.println("2. Gestion des clients");
        System.out.println("3. Gestion des vehicules");
        System.out.println("4. Gestion des reservations");
        System.out.println("5. Gestion des rapports");
        System.out.println("6. Gestion des facturations");
        System.out.println("0. Quitter");
    }
    public static void menuChoix() {
        Scanner sc = new Scanner(System.in);
        int choix = sc.nextInt();

        //     do {
        switch (choix) {
            case 1:
                System.out.println("Menu de gestion de employes");

                break;
            case 2:
                System.out.println("Menu de gestion de clients");
                break;
            case 3:
                System.out.println("Menu de gestion de vehicules");
                break;
            case 4:
                System.out.println("Menu de gestion de reservations");
                break;
            case 5:
                System.out.println("Menu de gestion de rapports");
                System.out.println("Entrez votre Identifiant :");
                Scanner input = new Scanner(System.in);
                String l = input.nextLine();
                System.out.println("Entrez votre password :");
                String p = input.nextLine();

                System.out.println("Menu de redaction de rapport");
                System.out.println("1. Ecrire un rapport");
                System.out.println("2. Lire un rapport");
                System.out.println("3. Retour au menu principal");
                int choixRapport = sc.nextInt();
                switch (choixRapport) {
                    case 1 -> Registre._saisirRapport(l, p);
                    case 2 -> Registre.afficherRapport();
                    case 3 -> {
                        System.out.println(" Deconnexion Retour au menu principal");
                        menuPrincipal();
                        menuChoix();
                    }
                }




            case 6:
                System.out.println("Menu de gestion de facturations");
                break;
            default:
                System.out.println("Choix invalide");
        }
        menuPrincipal();
    }
}






