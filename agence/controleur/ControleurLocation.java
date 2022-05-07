package controleur;

import modele.Client;
import modele.Location;
import modele.Vehicule;
import stockage.StockagePersistant;

import java.util.List;

/**
 * Controleur de la page de gestion des locations de véhicules de l'agence de location de véhicules.
 *
 * @author MARIAMA DIALLO
 * @version
 *
 */
public class ControleurLocation {
    // Attributs
    private Location location;
    private Client client;
    private Vehicule vehicule;
    private List<Location> listeLocation;
    private StockagePersistant stockage;
// Constructeur
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
// Méthodes
    /**
     * Méthode qui permet de créer une location.*/
    private void terminerVehiculeLocation()
    {
        location.getVehicule().setLocation(false);
    }
//
    private void LocationVehicule()
    {//TODO
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
