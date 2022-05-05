package controleur;

import modele.Client;
import modele.Vehicule;
import stockage.StockagePersistant;

import java.util.List;

public class ControleurVehicule {
    private Vehicule vehicule\;
    private List<Vehicule> listeVehicule;
    private StockagePersistant stockage;

    public Client getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public List<Vehicule> getListeVehicule() {
        return listeVehicule;
    }

    public void setListeVehicule(List<Vehicule> listeVehicule) {
        this.listeVehicule = listeVehicule;
    }

    public void sauvegarde (Vehicule vehicule){
        stockage.sauvegardeVehicule(vehicule);
    }

}
