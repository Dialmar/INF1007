package controleur;

import modele.Client;
import stockage.StockagePersistant;

import java.util.List;

public class ControleurClient {
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
