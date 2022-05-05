package controleur;

import java.util.List;

public class ControleurLocation {
    private Location location;
    private List<Location> listeLocation;
    private StockagePersistantLocation stockage;

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
    public void retour() {

    }
}
