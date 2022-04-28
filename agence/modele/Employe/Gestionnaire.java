package modele.Employe;

import stockage.BaseDeDonnees;

public class Gestionnaire extends Employe {



    public Gestionnaire(){

    }

    public Gestionnaire( String id, String nom, String prenom, String login, String password) {
        super("gestionnaire", id, nom, prenom, login, password);
    }



 /*   public void EstConnecter(String login, String password) {
        BaseDeDonnees.isGestionnaireLogin(login, password);

    }
    private String setIdGestionnaire() {
        int i = 1;
        while (gestionnaires.containsKey(String.valueOf(i))) {
            i++;
        }
        return String.valueOf(i);
    }

  */


}

