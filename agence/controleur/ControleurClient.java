package controleur;

import modele.Client;
import stockage.StockagePersistant;

import java.util.List;

/**
 * Classe ControleurClient : CONTROLEUR qui gère les clients de l'agence
 *
 *
 *
 * @author Richard SEMANOU
 */
public class ControleurClient {
    // ATTRIBUTS
    private Client client;
    private List<Client> listeClient;
    private StockagePersistant stockage;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Client> getListeClient() {
        return listeClient;
    }

    public void setListeClient(List<Client> listeClient) {
        this.listeClient = listeClient;
    }

    public void sauvegarde (Client client){
        stockage.sauvegardeClient(client);
    }

}
