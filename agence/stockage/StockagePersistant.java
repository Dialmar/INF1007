package stockage;

import modele.Client;
import modele.Location;
import modele.Vehicule;

import java.util.ArrayList;

/**
 * Classe permettant de stocker les données dans un fichier: clients, vehicules, locations et les réservations de locations.
 */
public class StockagePersistant
{
    public static BaseDeDonnees baseDeDonnees;

    public StockagePersistant() {
        BaseDeDonnees.getInstance();
    }

    public void sauvegardeClient(Client client){
        baseDeDonnees.clients.add(client);    }

    public static Client recupererClient(String numeroDossier)
    {

        for (Client client1 : BaseDeDonnees.clients)
        {
            if (client1.getNumeroDossier().equals(numeroDossier))
            {
                return client1;
            }
        }
        return null;
    }

    public void sauvegardeLocation(Location location){
        baseDeDonnees.locations.add (location);
    }

    public void sauvegardeVehicule(Vehicule vehicule){
        baseDeDonnees.vehicules.add(vehicule);    }

    public static Vehicule recupererVehicule(String numImmatri)
    {
        ArrayList<Vehicule> temp = baseDeDonnees.vehicules;
        for (Vehicule vehicule : temp)
        {
            if (vehicule.getNumImmatri().equals(numImmatri))
            {
                return vehicule;
            }
        }
        return null;
    }
}
