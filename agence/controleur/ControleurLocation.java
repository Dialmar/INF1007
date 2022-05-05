package controleur;

import modele.Client;
import modele.Location;
import modele.Vehicule;
import stockage.StockagePersistant;

import java.util.List;

public class ControleurLocation {
    private Location location;
    private Client client;
    private Vehicule vehicule;
    private List<Location> listeLocation;
    private StockagePersistant stockage;

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

    private void recuperClient(String numeroDossier)
    {
        client = stockage.recupererClient(numeroDossier);
    }

    private void recuperVehicule(String numImmatri)
    {
        vehicule = stockage.recupererVehicule(numImmatri);
    }

    private void terminerVehiculeLocation()
    {
        location.getVehicule().setLocation(false);
    }

    private void LocationVehicule()
    {
        location.getVehicule().setLocation(false);
    }

    public void locationVehicule(String numImmatri, String numeroDossier)
    {
        recuperClient(numeroDossier);
        recuperVehicule(numImmatri);
        vehicule.setLocation(true);
        location = new Location(client, vehicule);
        client.setLocation(location);
    }

    public void retour() {
        location = client.getLocation();
        terminerVehiculeLocation();
        client.setLocation(null);
    }
}
