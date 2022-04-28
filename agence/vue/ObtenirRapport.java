package vue;

import controleur.ControleurRapport;
import controleur.Registre;
import modele.Rapport;

import java.util.Scanner;

public class ObtenirRapport {
    private Registre registre = new Registre();
    public void saisie(){
        String _date, _titre, _desc;
        System.out.println("Veuillez saisir la date du rapport au format jj-mm-aaaa");
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        _date = c;

        System.out.println("Veuillez saisir le titre du rapport");
        String d = sc.nextLine();
        _titre = d;

        System.out.println("Veuillez saisir la description du rapport");
        String t = sc.nextLine();
        _desc = t;
        registre.enregistrerRapport(_titre,_date,_desc);
        //Rapport rapport = new Rapport();
    }

}
