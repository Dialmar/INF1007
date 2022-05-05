package controleur;

import modele.Client;
import stockage.StockagePersistantClient;

import java.util.List;

public class ControleurClient {
    private Client client;
    private List<Client> listeClient;
    private StockagePersistantClient stockage;

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
}
