package modele;

/**
 * Classe Reservation: classe représentant une réservation d'un client à UNE LOCATIONl dans une agence de voyage.
 */
public class Reservation {
    private float kilometrage;
    private float prix;
    private Client client;
    private String dateReseration;
    private String dateFinReservation;
    private Vehicule vehicule;

    public Reservation(float kilometrage, float prix, Client client, String dateReseration, String dateFinReservation, Vehicule vehicule)
    {
        this.kilometrage = kilometrage;
        this.prix = prix;
        this.client = client;
        this.dateReseration = dateReseration;
        this.dateFinReservation = dateFinReservation;
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

    public Client getClient()
    {
        return client;
    }

    public void setClient(Client client)
    {
        this.client = client;
    }

    public String getDateReseration()
    {
        return dateReseration;
    }

    public void setDateReseration(String dateReseration)
    {
        this.dateReseration = dateReseration;
    }

    public String getDateFinReservation()
    {
        return dateFinReservation;
    }

    public void setDateFinReservation(String dateFinReservation)
    {
        this.dateFinReservation = dateFinReservation;
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

