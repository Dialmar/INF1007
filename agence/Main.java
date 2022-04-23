import java.util.Scanner;

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
        System.out.println("Menu principal");
        System.out.println("1. Gestion des employes");
        System.out.println("2. Gestion des clients");
        System.out.println("3. Gestion des vehicules");
        System.out.println("4. Gestion des reservations");
        System.out.println("5. Gestion des rapports");
        System.out.println("6. Gestion des facturations");
        Scanner sc = new Scanner(System.in);
        int choix = sc.nextInt();
        do {
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
                    break;
                case 6:
                    System.out.println("Menu de gestion de facturations");
                    break;
                default:
                    System.out.println("Choix invalide");
            }
        } while (choix != 0);
    }
}






