package modele;

public class Location {
    private float kilometrage;
    private float prix;
    private String dateLocation;
    private boolean statutLocationTerminer;
    private Vehicule vehicule;


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
