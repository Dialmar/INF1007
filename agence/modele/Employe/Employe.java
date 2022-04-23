package modele.Employe;

public class Employe {
    String id;
    String nom;
    String prenom;
    String login;
    String password;

    public Employe(String id, String nom, String prenom, String login, String password) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.password = password;
    }

}
