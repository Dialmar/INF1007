package stockage;


import modele.Location;

public class StockagePersistantLocation {
    private Location location;
    private BaseDeDonnees baseDeDonnees;

    public StockagePersistantLocation(Location location) {
        BaseDeDonnees.getInstance();
    }

    public void sauvegarde (Location location){
        baseDeDonnees.locations.add (location);    }
}

