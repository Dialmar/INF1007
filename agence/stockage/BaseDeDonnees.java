package stockage;

import modele.Client;
import modele.Employe.Employe;
import modele.Employe.Gestionnaire;
import modele.Employe.Prepose;
import modele.Location;
import modele.Rapport;
import modele.Vehicule;

import java.util.ArrayList;
import java.util.HashMap;

public class BaseDeDonnees {
    static HashMap<String, Employe> employe=new HashMap<>();
    static HashMap<String, Rapport> reports=new HashMap<>();
    ArrayList<Client> clients;
    ArrayList<Location> locations;
    ArrayList<Vehicule> vehicules;
    static BaseDeDonnees instance;


    public static BaseDeDonnees getInstance() {
        if (instance == null) {
            instance = new BaseDeDonnees();
        }

        return instance;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    private BaseDeDonnees() {

        //Employe
        Gestionnaire gestionnaire = new Gestionnaire("G01", "Tom", "Alpha", "Yves", "00923");
        Prepose prepose = new Prepose("B002", "Ismael", "Gans", "Roger", "9204");

        employe.put("0923", gestionnaire);
        employe.put("0895", prepose);
        clients = new ArrayList<>();
        locations = new ArrayList<>();
        vehicules = new ArrayList<>();


    }

    public static boolean isGestionnaireLogin(String login, String password) {
        boolean result = false;
        for (Employe employe1 : employe.values()) {
            if (employe1.getLogin().equals(login) && employe1.getPassword().equals(password)) {
                if (employe1.getFonction().equals("gestionnaire")) result = true;
            }
        }
        return result;
    }

    public void saveRapport(Rapport rapport) {
        reports.put("1", rapport);
    }


    public static void affichageRapport() {
        for (Rapport rapport : BaseDeDonnees.reports.values()) {
            System.out.println("DATE: " + rapport.getDate());
            System.out.println("TITRE : " + rapport.getTitre());
            System.out.println("DESCRIPTION: " + rapport.getDesc());
        }
    }
    /*public void generateRapportKey(String key){
       for int
    }*/
}


