package stockage;

import modele.Client;

public class StockagePersistantClient {
    private Client client;
    private BaseDeDonnees baseDeDonnees;

    public StockagePersistantClient(Client client) {
        baseDeDonnees.getInstance();
    }

    public void sauvegarde (Client client){
        baseDeDonnees.clients.add(client);    }
}
