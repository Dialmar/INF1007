package stockage;

import modele.Client;
import modele.Location;
import modele.Vehicule;

import java.util.ArrayList;

public class StockagePersistant
{
    private BaseDeDonnees baseDeDonnees;

    public StockagePersistant() {
        BaseDeDonnees.getInstance();
    }

    public void sauvegardeClient(Client client){
        baseDeDonnees.clients.add(client);    }

    public Client recupererClient(String numeroDossier)
    {
        ArrayList<Client> temp = baseDeDonnees.clients;
        for (Client client : temp)
        {
            if (client.getNumeroDossier().equals(numeroDossier))
            {
                return client;
            }
        }
        return null;
    }

    public void sauvegardeLocation(Location location){
        baseDeDonnees.locations.add (location);
    }

    public void sauvegardeVehicule(Vehicule vehicule){
        baseDeDonnees.vehicules.add(vehicule);    }

    public Vehicule recupererVehicule(String numImmatri)
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
