package stockage;

import modele.Client;
import modele.Employe.Employe;
import modele.Employe.Gestionnaire;
import modele.Employe.Prepose;
import modele.Rapport;

import java.util.ArrayList;
import java.util.HashMap;

public class BaseDeDonnees {
    HashMap<String, Employe> employe ;
    HashMap<String, Rapport> reports ;
    ArrayList<Client> clients;
    BaseDeDonnees instance;

    public BaseDeDonnees()
    {
        employe = new HashMap<>();
        clients = new ArrayList<>();
    }

    public BaseDeDonnees getInstance ()
    {
        if (instance == null)
        {
            instance = new BaseDeDonnees();
        }

        return instance;
    }

    public ArrayList<Client> getClients()
    {
        return clients;
    }

    //    public BaseDeDonnees() {
////gestionnaires.put("247", new Gestionnaire("Gestionnaire", "1", "Gestionnaire", "Gestionnaire", "Gestionnaire", "Gestionnaire"));
//
//        Gestionnaire gestionnaire = new Gestionnaire("G01","Tom","Alpha","Keita","00932");
//        Prepose prepose = new Prepose("B002","Ismael","Gans","Roger","9204");
//
//        employe.put("0923",gestionnaire);
//        employe.put("0895",prepose);
//
//
//    }

    //auto increment id for hashmap Gestionnaires

 /*  private String setkey() {
        int i = 1;
        while (gestionnaires.containsKey(String.valueOf(i))) {
            i++;
        }
        return String.valueOf(i);
    }

  */

    public boolean isGestionnaireLogin(String login, String password) {
        boolean result = false;
        for (Employe employe1: employe.values()) {
            if (employe1.getLogin().equals(login) && employe1.getPassword().equals(password)) {
                if(employe1.getFonction().equals("gestionnaire")) result = true;
            }
        }
        return result;
    }

    public void saveRapport(Rapport rapport){
        reports.put("1", rapport);
    }

    public void affichage(){
        for (Rapport rapport: reports.values()) {
            System.out.println("DATE: " + rapport.getDate());
            System.out.println("TITRE : " + rapport.getTitre());
            System.out.println("DESCRIPTION: " + rapport.getDesc());
        }
    }
}


