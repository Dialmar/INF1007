package stockage;

import modele.Employe.Employe;
import modele.Employe.Gestionnaire;
import modele.Employe.Prepose;

import java.util.HashMap;

public class BaseDeDonnees {
    HashMap<String, Employe> employe = new HashMap<>();

    public BaseDeDonnees() {
//gestionnaires.put("247", new Gestionnaire("Gestionnaire", "1", "Gestionnaire", "Gestionnaire", "Gestionnaire", "Gestionnaire"));

        Gestionnaire gestionnaire = new Gestionnaire("G01","Tom","Alpha","Keitta","00932");
        Prepose prepose = new Prepose("B002","Ismael","Gans","Roger","9204");

        employe.put("0923",gestionnaire);
        employe.put("0895",prepose);


    }

   //auto increment id for hashmap Gestionnaires

    private String setkey() {
        int i = 1;
        while (gestionnaires.containsKey(String.valueOf(i))) {
            i++;
        }
        return String.valueOf(i);
    }

    public static boolean isGestionnaireLogin(String login, String password) {
        for (Employe employe1: employe.values()) {
            if (employe1.getLogin().equals(login) && employe1.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

}


