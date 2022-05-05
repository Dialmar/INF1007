package controleur;

import modele.Client;
import modele.Location;
import stockage.StockagePersistantClient;

import java.util.List;

public class ControleurLocation {
    private Location location;
    private Client client;
    private List<Location> listeLocation;
    private StockagePersistantLocation stockage;
    private StockagePersistantClient persistantClient;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Location> getListeLocation() {
        return listeLocation;
    }

    public void setListeLocation(List<Location> listeLocation) {
        this.listeLocation = listeLocation;
    }

    private void recuperClients(String nom, String prenom)
    {
        client = persistantClient.recupererClient(nom, prenom);
    }

    private void terminerVehiculeLocation()
    {
        location.getVehicule().setLocation(false);
    }

    public void retour() {
        location = client.getLocation();
        terminerVehiculeLocation();
        client.setLocation(null);
    }
}
