package modele;

/**
 *  : Vehicule
 *  : Vehicule.java
 *  : Vehicule: classe de base pour les vehicules de la simulation de l'agence
 */
public class Vehicule {
    private int NumeroDeSerie;
    private String Marque;
    private String numImmatri;
    private String Type;
    private String Annee;
    private String Etat;
    private String Kilometrage;
    private boolean location;
    private boolean reservation;

    public Vehicule(String numeroDeSerie, String marque, String numImmatri, String type, String annee, String etat, String kilometrage, boolean location, boolean reservation) {
        NumeroDeSerie = Integer.parseInt(numeroDeSerie);
        Marque = marque;
        this.numImmatri = numImmatri;
        Type = type;
        Annee = annee;
        Etat = etat;
        Kilometrage = kilometrage;
        this.location = location;
        this.reservation = reservation;
    }


    public String getNumImmatri()
    {
        return numImmatri;
    }

    public void setNumImmatri(String numImmatri)
    {
        this.numImmatri = numImmatri;
    }

    public int getNumeroDeSerie()
    {
        return NumeroDeSerie;
    }

    public void setNumeroDeSerie(int numeroDeSerie)
    {
        NumeroDeSerie = numeroDeSerie;
    }

    public String getMarque()
    {
        return Marque;
    }

    public void setMarque(String marque)
    {
        Marque = marque;
    }

    public String getType()
    {
        return Type;
    }

    public void setType(String type)
    {
        Type = type;
    }

    public String getAnnee()
    {
        return Annee;
    }

    public void setAnnee(int annee)
    {
        Annee = String.valueOf(annee);
    }

    public String getEtat()
    {
        return Etat;
    }

    public void setEtat(String etat)
    {
        Etat = etat;
    }

    public String getKilometrage()
    {
        return Kilometrage;
    }

    public void setKilometrage(String kilometrage)
    {
        Kilometrage = kilometrage;
    }

    public boolean getLocation()
    {
        return location;
    }

    public void setLocation(boolean location)
    {
        this.location = location;
    }

    public boolean isLocation()
    {
        return location;
    }

    public boolean isReservation()
    {
        return reservation;
    }

    public void setReservation(boolean reservation)
    {
        this.reservation = reservation;
    }
}