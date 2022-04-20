package modele;

public class Vehicule {
    public int NumeroDeSerie;
    public String Marque;
    public String Type;
    public int Annee;
    public String Etat;
    public String Kilometrage;

    public Vehicule(int NumeroDeSerie, String Marque, String Type, int Annee, String Etat, String Kilometrage) {
        this.NumeroDeSerie = NumeroDeSerie;
        this.Marque = Marque;
        this.Type = Type;
        this.Annee = Annee;
        this.Etat = Etat;
        this.Kilometrage = Kilometrage;
    }


}
