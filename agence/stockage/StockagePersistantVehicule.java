package stockage;

import modele.Vehicule;

import java.util.ArrayList;

public class StockagePersistantVehicule {
    private Vehicule vehicule;
    private BaseDeDonnees baseDeDonnees;
    public StockagePersistantVehicle(Vehicule vehicule) {
        baseDeDonnees.getInstance();
    }

    public void sauvegarde (Vehicule vehicule){
        baseDeDonnees.Vehicules.add(vehicule);    }

    public Vehicule recupererVehicule(String numImmatri)
    {
        ArrayList<Vehicule> temp = baseDeDonnees.vehicules;
        for (Vehicule vehicule : temp)
        {
            if (vehicule.getNumeroDeSerie().equals(numImmatri))
            {
                return vehicule;
            }
        }
        return null;
    }
}
