package stockage;

import jdk.incubator.foreign.CLinker;
import modele.Client;

import java.util.ArrayList;

public class StockagePersistantClient {
    private Client client;
    private BaseDeDonnees baseDeDonnees;

    public StockagePersistantClient(Client client) {
        baseDeDonnees.getInstance();
    }

    public void sauvegarde (Client client){
        baseDeDonnees.clients.add(client);    }

    public Client recupererClient(String numeroDossier)
    {
        ArrayList<Client> temp = baseDeDonnees.clients;
        for (Client client : temp)
        {
            if (client.getNumeroDossier().equals(numeroDossier))
            {
                return client;
            }
        }
        return null;
    }
}
