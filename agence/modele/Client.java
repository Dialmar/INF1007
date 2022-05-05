package modele;

import java.util.regex.Pattern;

public class Client {
    //public int id;
    private static final String EMAIL_REGEX_PATTERN = "^(.+)@(.+).(.+)$";
    private String nom;
    private String prenom;
    private String adresse;
    private String password;
    private String telephone;
    private String email;
    private String NumeroCarte;
    private String NumeroDePermis;
    private String dateDeCreation;
    private String NumeroDeCarteBancaire;

    public Client(String nom, String prenom, String adresse, String password, String telephone, String email, String numeroCarte, String numeroDePermis, String dateDeCreation, String numeroDeCarteBancaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.password = password;
        this.telephone = telephone;
        this.email = email;
        NumeroCarte = numeroCarte;
        NumeroDePermis = numeroDePermis;
        this.dateDeCreation = dateDeCreation;
        NumeroDeCarteBancaire = numeroDeCarteBancaire;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroCarte() {
        return NumeroCarte;
    }

    public void setNumeroCarte(String numeroCarte) {
        NumeroCarte = numeroCarte;
    }

    public String getNumeroDePermis() {
        return NumeroDePermis;
    }

    public void setNumeroDePermis(String numeroDePermis) {
        NumeroDePermis = numeroDePermis;
    }

    public String getDateDeCreation() {
        return dateDeCreation;
    }

    public void setDateDeCreation(String dateDeCreation) {
        this.dateDeCreation = dateDeCreation;
    }

    public String getNumeroDeCarteBancaire() {
        return NumeroDeCarteBancaire;
    }

    public void setNumeroDeCarteBancaire(String numeroDeCarteBancaire) {
        NumeroDeCarteBancaire = numeroDeCarteBancaire;
    }


    private void isValidEmail(final String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX_PATTERN);

        if(!pattern.matcher(email).matches()) {
            throw new IllegalArgumentException("Invalid email");
        }
    }
    @Override
    public String toString() {
        return "DossierPersonnel{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", password='" + password + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", NumeroCarte='" + NumeroCarte + '\'' +
                ", NumeroDePermis='" + NumeroDePermis + '\'' +
                ", dateDeCreation='" + dateDeCreation + '\'' +
                ", NumeroDeCarteBancaire='" + NumeroDeCarteBancaire + '\'' +
                '}';
    }

}
