package modele;

public class Vehicule {
    private int NumeroDeSerie;
    private String Marque;
    private String Type;
    private int Annee;
    private String Etat;
    private String Kilometrage;

    public Vehicule(int NumeroDeSerie, String Marque, String Type, int Annee, String Etat, String Kilometrage) {
        this.NumeroDeSerie = NumeroDeSerie;
        this.Marque = Marque;
        this.Type = Type;
        this.Annee = Annee;
        this.Etat = Etat;
        this.Kilometrage = Kilometrage;
    }


}
