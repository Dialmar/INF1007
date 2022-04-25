package controleur;

public class Registre {
    private ControleurRapport controleurRapport;
    private ControleurRetour controleurRetour;
    private ControleurFacturation controleurFacturation;

private Registre() {
        controleurRapport = new ControleurRapport();
        controleurRetour = new ControleurRetour();
        controleurFacturation = new ControleurFacturation();
    }

    private static Registre instance = new Registre();
}
