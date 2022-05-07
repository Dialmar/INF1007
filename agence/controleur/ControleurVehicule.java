package controleur;

import modele.Vehicule;
import stockage.StockagePersistant;

import java.util.List;

/**
 * Classe ControleurVehicule: classe qui gère les actions liées aux véhicules
 * @author FATIMA DIALLO
 *
 */
public class ControleurVehicule {
    // Attributs
    private Vehicule vehicule;
    private List<Vehicule> listeVehicule;
    private StockagePersistant stockage;
// Constructeur
    public Vehicule getVehicule() {
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
// Méthodes
    public void sauvegarde (Vehicule vehicule){
        stockage.sauvegardeVehicule(vehicule);
    }

}
