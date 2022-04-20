package modele;

public enum TypeVehicule {
    Prestige,
    Utilitaire,
    simple;
    public int prix;
    public int NombrePlace;

    public int getPrix() {
        return prix;
    }

    public int getNombrePlace() {
        return NombrePlace;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public void setNombrePlace(int nombrePlace) {
        NombrePlace = nombrePlace;
    }
}


// TypeVehicule



