package controleur;

import modele.Rapport;

public class Registre {
    private ControleurRapport controleurRapport;
    private ControleurRetour controleurRetour;
    private ControleurFacturation controleurFacturation;

    public Registre() {
        controleurRapport = new ControleurRapport();
        controleurRetour = new ControleurRetour();
        controleurFacturation = new ControleurFacturation();
    }

    //private static Registre instance = new Registre();
    public   void _saisirRapport(String l, String p){
        boolean connexion;
        connexion = controleurRapport.connecter(l, p);
        if (connexion){
            controleurRapport.saisirRapport();
        }else{
            controleurRapport.notAuth();
        }
    }
    public void enregistrerRapport(String t, String d, String des){
        controleurRapport.saveRapport(t,d,des);
    }

}

