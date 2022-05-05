package modele;

public class Reservation {
    private float kilometrage;
    private float prix;
    private Client client;
    private String dateReseration;
    private Vehicule vehicule;

    public Reservation(float kilometrage, float prix, Client client, String dateLocation, Vehicule vehicule)
    {
        this.kilometrage = kilometrage;
        this.prix = prix;
        this.client = client;
        //this.dateReseration = dateReservation;
        this.vehicule = vehicule;
    }

    public Reservation(Client client, Vehicule vehicule)
    {
        this.client = client;
        this.vehicule = vehicule;
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

  /*  public String getDateLocation()
    {
        return dateLocation;
    }
*/
    public Vehicule getVehicule()
    {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule)
    {
        this.vehicule = vehicule;
    }
}


