package modele;

public class Vehicule {
    private int NumeroDeSerie;
    private String Marque;
    private String numImmatri;
    private String Type;
    private int Annee;
    private String Etat;
    private String Kilometrage;
    private boolean location;

    public Vehicule(int NumeroDeSerie, String Marque, String Type, int Annee, String Etat, String Kilometrage, String numImmatri) {
        this.NumeroDeSerie = NumeroDeSerie;
        this.Marque = Marque;
        this.Type = Type;
        this.Annee = Annee;
        this.Etat = Etat;
        this.Kilometrage = Kilometrage;
        this.numImmatri = numImmatri;
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

    public int getAnnee()
    {
        return Annee;
    }

    public void setAnnee(int annee)
    {
        Annee = annee;
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
}
