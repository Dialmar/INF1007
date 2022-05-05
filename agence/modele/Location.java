package modele;

public class Location {
    private float kilometrage;
    private float prix;
    private Client client;
    private String dateLocation;
    private boolean statutLocationTerminer;
    private Vehicule vehicule;

    public Location(float kilometrage, float prix, Client client, String dateLocation, Vehicule vehicule)
    {
        this.kilometrage = kilometrage;
        this.prix = prix;
        this.client = client;
        this.dateLocation = dateLocation;
        this.statutLocationTerminer = false;
        this.vehicule = vehicule;
    }

    public Location(Client client, Vehicule vehicule)
    {
        this.client = client;
        this.vehicule = vehicule;
        this.statutLocationTerminer = false;
    }

    private void terminerLocation (){

    }

    public float getKilometrage()
    {
        return kilometrage;
    }

    public void setKilometrage(float kilometrage)
    {
        this.kilometrage = kilometrage;
    }

    public float getPrix()
    {
        return prix;
    }

    public void setPrix(float prix)
    {
        this.prix = prix;
    }

    public String getDateLocation()
    {
        return dateLocation;
    }

    public void setDateLocation(String dateLocation)
    {
        this.dateLocation = dateLocation;
    }

    public boolean isStatutLocationTerminer()
    {
        return statutLocationTerminer;
    }

    public void setStatutLocationTerminer(boolean statutLocationTerminer)
    {
        this.statutLocationTerminer = statutLocationTerminer;
    }

    public Vehicule getVehicule()
    {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule)
    {
        this.vehicule = vehicule;
    }
}
